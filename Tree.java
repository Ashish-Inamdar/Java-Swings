package menuDialog;

import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Tree Component");
		DefaultMutableTreeNode parent = new DefaultMutableTreeNode("Color", true);
		DefaultMutableTreeNode black = new DefaultMutableTreeNode("Black", true);
		DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue", true);
		DefaultMutableTreeNode nBlue = new DefaultMutableTreeNode("Navy Blue", true);
		DefaultMutableTreeNode dBlue = new DefaultMutableTreeNode("Dark Blue", true);
		DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green", true);
		DefaultMutableTreeNode white = new DefaultMutableTreeNode("White", true);
		
		parent.add(black);
		parent.add(blue);
		parent.add(nBlue); 
		parent.add(dBlue);
		parent.add(green);
		parent.add(white);
		
		JTree tree = new JTree(parent);
		frame.add(tree);
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		frame.setSize(200, 200);
		frame.setVisible(true);

	}

}
