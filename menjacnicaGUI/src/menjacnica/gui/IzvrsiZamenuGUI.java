package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JLabel lblValuta;
	private JLabel lblProdajniKurs;
	private JTextField kupovniKursTextField;
	private JTextField prodajniKursTextField;
	private JComboBox valutaComboBox;
	private JLabel lblIznos;
	private JTextField iznosTextField;
	private JLabel lblVrstaTransakcije;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getKupovniKursTextField());
		contentPane.add(getProdajniKursTextField());
		contentPane.add(getValutaComboBox());
		contentPane.add(getLblIznos());
		contentPane.add(getIznosTextField());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(10, 11, 86, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(176, 11, 46, 14);
		}
		return lblValuta;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(266, 11, 79, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getKupovniKursTextField() {
		if (kupovniKursTextField == null) {
			kupovniKursTextField = new JTextField();
			kupovniKursTextField.setEditable(false);
			kupovniKursTextField.setBounds(10, 36, 155, 20);
			kupovniKursTextField.setColumns(10);
		}
		return kupovniKursTextField;
	}
	private JTextField getProdajniKursTextField() {
		if (prodajniKursTextField == null) {
			prodajniKursTextField = new JTextField();
			prodajniKursTextField.setEditable(false);
			prodajniKursTextField.setBounds(266, 36, 155, 20);
			prodajniKursTextField.setColumns(10);
		}
		return prodajniKursTextField;
	}
	private JComboBox getValutaComboBox() {
		if (valutaComboBox == null) {
			valutaComboBox = new JComboBox();
			valutaComboBox.addItem(new String("EUR"));
			valutaComboBox.addItem(new String("CHF"));
			valutaComboBox.addItem(new String("USD"));
			valutaComboBox.setBounds(176, 36, 80, 20);
		}
		return valutaComboBox;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(10, 87, 46, 14);
		}
		return lblIznos;
	}
	private JTextField getIznosTextField() {
		if (iznosTextField == null) {
			iznosTextField = new JTextField();
			iznosTextField.setBounds(10, 112, 195, 20);
			iznosTextField.setColumns(10);
			iznosTextField.setText("50");
		}
		return iznosTextField;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(283, 87, 101, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setBounds(283, 111, 109, 23);
			buttonGroup.add(rdbtnKupovina);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.setBounds(283, 137, 109, 23);
			buttonGroup.add(rdbtnProdaja);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					iznosTextField.setText(String.valueOf(slider.getValue()));
				}
			});
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setBounds(10, 167, 424, 58);
		}
		return slider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String text;
					if(rdbtnKupovina.isSelected()) text = "Valuta: " + valutaComboBox.getSelectedItem().toString() + " Iznos: " +  iznosTextField.getText() + "  Kupovina";
					else text = "Valuta: " + valutaComboBox.getSelectedItem().toString() + " Iznos: " +  iznosTextField.getText() + "  Prodaja";
					MenjacnicaGUI.kursUStatus(text);
					dispose();
				}
			});
			btnIzvrsiZamenu.setBounds(20, 237, 162, 23);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(258, 236, 162, 23);
		}
		return btnOdustani;
	}
}
