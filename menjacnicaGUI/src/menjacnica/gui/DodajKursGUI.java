package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5078495917663362795L;
	private JPanel contentPane;
	private JLabel lblSifra;
	private JTextField sifraTextField;
	private JLabel lblNaziv;
	private JTextField nazivTextField;
	private JLabel lblProdajniKurs;
	private JTextField prodajniKursTextField;
	private JLabel lblKupovniKurs;
	private JTextField kupovniKursTextField;
	private JLabel lblSrednjiKurs;
	private JTextField srednjiKursTextField;
	private JLabel lblSkraceniNaziv;
	private JTextField skraceniNazivTextField;
	private JButton btnDodaj;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
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
	public DodajKursGUI() {
		setTitle("Dodaj kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getSifraTextField());
		contentPane.add(getLblNaziv());
		contentPane.add(getNazivTextField());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getProdajniKursTextField());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getKupovniKursTextField());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getSrednjiKursTextField());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getSkraceniNazivTextField());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(10, 11, 46, 14);
		}
		return lblSifra;
	}
	private JTextField getSifraTextField() {
		if (sifraTextField == null) {
			sifraTextField = new JTextField();
			sifraTextField.setBounds(10, 36, 201, 20);
			sifraTextField.setColumns(10);
		}
		return sifraTextField;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(221, 11, 46, 14);
		}
		return lblNaziv;
	}
	private JTextField getNazivTextField() {
		if (nazivTextField == null) {
			nazivTextField = new JTextField();
			nazivTextField.setBounds(221, 36, 213, 20);
			nazivTextField.setColumns(10);
		}
		return nazivTextField;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 81, 100, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getProdajniKursTextField() {
		if (prodajniKursTextField == null) {
			prodajniKursTextField = new JTextField();
			prodajniKursTextField.setBounds(10, 106, 201, 20);
			prodajniKursTextField.setColumns(10);
		}
		return prodajniKursTextField;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(221, 81, 100, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getKupovniKursTextField() {
		if (kupovniKursTextField == null) {
			kupovniKursTextField = new JTextField();
			kupovniKursTextField.setBounds(221, 106, 213, 20);
			kupovniKursTextField.setColumns(10);
		}
		return kupovniKursTextField;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 150, 100, 14);
		}
		return lblSrednjiKurs;
	}
	private JTextField getSrednjiKursTextField() {
		if (srednjiKursTextField == null) {
			srednjiKursTextField = new JTextField();
			srednjiKursTextField.setBounds(10, 175, 201, 20);
			srednjiKursTextField.setColumns(10);
		}
		return srednjiKursTextField;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(221, 150, 100, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getSkraceniNazivTextField() {
		if (skraceniNazivTextField == null) {
			skraceniNazivTextField = new JTextField();
			skraceniNazivTextField.setBounds(221, 175, 213, 20);
			skraceniNazivTextField.setColumns(10);
		}
		return skraceniNazivTextField;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String text = "Sifra: " + sifraTextField.getText() + " Naziv: " + nazivTextField.getText() + 
							 					" Prodajni kurs: " + prodajniKursTextField.getText() + " Kupovni kurs: " + kupovniKursTextField.getText() +
							 					" Srednji kurs: " + srednjiKursTextField.getText() + " Skraceni naziv: " + skraceniNazivTextField.getText();
							 					
					MenjacnicaGUI.kursUStatus(text);
					dispose();
				}
			});
			btnDodaj.setBounds(10, 237, 201, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(221, 237, 213, 23);
		}
		return btnOdustani;
	}
}
