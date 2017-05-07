package menuDialog;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;

public class Spinner {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JSpinner");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpinnerModel model = new SpinnerDateModel();
		JSpinner sp = new JSpinner(model);
		JLabel label = new JLabel("Dates/Date");
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(label, BorderLayout.WEST);
		panel.add(sp, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(200, 90);
		frame.setVisible(true);
	}

}
