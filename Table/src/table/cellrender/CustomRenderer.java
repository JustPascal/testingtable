package table.cellrender;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

@SuppressWarnings("serial")
public class CustomRenderer extends DefaultTableCellRenderer {
	private int column;
	private int row;

	public CustomRenderer(int col, int row) {
		this.column = col;
		this.row = row;
	}

	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		Component c = super.getTableCellRendererComponent(table, value,isSelected, hasFocus, row, column);

		setBackground((column == this.column && row == this.row) ? Color.green: Color.white);
		return c;
	}
}
