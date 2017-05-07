package menuDialog;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class TabbedPane {

	public TabbedPane() {
		// TODO Auto-generated constructor stub
		JFrame f = new JFrame();

		JButton b1 = new JButton("First");
		JButton b2 = new JButton("Second");
		JButton b3 = new JButton("Third");

		JTabbedPane tp = new JTabbedPane();
		tp.add("First", b1);
		tp.add("Second", b2);
		tp.add("Third", b3);

		tp.createToolTip();

		f.add(tp);
		f.setSize(100, 100);
		f.setVisible(true);

	}
	public static void main(String[] args) {
		new TabbedPane();
	}
}
