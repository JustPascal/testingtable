package table.createtable;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTable;

import table.cellrender.CustomRenderer;

public class CreateTable implements MouseListener {

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

		String[] entetes = new String[headerLength];
		for (int i = 0; i < headerLength; i++)
			entetes[i] = "";

		tableau = new JTable(donnees, entetes);
		tableau.setCellSelectionEnabled(true);
		mainFrame.getContentPane().add(tableau);
		mainFrame.getContentPane().add(tableau, BorderLayout.CENTER);

		// -- -- -- -- -- -- -- -- Testing Actionlistenners -- -- -- -- -- -- --
		// -- -- -- -

		tableau.addMouseListener(this);

		// -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
		// -- -- -- --

	}

	public void showTable() {
		// affiche le tableau
		mainFrame.pack();
	}

	@Override
	public void mouseClicked(MouseEvent mouseEvent) {
		int column = tableau.columnAtPoint(mouseEvent.getPoint());
		int row = tableau.rowAtPoint(mouseEvent.getPoint());
		System.out.println(" " + column + " " + row);

		tableau.getColumnModel().getColumn(column)
				.setCellRenderer(new CustomRenderer(column, row));

	}

	@Override
	public void mouseEntered(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseExited(MouseEvent mouseEvent) {

	}

	@Override
	public void mousePressed(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseReleased(MouseEvent mouseEvent) {

	}

}
