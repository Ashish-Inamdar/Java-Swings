package menuDialog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooser {
public static void main(String[] args) {
	JFrame f=new JFrame("ColorChooser");
	JButton b=new JButton("Click to change Background");
	
	ActionListener actionListener=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Color initial=b.getBackground();
			Color background=JColorChooser.showDialog(null, "ColorChooser", initial);
			if(background!=null){
				b.setBackground(background);
			}
		}
	};
	b.addActionListener(actionListener);
	f.add(b,BorderLayout.CENTER);
	f.setSize(300,200);
	f.setVisible(true);
}
}
