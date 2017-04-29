package menjacnica.model;

import javax.swing.table.AbstractTableModel;

public class TabelaModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 969185125294967263L;

	public String[] kolone = {"Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"};
	
	@Override
	public int getColumnCount() {
		return kolone.length;
	}

	@Override
	public int getRowCount() {
		return 10;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getColumnName(int column) {
		return kolone[column];
	}

}
