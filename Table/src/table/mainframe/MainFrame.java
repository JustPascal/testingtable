package table.mainframe;

import javax.swing.JFrame;

import table.menu.bar.Menubar;

public class MainFrame extends JFrame{

	private JFrame mainFrame = new JFrame();
	
	private String frameName = "The Real Thing";
	
	private Menubar menuBar = new Menubar(mainFrame);

	public MainFrame(){
		mainFrame.setSize(400, 400);
		mainFrame.setTitle(frameName);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setJMenuBar(menuBar.getMenubar());
		mainFrame.setVisible(true);
	}
	
	public JFrame getMainFrame(){
		return mainFrame;
	}
	
}
