package menuDialog;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar extends JFrame {
	JProgressBar jb;
	int i = 0, num = 0;

	public ProgressBar() {
		// TODO Auto-generated constructor stub

		jb = new JProgressBar(0, 2000);
		jb.setBounds(40, 40, 200, 200);

		jb.setValue(0);
		jb.setStringPainted(true);

		add(jb);
		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void iterate() {
		while (i <= 2000) {
			jb.setValue(i);
			i += 20;
			try {
				Thread.sleep(150);

			} catch (Exception e) {
				// TODO: handle exception

			}

		}

	}

	public static void main(String[] args) {
		ProgressBar m = new ProgressBar();
		m.setVisible(true);
		m.iterate();
	}
}
