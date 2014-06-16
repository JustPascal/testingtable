package table.mainframe;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import table.ecouteur.MainFrameWindowListener;
import table.menu.bar.Menubar;

public class MainFrame extends JFrame {

	private Menubar menuBar = new Menubar(this);

	public MainFrame() {
		setTitle("Draw me an Idea o_O");
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		setSize(d.width / 2, d.height / 2);
		MainFrameWindowListener ec = new MainFrameWindowListener();
		addWindowListener(ec);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setJMenuBar(menuBar.getMenubar());
		setVisible(true);
	}

}
