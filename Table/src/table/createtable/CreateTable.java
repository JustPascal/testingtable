package table.createtable;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class CreateTable {

	private JFrame mainFrame;

	private int rowLength;

	private int columnLength;

	private Object[][] donnees;

	private JTable tableau;

	public CreateTable(JFrame mainframe, int rowlength, int columnlength) {
		this.mainFrame = mainframe;
		this.rowLength = rowlength;
		this.columnLength = columnlength;
		
		int headerLength = columnLength;

		donnees = new String[rowLength][columnLength];
		for (int i = 0; i < rowLength; i++)
			for (int z = 0; z < columnLength; z++)
				donnees[i][z] = null;

		String[] entetes = new String[10];
		for (int i = 0; i < headerLength; i++)
			entetes[i] = "";

		tableau = new JTable(donnees, entetes);
		mainFrame.getContentPane().add(tableau);
		mainFrame.getContentPane().add(tableau, BorderLayout.CENTER);
	}

	public void showTable() {
		// affiche le tableau
		mainFrame.pack();
	}

}
