package menjacnica.gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1864113379858662393L;
	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv_1;
	private JTextField sifraTextField;
	private JTextField nazivTextField;
	private JLabel lblProdajniKurs;
	private JTextField prodajniKursTextField;
	private JLabel lblKupovniKurs;
	private JTextField kupovniKursTextField;
	private JLabel lblSrednjiKurs;
	private JTextField srednjiKursTextField;
	private JLabel lblSkraceniNaziv;
	private JTextField skraceniNazivTextField;
	private JCheckBox chckbxZaistaObrisiKurs;
	private JButton btnObrisi;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setTitle("Obrisi kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv_1());
		contentPane.add(getSifraTextField());
		contentPane.add(getNazivTextField());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getProdajniKursTextField());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getKupovniKursTextField());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getSrednjiKursTextField());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getSkraceniNazivTextField());
		contentPane.add(getChckbxZaistaObrisiKurs());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(10, 11, 46, 14);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv_1() {
		if (lblNaziv_1 == null) {
			lblNaziv_1 = new JLabel("Naziv");
			lblNaziv_1.setBounds(220, 11, 46, 14);
		}
		return lblNaziv_1;
	}
	private JTextField getSifraTextField() {
		if (sifraTextField == null) {
			sifraTextField = new JTextField();
			sifraTextField.setEditable(false);
			sifraTextField.setBounds(10, 31, 200, 20);
			sifraTextField.setColumns(10);
		}
		return sifraTextField;
	}
	private JTextField getNazivTextField() {
		if (nazivTextField == null) {
			nazivTextField = new JTextField();
			nazivTextField.setEditable(false);
			nazivTextField.setBounds(220, 31, 214, 20);
			nazivTextField.setColumns(10);
		}
		return nazivTextField;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 72, 86, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getProdajniKursTextField() {
		if (prodajniKursTextField == null) {
			prodajniKursTextField = new JTextField();
			prodajniKursTextField.setEditable(false);
			prodajniKursTextField.setBounds(10, 97, 200, 20);
			prodajniKursTextField.setColumns(10);
		}
		return prodajniKursTextField;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(220, 72, 86, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getKupovniKursTextField() {
		if (kupovniKursTextField == null) {
			kupovniKursTextField = new JTextField();
			kupovniKursTextField.setEditable(false);
			kupovniKursTextField.setBounds(220, 97, 214, 20);
			kupovniKursTextField.setColumns(10);
		}
		return kupovniKursTextField;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 141, 74, 14);
		}
		return lblSrednjiKurs;
	}
	private JTextField getSrednjiKursTextField() {
		if (srednjiKursTextField == null) {
			srednjiKursTextField = new JTextField();
			srednjiKursTextField.setEditable(false);
			srednjiKursTextField.setBounds(10, 166, 200, 20);
			srednjiKursTextField.setColumns(10);
		}
		return srednjiKursTextField;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(220, 141, 86, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getSkraceniNazivTextField() {
		if (skraceniNazivTextField == null) {
			skraceniNazivTextField = new JTextField();
			skraceniNazivTextField.setEditable(false);
			skraceniNazivTextField.setBounds(220, 166, 214, 20);
			skraceniNazivTextField.setColumns(10);
		}
		return skraceniNazivTextField;
	}
	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxZaistaObrisiKurs.isSelected()) btnObrisi.setEnabled(true);
					if(!chckbxZaistaObrisiKurs.isSelected()) btnObrisi.setEnabled(false);
				}
			});
			chckbxZaistaObrisiKurs.setBounds(10, 200, 131, 23);
		}
		return chckbxZaistaObrisiKurs;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String text = "Sifra: " + sifraTextField.getText() + " Naziv: " + nazivTextField.getText() + 
		 					" Prodajni kurs: " + prodajniKursTextField.getText() + " Kupovni kurs: " + kupovniKursTextField.getText() +
		 					" Srednji kurs: " + srednjiKursTextField.getText() + " Skraceni naziv: " + skraceniNazivTextField.getText();
		 					
					MenjacnicaGUI.kursUStatus(text);
					dispose();
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(10, 237, 200, 23);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(220, 237, 214, 23);
		}
		return btnOdustani;
	}
}
