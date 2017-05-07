package menuDialog;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class Table extends JFrame {
	public Table() {
		// TODO Auto-generated constructor stub
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());

		String[] col = { "Name", "Subject" };

		Object[][] data = { { "Rohit", "Java" }, { "Sumit", "VB" }, { "Rutu", "SQL" } };

		JTable tb = new JTable(data, col);

		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;

		JScrollPane jp = new JScrollPane(tb, v, h);
		cp.add(jp, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		Table d=new Table();
		d.setSize(300, 300);
		d.setVisible(true);

	}
}
