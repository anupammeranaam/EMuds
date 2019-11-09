import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class StudentDashNew {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDashNew window = new StudentDashNew();
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
	public StudentDashNew() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(110, 120, 700, 400);
		frame.getContentPane().add(tabbedPane);
		
		JPanel profilePan = new JPanel();
		tabbedPane.addTab("Profile", null, profilePan, null);
		profilePan.setLayout(null);
		
		JLabel lblNameDb = new JLabel("New label");
		lblNameDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNameDb.setBounds(107, 18, 103, 45);
		profilePan.add(lblNameDb);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(10, 11, 87, 51);
		profilePan.add(lblName);
		
		JLabel lblUsn = new JLabel("USN :");
		lblUsn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsn.setBounds(10, 73, 87, 51);
		profilePan.add(lblUsn);
		
		JLabel lblClasId = new JLabel("Class Id :");
		lblClasId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblClasId.setBounds(10, 135, 87, 51);
		profilePan.add(lblClasId);
		
		JLabel lblDept = new JLabel("Dept. :");
		lblDept.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDept.setBounds(10, 197, 87, 51);
		profilePan.add(lblDept);
		
		JLabel lblDeptDb = new JLabel("New label");
		lblDeptDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDeptDb.setBounds(107, 203, 103, 45);
		profilePan.add(lblDeptDb);
		
		JLabel lblClassIdDb = new JLabel("New label");
		lblClassIdDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblClassIdDb.setBounds(107, 141, 103, 45);
		profilePan.add(lblClassIdDb);
		
		JLabel lblUsnDb = new JLabel("New label");
		lblUsnDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblUsnDb.setBounds(107, 79, 103, 45);
		profilePan.add(lblUsnDb);
		
		JLabel lblDob = new JLabel("DOB :");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDob.setBounds(295, 11, 87, 51);
		profilePan.add(lblDob);
		
		JLabel lblYear = new JLabel("Year :");
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblYear.setBounds(295, 73, 131, 51);
		profilePan.add(lblYear);
		
		JLabel lblPhone = new JLabel("Phone No :");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPhone.setBounds(295, 135, 131, 51);
		profilePan.add(lblPhone);
		
		JLabel lblEmail = new JLabel("Email ID :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(295, 197, 131, 51);
		profilePan.add(lblEmail);
		
		JLabel lblEmailDb = new JLabel("New label");
		lblEmailDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblEmailDb.setBounds(455, 203, 103, 45);
		profilePan.add(lblEmailDb);
		
		JLabel lblPhoneDb = new JLabel("New label");
		lblPhoneDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblPhoneDb.setBounds(455, 141, 103, 45);
		profilePan.add(lblPhoneDb);
		
		JLabel lblYearDb = new JLabel("New label");
		lblYearDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblYearDb.setBounds(455, 73, 103, 45);
		profilePan.add(lblYearDb);
		
		JLabel lblDobDb = new JLabel("New label");
		lblDobDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDobDb.setBounds(455, 14, 103, 45);
		profilePan.add(lblDobDb);
		
		JLabel lblProctor = new JLabel("Proctor :");
		lblProctor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProctor.setBounds(10, 261, 87, 51);
		profilePan.add(lblProctor);
		
		JLabel lblProctorDb = new JLabel("New label");
		lblProctorDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblProctorDb.setBounds(107, 267, 103, 45);
		profilePan.add(lblProctorDb);
		
		JPanel atnPan = new JPanel();
		tabbedPane.addTab("Attendance", null, atnPan, null);
		atnPan.setLayout(null);
		
		JButton btnAtnSub1 = new JButton("Subject1");
		btnAtnSub1.setBounds(10, 62, 132, 34);
		atnPan.add(btnAtnSub1);
		
		JButton btnAtnSub2 = new JButton("Subject2");
		btnAtnSub2.setBounds(10, 107, 132, 34);
		atnPan.add(btnAtnSub2);
		
		JButton btnAtnSub3 = new JButton("Subject3");
		btnAtnSub3.setBounds(10, 152, 132, 34);
		atnPan.add(btnAtnSub3);
		
		JButton btnAtnSub4 = new JButton("Subject4");
		btnAtnSub4.setBounds(177, 62, 132, 34);
		atnPan.add(btnAtnSub4);
		
		JButton btnAtnSub5 = new JButton("Subject5");
		btnAtnSub5.setBounds(177, 107, 132, 34);
		atnPan.add(btnAtnSub5);
		
		JButton btnAtnSub6 = new JButton("Subject6");
		btnAtnSub6.setBounds(177, 152, 132, 34);
		atnPan.add(btnAtnSub6);
		
		JButton btnAtnLab1 = new JButton("Lab1");
		btnAtnLab1.setBounds(10, 197, 132, 34);
		atnPan.add(btnAtnLab1);
		
		JButton btnAtnLab2 = new JButton("Lab2");
		btnAtnLab2.setBounds(177, 197, 132, 34);
		atnPan.add(btnAtnLab2);
		
		JButton btnAtnBack = new JButton("BACK");
		btnAtnBack.setBounds(94, 299, 152, 62);
		atnPan.add(btnAtnBack);
		
		JPanel marksPan = new JPanel();
		tabbedPane.addTab("Marks", null, marksPan, null);
		marksPan.setLayout(null);
		
		JLabel lblInternal1 = new JLabel("Internal 1 :");
		lblInternal1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInternal1.setBounds(410, 67, 90, 20);
		marksPan.add(lblInternal1);
		
		JLabel lblInternal2 = new JLabel("Internal 2 :");
		lblInternal2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInternal2.setBounds(410, 107, 90, 20);
		marksPan.add(lblInternal2);
		
		JLabel lblInternal3 = new JLabel("Internal 3 :");
		lblInternal3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInternal3.setBounds(410, 152, 90, 20);
		marksPan.add(lblInternal3);
		
		JLabel lblInternal1Db = new JLabel("Internal 1 :");
		lblInternal1Db.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInternal1Db.setBounds(517, 67, 90, 20);
		marksPan.add(lblInternal1Db);
		
		JLabel lblInternal2Db = new JLabel("Internal 1 :");
		lblInternal2Db.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInternal2Db.setBounds(517, 107, 90, 20);
		marksPan.add(lblInternal2Db);
		
		JLabel lblInternal3Db = new JLabel("Internal 1 :");
		lblInternal3Db.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInternal3Db.setBounds(517, 152, 90, 20);
		marksPan.add(lblInternal3Db);
		
		lblInternal1Db.setVisible(false);
		lblInternal2Db.setVisible(false);
		lblInternal3Db.setVisible(false);
		
		lblInternal1.setVisible(false);
		lblInternal2.setVisible(false);
		lblInternal3.setVisible(false);
		
		JButton btnMarksSub1 = new JButton("Subject1");
		btnMarksSub1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				lblInternal1Db.setVisible(true);
				lblInternal2Db.setVisible(true);
				lblInternal3Db.setVisible(true);
				
				lblInternal1.setVisible(true);
				lblInternal2.setVisible(true);
				lblInternal3.setVisible(true);
				
				lblInternal1.setText("Internal 1 :");
			}
		});
		btnMarksSub1.setBounds(10, 62, 132, 34);
		marksPan.add(btnMarksSub1);
		
		JButton btnMarksSub2 = new JButton("Subject2");
		btnMarksSub2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				lblInternal1Db.setVisible(true);
				lblInternal2Db.setVisible(true);
				lblInternal3Db.setVisible(true);
				
				lblInternal1.setVisible(true);
				lblInternal2.setVisible(true);
				lblInternal3.setVisible(true);
				
				lblInternal1.setText("Internal 1 :");
			}
		});
		btnMarksSub2.setBounds(10, 107, 132, 34);
		marksPan.add(btnMarksSub2);
		
		JButton btnMarksSub3 = new JButton("Subject3");
		btnMarksSub3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				lblInternal1Db.setVisible(true);
				lblInternal2Db.setVisible(true);
				lblInternal3Db.setVisible(true);
				
				lblInternal1.setVisible(true);
				lblInternal2.setVisible(true);
				lblInternal3.setVisible(true);
				
				lblInternal1.setText("Internal 1 :");
			}
		});
		btnMarksSub3.setBounds(10, 152, 132, 34);
		marksPan.add(btnMarksSub3);
		
		JButton btnMarksLab1 = new JButton("Lab1");
		btnMarksLab1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				lblInternal1Db.setVisible(true);
				
				lblInternal2Db.setVisible(false);
				lblInternal3Db.setVisible(false);
				lblInternal2.setVisible(false);
				lblInternal3.setVisible(false);
				
				lblInternal1.setVisible(true);
				lblInternal1.setText("Internal :");
			}
		});
		btnMarksLab1.setBounds(10, 197, 132, 34);
		marksPan.add(btnMarksLab1);
		
		JButton btnMarksLab2 = new JButton("Lab2");
		btnMarksLab2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				lblInternal1Db.setVisible(true);
				
				lblInternal2Db.setVisible(false);
				lblInternal3Db.setVisible(false);
				lblInternal2.setVisible(false);
				lblInternal3.setVisible(false);
				
				lblInternal1.setVisible(true);
				lblInternal1.setText("Internal :");
				
			}
		});
		btnMarksLab2.setBounds(177, 197, 132, 34);
		marksPan.add(btnMarksLab2);
		
		JButton btnMarksSub6 = new JButton("Subject6");
		btnMarksSub6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				lblInternal1Db.setVisible(true);
				lblInternal2Db.setVisible(true);
				lblInternal3Db.setVisible(true);
				
				lblInternal1.setVisible(true);
				lblInternal2.setVisible(true);
				lblInternal3.setVisible(true);
				
				lblInternal1.setText("Internal 1 :");
			}
		});
		btnMarksSub6.setBounds(177, 152, 132, 34);
		marksPan.add(btnMarksSub6);
		
		JButton btnMarksSub5 = new JButton("Subject5");
		btnMarksSub5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				lblInternal1Db.setVisible(true);
				lblInternal2Db.setVisible(true);
				lblInternal3Db.setVisible(true);
				
				lblInternal1.setVisible(true);
				lblInternal2.setVisible(true);
				lblInternal3.setVisible(true);
				
				lblInternal1.setText("Internal 1 :");
			}
		});
		btnMarksSub5.setBounds(177, 107, 132, 34);
		marksPan.add(btnMarksSub5);
		
		JButton btnMarksSub4 = new JButton("Subject4");
		btnMarksSub4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				lblInternal1Db.setVisible(true);
				lblInternal2Db.setVisible(true);
				lblInternal3Db.setVisible(true);
				
				lblInternal1.setVisible(true);
				lblInternal2.setVisible(true);
				lblInternal3.setVisible(true);
				
				lblInternal1.setText("Internal 1 :");
			}
		});
		btnMarksSub4.setBounds(177, 62, 132, 34);
		marksPan.add(btnMarksSub4);
		
		
		
		JButton btnMarksBack = new JButton("BACK");
		btnMarksBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				lblInternal1Db.setVisible(false);
				lblInternal2Db.setVisible(false);
				lblInternal3Db.setVisible(false);
				
				lblInternal1.setVisible(false);
				lblInternal2.setVisible(false);
				lblInternal3.setVisible(false);
			}
		});
		btnMarksBack.setBounds(94, 299, 152, 62);
		marksPan.add(btnMarksBack);
		
	}
}
