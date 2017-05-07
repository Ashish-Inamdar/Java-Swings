package menuDialog;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class ToolBar {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JToolBar toolBar = new JToolBar("A tool bar which can be dragged out");
		toolBar.setFloatable(true);
		toolBar.setRollover(true);

		toolBar.add(new JButton("New"));
		toolBar.addSeparator();
		toolBar.add(new JButton("Open"));
		toolBar.addSeparator();
		toolBar.add(new JButton("Anything Else"));

		frame.add(toolBar,"North");
		frame.setSize(500, 400);
		frame.setVisible(true);
	}
}
