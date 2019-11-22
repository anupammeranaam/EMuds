import java.awt.EventQueue;

import javax.swing.JFrame;


public class adminDash {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(int adminId , String adminName) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminDash window = new adminDash(adminId,adminName);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public adminDash(int adminId, String adminName) {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); 
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

}
