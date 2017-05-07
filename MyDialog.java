package menuDialog;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyDialog extends JDialog implements ActionListener{
	JTextField t1,parentTf;
	JButton b1,b2;
	String str;
	
	public MyDialog(JFrame parent,boolean modal,JTextField tf) {
		// TODO Auto-generated constructor stub
		super(parent,modal);
		setLayout(new FlowLayout());
		parentTf=tf;
		t1=new JTextField(10);
		b1=new JButton("OK");
		b2=new JButton("Cancle");
		add(t1);
		add(b1);	
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(100, 100);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			str=t1.getText();
			parentTf.setText(str);
			dispose();
		}
		if(e.getSource()==b2){
			dispose();
			parentTf.setText(" ");
		}
		
	}

}

