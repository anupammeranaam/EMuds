import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class studentDashboard 
{
	static int choice = 0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentDashboard window = new studentDashboard();
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
	public studentDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JLabel lblUsn = new JLabel("Usn");
		lblUsn.setBounds(10, 11, 89, 14);
		frame.getContentPane().add(lblUsn);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(109, 11, 89, 14);
		frame.getContentPane().add(lblName);

		JLabel lblClassId = new JLabel("Class ID");
		lblClassId.setBounds(218, 11, 89, 14);
		frame.getContentPane().add(lblClassId);

		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setBounds(316, 11, 89, 14);
		frame.getContentPane().add(lblBranch);

		lblUsn.setText("USN");
		lblName.setText("NAME");
		lblClassId.setText("Class ID");
		lblBranch.setText("BRANCH");

		JButton btnSub1 = new JButton("Subject 1");
		btnSub1.setBounds(188, 76, 100, 28);
		frame.getContentPane().add(btnSub1);

		JButton btnSub2 = new JButton("Subject 2");
		btnSub2.setBounds(316, 76, 100, 28);
		frame.getContentPane().add(btnSub2);

		JButton btnSub3 = new JButton("Subject 3");
		btnSub3.setBounds(188, 128, 100, 28);
		frame.getContentPane().add(btnSub3);

		JButton btnSub4 = new JButton("Subject 4");
		btnSub4.setBounds(316, 128, 100, 28);
		frame.getContentPane().add(btnSub4);

		JButton btnSub5 = new JButton("Subject 5");
		btnSub5.setBounds(188, 185, 100, 28);
		frame.getContentPane().add(btnSub5);

		JButton btnSub6 = new JButton("Subject 6");
		btnSub6.setBounds(316, 187, 100, 25);
		frame.getContentPane().add(btnSub6);

		JButton btnLab1 = new JButton("LAB 1");
		btnLab1.setBounds(188, 238, 100, 25);
		frame.getContentPane().add(btnLab1);

		JButton btnLab2 = new JButton("LAB 2");
		btnLab2.setBounds(316, 238, 100, 25);
		frame.getContentPane().add(btnLab2);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnSub1.setVisible(false);
				btnSub2.setVisible(false);
				btnSub3.setVisible(false);
				btnSub4.setVisible(false);
				btnSub5.setVisible(false);
				btnSub6.setVisible(false);
				btnLab1.setVisible(false);
				btnLab2.setVisible(false);
				btnBack.setVisible(false);
				
				choice = 0;

			}
		});

		btnSub1.setVisible(false);
		btnSub2.setVisible(false);
		btnSub3.setVisible(false);
		btnSub4.setVisible(false);
		btnSub5.setVisible(false);
		btnSub6.setVisible(false);
		btnLab1.setVisible(false);
		btnLab2.setVisible(false);
		btnBack.setVisible(false);

		JButton btnAttendance = new JButton("Attendance");
		btnAttendance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnSub1.setVisible(true);
				btnSub2.setVisible(true);
				btnSub3.setVisible(true);
				btnSub4.setVisible(true);
				btnSub5.setVisible(true);
				btnSub6.setVisible(true);
				btnLab1.setVisible(true);
				btnLab2.setVisible(true);

				btnBack.setVisible(true);
				
				choice = 1;		//signifies attendance
			}
		});
		btnAttendance.setBounds(10, 76, 140, 43);
		frame.getContentPane().add(btnAttendance);

		JButton btnMarks = new JButton("Marks");
		btnMarks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnSub1.setVisible(true);
				btnSub2.setVisible(true);
				btnSub3.setVisible(true);
				btnSub4.setVisible(true);
				btnSub5.setVisible(true);
				btnSub6.setVisible(true);
				btnLab1.setVisible(true);
				btnLab2.setVisible(true);

				btnBack.setVisible(true);
				
				choice = 2 ;		//Signifies marks
			}
		});
		btnMarks.setBounds(10, 149, 140, 43);
		frame.getContentPane().add(btnMarks);


		btnBack.setBounds(10, 258, 140, 43);
		frame.getContentPane().add(btnBack);


	}

}
