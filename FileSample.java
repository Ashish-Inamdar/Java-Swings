package menuDialog;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FileSample {
	public static void main(String[] args) {
		JFrame f=new JFrame("File Chooser Popup");
		Container contentPane=f.getContentPane();
		
		JLabel directoryLabel =new JLabel(" ");
		directoryLabel.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,36));
		contentPane.add(directoryLabel, BorderLayout.NORTH);
		
		JLabel filenameLabel =new JLabel(" ");
		filenameLabel.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,36));
		contentPane.add(filenameLabel, BorderLayout.SOUTH);
		
		
		JFileChooser fileChooser=new JFileChooser(".");
		fileChooser.setControlButtonsAreShown(true);
		contentPane.add(fileChooser,BorderLayout.CENTER);
		
		ActionListener actionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser theFileChooser=(JFileChooser) e.getSource();
				
				String a=e.getActionCommand();
				if(a.equals(JFileChooser.APPROVE_SELECTION)){
					File selectedFile=theFileChooser.getSelectedFile();
					directoryLabel.setText(selectedFile.getParent());
					filenameLabel.setText(selectedFile.getName());
				}
				else if(a.equals(JFileChooser.CANCEL_SELECTION)){
					directoryLabel.setText(" ");
					filenameLabel.setText(" ");
				}
			}
		};
		fileChooser.addActionListener(actionListener);
		f.pack();
		f.setVisible(true);
	}
}
