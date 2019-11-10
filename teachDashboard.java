import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class teachDashboard {

	static int choice = 0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teachDashboard window = new teachDashboard();
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
	public teachDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel();
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(132, 27, 119, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblId = new JLabel();
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(27, 27, 77, 14);
		frame.getContentPane().add(lblId);

		JLabel lblClassId = new JLabel();
		lblClassId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClassId.setBounds(258, 27, 77, 14);
		frame.getContentPane().add(lblClassId);
		
		JLabel lblDesig = new JLabel();
		lblDesig.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesig.setBounds(462, 27, 95, 14);
		frame.getContentPane().add(lblDesig);
		
		JLabel lblDept = new JLabel();
		lblDept.setText("Department");
		lblDept.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDept.setBounds(345, 27, 95, 14);
		frame.getContentPane().add(lblDept);

		lblName.setText("Teacher Name");
		lblId.setText("Teacher ID");
		lblClassId.setText("Class ID");
		lblDesig.setText("Designation");
		lblDept.setText("Depart");
		
		JButton btnCc1 = new JButton("ClassCode 1");
		btnCc1.setBounds(156, 85, 104, 23);
		frame.getContentPane().add(btnCc1);
		
		JButton btnCc2 = new JButton("ClassCode 2");
		btnCc2.setBounds(292, 85, 104, 23);
		frame.getContentPane().add(btnCc2);
		
		JButton btnCc3 = new JButton("ClassCode 3");
		btnCc3.setBounds(156, 114, 104, 23);
		frame.getContentPane().add(btnCc3);
		
		JButton btnCc4 = new JButton("ClassCode 4");
		btnCc4.setBounds(292, 114, 104, 23);
		frame.getContentPane().add(btnCc4);
		
		JButton btnCc5 = new JButton("ClassCode 5");
		btnCc5.setBounds(156, 143, 104, 23);
		frame.getContentPane().add(btnCc5);
		
		JButton btnCc6 = new JButton("ClassCode6");
		btnCc6.setBounds(292, 143, 104, 23);
		frame.getContentPane().add(btnCc6);
		
		btnCc1.setVisible(false);
		btnCc2.setVisible(false);
		btnCc3.setVisible(false);
		btnCc4.setVisible(false);
		btnCc5.setVisible(false);
		btnCc6.setVisible(false);
		
		
		
		JButton btnBack = new JButton("BACK");
		
		JButton btnAtn = new JButton("Attendance");
		btnAtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnCc1.setVisible(true);
				btnCc2.setVisible(true);
				btnCc3.setVisible(true);
				btnCc4.setVisible(true);
				btnCc5.setVisible(true);
				btnCc6.setVisible(true);
		
				btnBack.setVisible(true);
				
				choice = 1;		//signifies class code for attendance
				
			}
		});
		btnAtn.setBounds(27, 85, 119, 50);
		frame.getContentPane().add(btnAtn);
		
		JButton btnView = new JButton("View");
		JButton btnUpd = new JButton("Update");
		btnUpd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnUpd.setVisible(false);
				btnView.setVisible(false);
				
				btnCc1.setVisible(true);
				btnCc2.setVisible(true);
				btnCc3.setVisible(true);
				btnCc4.setVisible(true);
				btnCc5.setVisible(true);
				btnCc6.setVisible(true);
				
				btnBack.setVisible(true);
				
				choice = 2;		//signifies class code for updating marks
			}
		});
		btnUpd.setBounds(292, 174, 95, 23);
		frame.getContentPane().add(btnUpd);
		
		
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnUpd.setVisible(false);
				btnView.setVisible(false);
				
				btnCc1.setVisible(true);
				btnCc2.setVisible(true);
				btnCc3.setVisible(true);
				btnCc4.setVisible(true);
				btnCc5.setVisible(true);
				btnCc6.setVisible(true);
				
				btnBack.setVisible(true);
				
				choice = 3;		//signifies class code for view attendance
			}
		});
		btnView.setBounds(156, 174, 95, 23);
		frame.getContentPane().add(btnView);
		
		btnUpd.setVisible(false);
		btnView.setVisible(false);
		
		JButton btnMarks = new JButton("Marks");
		btnMarks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnUpd.setVisible(true);
				btnView.setVisible(true);
				
				btnBack.setVisible(true);

			}
		});
		btnMarks.setBounds(27, 160, 119, 50);
		frame.getContentPane().add(btnMarks);
		
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnCc1.setVisible(false);
				btnCc2.setVisible(false);
				btnCc3.setVisible(false);
				btnCc4.setVisible(false);
				btnCc5.setVisible(false);
				btnCc6.setVisible(false);
				
				btnView.setVisible(false);
				btnUpd.setVisible(false);
				btnBack.setVisible(false);
				
				choice = 0; 
			}
		});
		btnBack.setBounds(384, 251, 177, 50);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewStudent = new JButton("New Student");
		btnNewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnCc1.setVisible(true);
				btnCc2.setVisible(true);
				btnCc3.setVisible(true);
				btnCc4.setVisible(true);
				btnCc5.setVisible(true);
				btnCc6.setVisible(true);
				
				btnBack.setVisible(true);
				
				choice = 4;		//signifies new student
			}
		});
		btnNewStudent.setBounds(27, 235, 145, 50);
		frame.getContentPane().add(btnNewStudent);
		btnBack.setVisible(false);

		
	}
}
