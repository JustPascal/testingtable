package table.color.bar;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Colorbar extends JToolBar implements ActionListener {

	private JToolBar colorBar;

	private JButton greenColor;

	private JButton redColor;

	private JButton blueColor;

	private JButton yellowColor;

	private JButton grayColor;

	private JButton orangeColor;

	private Color color;

	public Colorbar(JFrame mainframe) {
		colorBar = new JToolBar();

		// colors
		greenColor = new JButton("green");
		redColor = new JButton("red");
		blueColor = new JButton("blue");
		yellowColor = new JButton("yellow");
		grayColor = new JButton("gray");
		orangeColor = new JButton("orange");

		greenColor.addActionListener(this);
		redColor.addActionListener(this);
		blueColor.addActionListener(this);
		yellowColor.addActionListener(this);
		grayColor.addActionListener(this);
		orangeColor.addActionListener(this);

		colorBar.add(greenColor);
		colorBar.addSeparator();
		colorBar.add(redColor);
		colorBar.addSeparator();
		colorBar.add(blueColor);
		colorBar.addSeparator();
		colorBar.add(yellowColor);
		colorBar.addSeparator();
		colorBar.add(grayColor);
		colorBar.addSeparator();
		colorBar.add(orangeColor);
	}

	public JToolBar getColorbar() {
		return colorBar;
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getSource().equals(greenColor)) {
			color = Color.green;
		}
		if (event.getSource().equals(redColor)) {
			color = Color.red;
		}
		if (event.getSource().equals(blueColor)) {
			color = Color.blue;
		}
		if (event.getSource().equals(yellowColor)) {
			color = Color.yellow;
		}
		if (event.getSource().equals(grayColor)) {
			color = Color.GRAY;
		}
		if (event.getSource().equals(orangeColor)) {
			color = Color.orange;
		}

	}

	public Color getColorForBackGround() {
		return color;

	}

}
