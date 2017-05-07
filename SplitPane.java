package menuDialog;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class SplitPane {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		
		JComponent topButton=new JButton("Left");
		JComponent bottomButton=new JButton("Right");
		
		
		JSplitPane sp =new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		sp.setLeftComponent(topButton);
		sp.setRightComponent(bottomButton);
		f.add(sp,BorderLayout.CENTER);
		f.setSize(150,150);
		f.setVisible(true);
		sp.setDividerLocation(0.5);
		
	}

}
