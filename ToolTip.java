package menuDialog;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ToolTip {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JButton b=new JButton("Button");
		frame.add(b,BorderLayout.NORTH);
		b.setToolTipText("A button component");
		frame.setSize(300,200);
		frame.setVisible(true);
	}
}
