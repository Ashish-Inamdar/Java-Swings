package menuDialog;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Menu extends JFrame {
	@SuppressWarnings("unused")
	Menu(){
		JMenuBar mb=new JMenuBar(); //Creates JMenuBar
		setJMenuBar(mb); //add JMenuBar to JFrame
		
		
		//Creates JMenu
		JMenu file=new JMenu("File");
		JMenu edit=new JMenu("Edit");
		JMenu format=new JMenu("Format");
		
		//Add JMenu to JMenuBar
		mb.add(edit);
		mb.add(format);
		
		//Create JMenuItem
		JMenuItem cut =new JMenuItem("Cut");
		JMenuItem copy =new JMenuItem("Copy");
		JMenuItem paste =new JMenuItem("Paste");
		
		//Add JMenuItem to JMenu
		edit.add(cut);
		edit.addSeparator();
		edit.add(copy);
		edit.addSeparator();
		edit.add(paste);
	}
	public static void main(String[] args) {
		Menu m=new Menu();
		m.setSize(500,500);
		m.setVisible(true);
	}
	

}
