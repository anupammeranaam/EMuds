import java.awt.EventQueue;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class startLogo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try 
				{
					startLogo window = new startLogo();
					window.frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public startLogo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		Timer time = new Timer();
		time.schedule(new TimerTask()
		{
			@Override
			public void run()
			{
				frame.dispose();
				loginSignup lobj = new loginSignup();
				lobj.main(null);
			}
		}, 3500);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Anupam Mishra\\Pictures\\emuds2.png"));
		lblNewLabel.setBounds(0, 0, 500, 500);
		frame.getContentPane().add(lblNewLabel);
	
	
	}
}
