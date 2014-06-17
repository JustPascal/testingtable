package table.internalframe;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import table.createtable.CreateTable;
import table.mainframe.MainFrame;

public class PersonnalInternalFrame extends JInternalFrame implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonnalInternalFrame(MainFrame mainFrame) {
		setTitle(nameInternalFrame());
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		setSize(d.width / 4, d.height / 4);
		setMaximizable(true);
		setIconifiable(true);
		setResizable(true);
		setClosable(true);
		setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		createTableInInternalFrame();
		mainFrame.addPersonnalIntenalFrameToDeskTop(this);
	}

	private void createTableInInternalFrame() {
		new CreateTable(this, 3, 10);
	}

	public PersonnalInternalFrame getPersonnalInternalFrame() {
		return this;
	}

	private String nameInternalFrame(){
		return JOptionPane.showInputDialog("Donnez un nom ˆ votre fichier");
	}
	@Override
	public void run() {
	}
}
