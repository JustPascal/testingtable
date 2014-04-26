package table.menu.bar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import table.createtable.CreateTable;

public class Menubar extends JMenuBar implements ActionListener {

	private JFrame mainFrame;

	private JMenuBar menuBar;

	private JMenu file = new JMenu("File");

	private JMenu help = new JMenu("Help");

	private JMenuItem newFile = new JMenuItem("New File");

	private JMenuItem saveFile = new JMenuItem("Save File");

	private JMenuItem exitFile = new JMenuItem("Exit File");

	public Menubar(JFrame mainframe) {
		this.mainFrame = mainframe;
		menuBar = new JMenuBar();

		newFile.addActionListener(this);
		saveFile.addActionListener(this);
		exitFile.addActionListener(this);

		file.add(newFile);
		file.add(saveFile);
		file.add(exitFile);

		menuBar.add(file);
		menuBar.add(help);

	}

	public JMenuBar getMenubar() {
		return menuBar;
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getSource().equals(newFile)) {
			System.out.println("New File");
			CreateTable createTable = new CreateTable(mainFrame, 3, 10);
			createTable.showTable();
		}
		if (event.getSource().equals(saveFile))
			System.out.println("Save File");
		if (event.getSource().equals(exitFile))
			System.out.println("Exit File");

	}

}
