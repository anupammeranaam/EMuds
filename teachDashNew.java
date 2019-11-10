import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JScrollPane;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTable;



public class teachDashNew {

	private JFrame frame;
	private JTextField tfNameS;
	private JTextField tfUsnS;
	private JTextField tfClassIdS;
	private JTextField tfDeptS;
	private JTextField tfdesigS;
	private JTextField txtDobDd;
	private JTextField txtDobMm;
	private JTextField txtDobYy;
	private JTextField txtSubject1AddS;
	private JTextField txtSubject2AddS;
	private JTextField txtSubjectAddS3;
	private JTextField txtSubject4AddS;
	private JTextField txtSubject5AddS;
	private JTextField txtSubject6AddS;
	private JTextField txtSubject7AddS;
	private JTextField txtSubject8AddS;
	private JTextField textFieldEmailAddS;
	private JTextField textFieldPhoneAddS;
	private JTextField textFieldNameAddT;
	private JTextField textFieldDobAddT;
	private JTextField textFieldEmailAddT;
	private JTextField textFieldDojAddT;
	private JTextField textFieldPhoneAddT;
	private JTextField textFieldProctorId;
	private JPasswordField OldPass;
	private JPasswordField NewPass;
	private JPasswordField ConfirmPass;
	private JTextField tfAbPtT;
	static int countIdT = 0;
	static int yBoundT = 57;
	private JTable atnTabS;
	static boolean atnMatT[][];
	private JTextField tfAtnS;
	static int yBoundS = 85 ;
	static int choiceAtnS =0;
	static boolean atnMatS[][];
	static int countUsnS =0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teachDashNew window = new teachDashNew();
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
	public teachDashNew() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(110, 120, 700, 400);
		frame.getContentPane().add(tabbedPane);

		JPanel profilePanel = new JPanel();
		tabbedPane.addTab("Profile", profilePanel);
		profilePanel.setLayout(null);

		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(10, 11, 87, 51);
		profilePanel.add(lblName);

		JLabel lblId = new JLabel("ID :");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblId.setBounds(10, 73, 87, 51);
		profilePanel.add(lblId);

		JLabel lblClassid = new JLabel("Class Id :");
		lblClassid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblClassid.setBounds(10, 135, 87, 51);
		profilePanel.add(lblClassid);

		JLabel lblDept = new JLabel("Dept. :");
		lblDept.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDept.setBounds(10, 197, 87, 51);
		profilePanel.add(lblDept);

		JLabel lblDesig = new JLabel("Desig. :");
		lblDesig.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDesig.setBounds(10, 254, 87, 51);
		profilePanel.add(lblDesig);

		JLabel lblNameDb = new JLabel("New label");
		lblNameDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNameDb.setBounds(107, 18, 103, 45);
		profilePanel.add(lblNameDb);

		JLabel lblIdDb = new JLabel("New label");
		lblIdDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblIdDb.setBounds(107, 79, 103, 45);
		profilePanel.add(lblIdDb);

		JLabel lblClassId = new JLabel("New label");
		lblClassId.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblClassId.setBounds(107, 141, 103, 45);
		profilePanel.add(lblClassId);

		JLabel lblDeptDb = new JLabel("New label");
		lblDeptDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDeptDb.setBounds(107, 203, 103, 45);
		profilePanel.add(lblDeptDb);

		JLabel lblDesigDb = new JLabel("New label");
		lblDesigDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDesigDb.setBounds(107, 260, 103, 45);
		profilePanel.add(lblDesigDb);

		JLabel lblDob = new JLabel("DOB :");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDob.setBounds(295, 11, 87, 51);
		profilePanel.add(lblDob);

		JLabel lblDateOfJoin = new JLabel("Date Of Join :");
		lblDateOfJoin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDateOfJoin.setBounds(295, 73, 131, 51);
		profilePanel.add(lblDateOfJoin);

		JLabel lblPhoneNo = new JLabel("Phone No :");
		lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPhoneNo.setBounds(295, 135, 131, 51);
		profilePanel.add(lblPhoneNo);

		JLabel lblEmailId = new JLabel("Email ID :");
		lblEmailId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmailId.setBounds(295, 197, 131, 51);
		profilePanel.add(lblEmailId);

		JLabel lblDobDb = new JLabel("New label");
		lblDobDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDobDb.setBounds(455, 14, 103, 45);
		profilePanel.add(lblDobDb);

		JLabel lblDojDb = new JLabel("New label");
		lblDojDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDojDb.setBounds(455, 73, 103, 45);
		profilePanel.add(lblDojDb);

		JLabel lblPhoneDb = new JLabel("New label");
		lblPhoneDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblPhoneDb.setBounds(455, 141, 103, 45);
		profilePanel.add(lblPhoneDb);

		JLabel lblEmailDb = new JLabel("New label");
		lblEmailDb.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblEmailDb.setBounds(455, 203, 103, 45);
		profilePanel.add(lblEmailDb);

		JPanel atnSPan = new JPanel();
		tabbedPane.addTab("Attendance(S)", atnSPan);
		atnSPan.setLayout(null);

		JScrollPane atnScrollS = new JScrollPane();
		atnScrollS.setBounds(328, 57, 277, 243);
		atnSPan.add(atnScrollS);
		atnSPan.setVisible(false);
		atnScrollS.setVisible(false);

		JLabel lblStatusS = new JLabel("Status");
		lblStatusS.setBounds(615, 59, 46, 14);
		atnSPan.add(lblStatusS);

		tfAtnS = new JTextField();
		tfAtnS.setBounds(615, yBoundS, 31, 14);
		atnSPan.add(tfAtnS);
		tfAtnS.setColumns(10);

		lblStatusS.setVisible(false);
		tfAtnS.setVisible(false);


		JButton btnCc1 = new JButton("ClassCode 1");
		btnCc1.setBounds(198, 85, 104, 23);

		JButton btnCc2 = new JButton("ClassCode 2");
		btnCc2.setBounds(198, 114, 104, 23);

		JButton btnCc3 = new JButton("ClassCode 3");
		btnCc3.setBounds(198, 143, 104, 23);

		JButton btnCc4 = new JButton("ClassCode 4");
		btnCc4.setBounds(198, 176, 104, 23);

		JButton btnCc5 = new JButton("ClassCode 5");
		btnCc5.setBounds(198, 210, 104, 23);

		JButton btnCc6 = new JButton("ClassCode6");
		btnCc6.setBounds(198, 244, 104, 23);

		btnCc1.setVisible(false);
		btnCc2.setVisible(false);
		btnCc3.setVisible(false);
		btnCc4.setVisible(false);
		btnCc5.setVisible(false);
		btnCc6.setVisible(false);


		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnCc1.setVisible(false);
				btnCc2.setVisible(false);
				btnCc3.setVisible(false);
				btnCc4.setVisible(false);
				btnCc5.setVisible(false);
				btnCc6.setVisible(false);
				btnBack.setVisible(false);
				atnScrollS.setVisible(false);
				atnTabS.setVisible(false);
				lblStatusS.setVisible(false);
				tfAtnS.setVisible(false);
				countUsnS =0;
			}
		});
		btnBack.setBounds(549, 311, 110, 50);
		atnSPan.add(btnBack);

		JButton btnView = new JButton("View");

		atnSPan.add(btnCc1);
		atnSPan.add(btnCc2);
		atnSPan.add(btnCc3);
		atnSPan.add(btnCc4);
		atnSPan.add(btnCc5);
		atnSPan.add(btnCc6);
		atnSPan.add(btnView);

		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				choiceAtnS = 1;
				btnCc1.setVisible(true);
				btnCc2.setVisible(true);
				btnCc3.setVisible(true);
				btnCc4.setVisible(true);
				btnCc5.setVisible(true);
				btnCc6.setVisible(true);

				btnBack.setVisible(true);

				lblStatusS.setVisible(false);
				tfAtnS.setVisible(false);
			}
		});
		btnView.setBounds(27, 85, 119, 50);

		JButton btnMarkAtnS = new JButton("Mark");
		btnMarkAtnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				choiceAtnS =2;

				btnCc1.setVisible(true);
				btnCc2.setVisible(true);
				btnCc3.setVisible(true);
				btnCc4.setVisible(true);
				btnCc5.setVisible(true);
				btnCc6.setVisible(true);

				btnBack.setVisible(true);

				String[] columnNamesS = {"ID","Name"};
				Object[][] dataS = {
						{"Joel", "Hails"},	
						{"John", "Doe"},
						{"Sue", "well"},
						{"Jane","White"},

				};

				atnTabS = new JTable(dataS,columnNamesS);
				atnTabS.setBounds(400,70,300,260);
				atnScrollS.setViewportView(atnTabS);

				atnTabS.setVisible(false);
				atnScrollS.setVisible(false);
			}
		});
		btnMarkAtnS.setBounds(27, 176, 119, 50);
		atnSPan.add(btnMarkAtnS);



		btnCc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{	
				if(choiceAtnS == 2)
				{		
					lblStatusS.setVisible(true);
					tfAtnS.setVisible(true);
					atnScrollS.setVisible(true);
					atnTabS.setVisible(true);

					atnMatS = new boolean[4][1];

					tfAtnS.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent cl)
						{

							if(tfAtnS.getText().toLowerCase().charAt(0)=='p')
							{
								boolean statusBool = true;
								atnMatS[countUsnS][0] = statusBool;
								countUsnS++;
								yBoundS = yBoundS + 18;
								tfAtnS.setBounds(615, yBoundS, 31, 14);
								System.out.println(tfAtnS.getText());
								tfAtnS.setText("");
							}
							else if(tfAtnS.getText().toLowerCase().charAt(0)=='a')
							{
								boolean statusBool = false;
								atnMatS[countUsnS][0] = statusBool;
								countUsnS++;
								yBoundS = yBoundS + 18;
								tfAtnS.setBounds(615, yBoundS, 31, 14);
								System.out.println(tfAtnS.getText());
								tfAtnS.setText("");
							}
							else 
								System.out.println("Invalid Status");
						}
					});

				}
			}
		});

		btnCc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(choiceAtnS == 2)
				{		
					lblStatusS.setVisible(true);
					tfAtnS.setVisible(true);
					atnScrollS.setVisible(true);
					atnTabS.setVisible(true);

					atnMatS = new boolean[4][1];

					tfAtnS.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent cl)
						{

							if(tfAtnS.getText().toLowerCase().charAt(0)=='p')
							{
								boolean statusBool = true;
								atnMatS[countUsnS][0] = statusBool;
								countUsnS++;
								yBoundS = yBoundS + 18;
								tfAtnS.setBounds(615, yBoundS, 31, 14);
								System.out.println(tfAtnS.getText());
								tfAtnS.setText("");
							}
							else if(tfAtnS.getText().toLowerCase().charAt(0)=='a')
							{
								boolean statusBool = false;
								atnMatS[countUsnS][0] = statusBool;
								countUsnS++;
								yBoundS = yBoundS + 18;
								tfAtnS.setBounds(615, yBoundS, 31, 14);
								System.out.println(tfAtnS.getText());
								tfAtnS.setText("");
							}
							else 
								System.out.println("Invalid Status");
						}
					});

				}	
			}		
		});

		btnCc3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(choiceAtnS == 2)
				{		
					lblStatusS.setVisible(true);
					tfAtnS.setVisible(true);
					atnScrollS.setVisible(true);
					atnTabS.setVisible(true);

					atnMatS = new boolean[4][1];

					tfAtnS.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent cl)
						{

							if(tfAtnS.getText().toLowerCase().charAt(0)=='p')
							{
								boolean statusBool = true;
								atnMatS[countUsnS][0] = statusBool;
								countUsnS++;
								yBoundS = yBoundS + 18;
								tfAtnS.setBounds(615, yBoundS, 31, 14);
								System.out.println(tfAtnS.getText());
								tfAtnS.setText("");
							}
							else if(tfAtnS.getText().toLowerCase().charAt(0)=='a')
							{
								boolean statusBool = false;
								atnMatS[countUsnS][0] = statusBool;
								countUsnS++;
								yBoundS = yBoundS + 18;
								tfAtnS.setBounds(615, yBoundS, 31, 14);
								System.out.println(tfAtnS.getText());
								tfAtnS.setText("");
							}
							else 
								System.out.println("Invalid Status");
						}
					});

				}
			}
		});

		btnCc4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(choiceAtnS == 2)
				{		
					lblStatusS.setVisible(true);
					tfAtnS.setVisible(true);
					atnScrollS.setVisible(true);
					atnTabS.setVisible(true);

					atnMatS = new boolean[4][1];

					tfAtnS.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent cl)
						{

							if(tfAtnS.getText().toLowerCase().charAt(0)=='p')
							{
								boolean statusBool = true;
								atnMatS[countUsnS][0] = statusBool;
								countUsnS++;
								yBoundS = yBoundS + 18;
								tfAtnS.setBounds(615, yBoundS, 31, 14);
								System.out.println(tfAtnS.getText());
								tfAtnS.setText("");
							}
							else if(tfAtnS.getText().toLowerCase().charAt(0)=='a')
							{
								boolean statusBool = false;
								atnMatS[countUsnS][0] = statusBool;
								countUsnS++;
								yBoundS = yBoundS + 18;
								tfAtnS.setBounds(615, yBoundS, 31, 14);
								System.out.println(tfAtnS.getText());
								tfAtnS.setText("");
							}
							else 
								System.out.println("Invalid Status");
						}
					});

				}//end of if
			}
		});

		btnCc5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(choiceAtnS == 2)
				{		
					lblStatusS.setVisible(true);
					tfAtnS.setVisible(true);
					atnScrollS.setVisible(true);
					atnTabS.setVisible(true);

					atnMatS = new boolean[4][1];

					tfAtnS.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent cl)
						{

							if(tfAtnS.getText().toLowerCase().charAt(0)=='p')
							{
								boolean statusBool = true;
								atnMatS[countUsnS][0] = statusBool;
								countUsnS++;
								yBoundS = yBoundS + 18;
								tfAtnS.setBounds(615, yBoundS, 31, 14);
								System.out.println(tfAtnS.getText());
								tfAtnS.setText("");
							}
							else if(tfAtnS.getText().toLowerCase().charAt(0)=='a')
							{
								boolean statusBool = false;
								atnMatS[countUsnS][0] = statusBool;
								countUsnS++;
								yBoundS = yBoundS + 18;
								tfAtnS.setBounds(615, yBoundS, 31, 14);
								System.out.println(tfAtnS.getText());
								tfAtnS.setText("");
							}
							else 
								System.out.println("Invalid Status");
						}
					});

				}
			}
		});

		btnCc6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(choiceAtnS == 2)
				{		
					lblStatusS.setVisible(true);
					tfAtnS.setVisible(true);
					atnScrollS.setVisible(true);
					atnTabS.setVisible(true);

					atnMatS = new boolean[4][1];

					tfAtnS.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent cl)
						{

							if(tfAtnS.getText().toLowerCase().charAt(0)=='p')
							{
								boolean statusBool = true;
								atnMatS[countUsnS][0] = statusBool;
								countUsnS++;
								yBoundS = yBoundS + 18;
								tfAtnS.setBounds(615, yBoundS, 31, 14);
								System.out.println(tfAtnS.getText());
								tfAtnS.setText("");
							}
							else if(tfAtnS.getText().toLowerCase().charAt(0)=='a')
							{
								boolean statusBool = false;
								atnMatS[countUsnS][0] = statusBool;
								countUsnS++;
								yBoundS = yBoundS + 18;
								tfAtnS.setBounds(615, yBoundS, 31, 14);
								System.out.println(tfAtnS.getText());
								tfAtnS.setText("");
							}
							else 
								System.out.println("Invalid Status");
						}
					});
				}
			}
		});

		JPanel marksPan = new JPanel();
		tabbedPane.addTab("Marks", null, marksPan, null);
		marksPan.setLayout(null);

		JButton btnCcM1 = new JButton("ClassCode 1");
		btnCcM1.setBounds(198, 85, 104, 23);

		JButton btnCcM2 = new JButton("ClassCode 2");
		btnCcM2.setBounds(198, 114, 104, 23);

		JButton btnCcM3 = new JButton("ClassCode 3");
		btnCcM3.setBounds(198, 143, 104, 23);

		JButton btnCcM4 = new JButton("ClassCode 4");
		btnCcM4.setBounds(198, 176, 104, 23);

		JButton btnCcM5 = new JButton("ClassCode 5");
		btnCcM5.setBounds(198, 210, 104, 23);

		JButton btnCcM6 = new JButton("ClassCode6");
		btnCcM6.setBounds(198, 244, 104, 23);

		marksPan.add(btnCcM1);
		marksPan.add(btnCcM2);
		marksPan.add(btnCcM3);
		marksPan.add(btnCcM4);
		marksPan.add(btnCcM5);
		marksPan.add(btnCcM6);
		JButton btnBackM = new JButton("BACK");
		btnBackM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnCcM1.setVisible(false);
				btnCcM2.setVisible(false);
				btnCcM3.setVisible(false);
				btnCcM4.setVisible(false);
				btnCcM5.setVisible(false);
				btnCcM6.setVisible(false);
				btnBackM.setVisible(false);
			}
		});

		btnCcM1.setVisible(false);
		btnCcM2.setVisible(false);
		btnCcM3.setVisible(false);
		btnCcM4.setVisible(false);
		btnCcM5.setVisible(false);
		btnCcM6.setVisible(false);
		btnBackM.setVisible(false);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnCcM1.setVisible(true);
				btnCcM2.setVisible(true);
				btnCcM3.setVisible(true);
				btnCcM4.setVisible(true);
				btnCcM5.setVisible(true);
				btnCcM6.setVisible(true);
				btnBackM.setVisible(true);
			}
		});
		btnUpdate.setBounds(36, 85, 104, 52);
		marksPan.add(btnUpdate);

		JButton btnView_1 = new JButton("View");
		btnView_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnCcM1.setVisible(true);
				btnCcM2.setVisible(true);
				btnCcM3.setVisible(true);
				btnCcM4.setVisible(true);
				btnCcM5.setVisible(true);
				btnCcM6.setVisible(true);
				btnBackM.setVisible(true);	
			}
		});
		btnView_1.setBounds(36, 176, 104, 52);
		marksPan.add(btnView_1);

		btnBackM.setBounds(533, 311, 136, 50);
		marksPan.add(btnBackM);

		JButton btnMarks = new JButton("Marks");
		btnMarks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnUpdate.setVisible(true);
				btnView_1.setVisible(true);

				btnBack.setVisible(true);

			}
		});

		JPanel newSPan = new JPanel();
		tabbedPane.addTab("Add (S)", null, newSPan, null);
		newSPan.setLayout(null);

		JLabel lblNameAddS = new JLabel("Name :");
		lblNameAddS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNameAddS.setBounds(10, 21, 87, 51);
		newSPan.add(lblNameAddS);

		JLabel lblUsnAddS = new JLabel("USN :");
		lblUsnAddS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsnAddS.setBounds(10, 83, 87, 51);
		newSPan.add(lblUsnAddS);

		JLabel lblClassIdAddS = new JLabel("Class Id :");
		lblClassIdAddS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblClassIdAddS.setBounds(10, 145, 87, 51);
		newSPan.add(lblClassIdAddS);

		JLabel lblDeptAddS = new JLabel("Dept. :");
		lblDeptAddS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDeptAddS.setBounds(10, 207, 87, 51);
		newSPan.add(lblDeptAddS);

		JLabel label_4 = new JLabel("Desig. :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(10, 264, 87, 51);
		newSPan.add(label_4);

		JButton btnSubmitAddS = new JButton("Submit");
		btnSubmitAddS.setBounds(293, 338, 89, 23);
		newSPan.add(btnSubmitAddS);

		tfNameS = new JTextField();
		tfNameS.setBounds(107, 39, 171, 23);
		newSPan.add(tfNameS);
		tfNameS.setColumns(10);

		tfUsnS = new JTextField();
		tfUsnS.setColumns(10);
		tfUsnS.setBounds(107, 102, 171, 23);
		newSPan.add(tfUsnS);

		tfClassIdS = new JTextField();
		tfClassIdS.setColumns(10);
		tfClassIdS.setBounds(107, 164, 171, 23);
		newSPan.add(tfClassIdS);

		tfDeptS = new JTextField();
		tfDeptS.setColumns(10);
		tfDeptS.setBounds(107, 226, 171, 23);
		newSPan.add(tfDeptS);

		tfdesigS = new JTextField();
		tfdesigS.setColumns(10);
		tfdesigS.setBounds(107, 283, 171, 23);
		newSPan.add(tfdesigS);

		JLabel lblDobAddS = new JLabel("D.O.B :");
		lblDobAddS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDobAddS.setBounds(307, 21, 87, 51);
		newSPan.add(lblDobAddS);

		JLabel lblSubAddS = new JLabel("Subject :");
		lblSubAddS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubAddS.setBounds(307, 83, 87, 51);
		newSPan.add(lblSubAddS);

		txtDobDd = new JTextField();
		txtDobDd.setForeground(Color.LIGHT_GRAY);
		txtDobDd.setText("DD");
		txtDobDd.setColumns(10);
		txtDobDd.setBounds(404, 39, 54, 23);
		newSPan.add(txtDobDd);

		txtDobMm = new JTextField();
		txtDobMm.setForeground(Color.LIGHT_GRAY);
		txtDobMm.setText("MM");
		txtDobMm.setColumns(10);
		txtDobMm.setBounds(464, 40, 54, 23);
		newSPan.add(txtDobMm);

		txtDobYy = new JTextField();
		txtDobYy.setForeground(Color.LIGHT_GRAY);
		txtDobYy.setText("YY");
		txtDobYy.setColumns(10);
		txtDobYy.setBounds(528, 40, 54, 23);
		newSPan.add(txtDobYy);

		txtSubject1AddS = new JTextField();
		txtSubject1AddS.setForeground(Color.LIGHT_GRAY);
		txtSubject1AddS.setText("Subject1");
		txtSubject1AddS.setColumns(10);
		txtSubject1AddS.setBounds(404, 102, 77, 20);
		newSPan.add(txtSubject1AddS);

		txtSubject2AddS = new JTextField();
		txtSubject2AddS.setForeground(Color.LIGHT_GRAY);
		txtSubject2AddS.setText("Subject2");
		txtSubject2AddS.setColumns(10);
		txtSubject2AddS.setBounds(491, 102, 77, 20);
		newSPan.add(txtSubject2AddS);

		txtSubjectAddS3 = new JTextField();
		txtSubjectAddS3.setForeground(Color.LIGHT_GRAY);
		txtSubjectAddS3.setText("Subject3");
		txtSubjectAddS3.setColumns(10);
		txtSubjectAddS3.setBounds(578, 102, 77, 20);
		newSPan.add(txtSubjectAddS3);

		txtSubject4AddS = new JTextField();
		txtSubject4AddS.setForeground(Color.LIGHT_GRAY);
		txtSubject4AddS.setText("Subject4");
		txtSubject4AddS.setColumns(10);
		txtSubject4AddS.setBounds(404, 133, 77, 20);
		newSPan.add(txtSubject4AddS);

		txtSubject5AddS = new JTextField();
		txtSubject5AddS.setForeground(Color.LIGHT_GRAY);
		txtSubject5AddS.setText("Subject5");
		txtSubject5AddS.setColumns(10);
		txtSubject5AddS.setBounds(491, 133, 77, 20);
		newSPan.add(txtSubject5AddS);

		txtSubject6AddS = new JTextField();
		txtSubject6AddS.setForeground(Color.LIGHT_GRAY);
		txtSubject6AddS.setText("Subject6");
		txtSubject6AddS.setColumns(10);
		txtSubject6AddS.setBounds(578, 133, 77, 20);
		newSPan.add(txtSubject6AddS);

		txtSubject7AddS = new JTextField();
		txtSubject7AddS.setForeground(Color.LIGHT_GRAY);
		txtSubject7AddS.setText("Lab1");
		txtSubject7AddS.setColumns(10);
		txtSubject7AddS.setBounds(404, 164, 77, 20);
		newSPan.add(txtSubject7AddS);

		txtSubject8AddS = new JTextField();
		txtSubject8AddS.setForeground(Color.LIGHT_GRAY);
		txtSubject8AddS.setText("Lab2");
		txtSubject8AddS.setColumns(10);
		txtSubject8AddS.setBounds(491, 164, 77, 20);
		newSPan.add(txtSubject8AddS);

		JLabel lblEmailAddS = new JLabel("Email :");
		lblEmailAddS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmailAddS.setBounds(307, 198, 87, 51);
		newSPan.add(lblEmailAddS);

		textFieldEmailAddS = new JTextField();
		textFieldEmailAddS.setColumns(10);
		textFieldEmailAddS.setBounds(404, 217, 171, 23);
		newSPan.add(textFieldEmailAddS);

		JLabel lblPhoneAddS = new JLabel("Phone :");
		lblPhoneAddS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPhoneAddS.setBounds(307, 264, 87, 51);
		newSPan.add(lblPhoneAddS);

		textFieldPhoneAddS = new JTextField();
		textFieldPhoneAddS.setColumns(10);
		textFieldPhoneAddS.setBounds(404, 283, 171, 23);
		newSPan.add(textFieldPhoneAddS);

		JLabel lblProctor = new JLabel("Proctor :");
		lblProctor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProctor.setBounds(10, 321, 87, 51);
		newSPan.add(lblProctor);

		textFieldProctorId = new JTextField();
		textFieldProctorId.setColumns(10);
		textFieldProctorId.setBounds(107, 339, 171, 23);
		newSPan.add(textFieldProctorId);

		//		String desig = "OD";
		//		if(desig.equals("HOD"))
		//		{	
		JPanel atnTPan = new JPanel();
		tabbedPane.addTab("Attendacne(T)", null, atnTPan, null);
		atnTPan.setLayout(null);
		atnTPan.setVisible(false);

		JScrollPane atnScrollT = new JScrollPane();
		atnScrollT.setBounds(306, 32, 284, 267);
		atnTPan.add(atnScrollT);

		JLabel lblTeacherStatus = new JLabel("Status");
		lblTeacherStatus.setBounds(602, 32, 46, 14);
		atnTPan.add(lblTeacherStatus);


		tfAbPtT = new JTextField();

		tfAbPtT.setVisible(false);
		lblTeacherStatus.setVisible(false);
		atnScrollT.setVisible(false);

		JButton btnNewAtnT = new JButton("Mark");
		btnNewAtnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{

				String[] columnNames = {"ID","Name"};
				Object[][] data = {
						{"Joel", "Hails"},	
						{"John", "Doe"},
						{"Sue", "well"},
						{"Jane","White"},

				};
				atnMatT = new boolean[4][1];
				JTable atnTTab=new JTable(data,columnNames);
				atnTTab.setBounds(100,100,100,100);	
				atnScrollT.setViewportView(atnTTab);


				tfAbPtT.setBounds(599, yBoundT, 46, 14);

				atnTPan.add(tfAbPtT);
				tfAbPtT.setColumns(10);

				atnScrollT.setVisible(true);
				atnTTab.setVisible(true);
				lblTeacherStatus.setVisible(true);
				tfAbPtT.setVisible(true);

				tfAbPtT.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent cl)
					{

						if(tfAbPtT.getText().toLowerCase().charAt(0)=='p')
						{
							boolean statusBool = true;
							atnMatT[countIdT][0] = statusBool;
							countIdT++;
							yBoundT = yBoundT + 18;
							tfAbPtT.setBounds(599, yBoundT, 46, 14);
							System.out.println(tfAbPtT.getText());
							tfAbPtT.setText("");
						}
						else if(tfAbPtT.getText().toLowerCase().charAt(0)=='a')
						{
							boolean statusBool = false;
							atnMatT[countIdT][0] = statusBool;
							countIdT++;
							yBoundT = yBoundT + 18;
							tfAbPtT.setBounds(599, yBoundT, 46, 14);
							System.out.println(tfAbPtT.getText());
							tfAbPtT.setText("");
						}
						else 
							System.out.println("Invalid Status");
					}
				});
			}
		});

		JButton btnViewAtnT = new JButton("View");
		btnViewAtnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});


		JButton btnBackTAtn = new JButton("Back");
		btnBackTAtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				atnScrollT.setVisible(false);
				atnScrollT.setVisible(false);
				lblTeacherStatus.setVisible(false);
				tfAbPtT.setVisible(false);
				countIdT =0;
			}
		});
		btnBackTAtn.setBounds(508, 311, 110, 50);
		atnTPan.add(btnBackTAtn);

		btnNewAtnT.setBounds(10, 173, 119, 50);
		atnTPan.add(btnNewAtnT);
		btnViewAtnT.setBounds(10, 82, 119, 50);
		atnTPan.add(btnViewAtnT);

		JPanel newTPan = new JPanel();
		tabbedPane.addTab("Add (t)", null, newTPan, null);
		newTPan.setLayout(null);

		JLabel lblNameAddT = new JLabel("Name :");
		lblNameAddT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNameAddT.setBounds(10, 11, 90, 48);
		newTPan.add(lblNameAddT);

		JLabel lblDobAddT = new JLabel("DOB :");
		lblDobAddT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDobAddT.setBounds(10, 70, 90, 48);
		newTPan.add(lblDobAddT);

		JLabel lblEmailAddT = new JLabel("Email :");
		lblEmailAddT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmailAddT.setBounds(10, 129, 90, 48);
		newTPan.add(lblEmailAddT);

		JLabel lblDateOfJoinAddT = new JLabel("Date Of Join :");
		lblDateOfJoinAddT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDateOfJoinAddT.setBounds(10, 188, 133, 48);
		newTPan.add(lblDateOfJoinAddT);

		JLabel lblPhoneAddT = new JLabel("Phone :");
		lblPhoneAddT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPhoneAddT.setBounds(10, 247, 133, 48);
		newTPan.add(lblPhoneAddT);

		textFieldNameAddT = new JTextField();
		textFieldNameAddT.setBounds(179, 29, 191, 20);
		newTPan.add(textFieldNameAddT);
		textFieldNameAddT.setColumns(10);

		textFieldDobAddT = new JTextField();
		textFieldDobAddT.setColumns(10);
		textFieldDobAddT.setBounds(179, 88, 191, 20);
		newTPan.add(textFieldDobAddT);

		textFieldEmailAddT = new JTextField();
		textFieldEmailAddT.setColumns(10);
		textFieldEmailAddT.setBounds(179, 147, 191, 20);
		newTPan.add(textFieldEmailAddT);

		textFieldDojAddT = new JTextField();
		textFieldDojAddT.setColumns(10);
		textFieldDojAddT.setBounds(179, 206, 191, 20);
		newTPan.add(textFieldDojAddT);

		textFieldPhoneAddT = new JTextField();
		textFieldPhoneAddT.setColumns(10);
		textFieldPhoneAddT.setBounds(179, 265, 191, 20);
		newTPan.add(textFieldPhoneAddT);

		JButton btnSubmitAddT = new JButton("Submit");
		btnSubmitAddT.setBounds(277, 326, 118, 35);
		newTPan.add(btnSubmitAddT);

		//		}

		JPanel passwordPan = new JPanel();
		tabbedPane.addTab("Change Password", null, passwordPan, null);
		passwordPan.setLayout(null);

		JLabel lblOldP = new JLabel("Old Password :");
		lblOldP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOldP.setBounds(31, 24, 155, 39);
		passwordPan.add(lblOldP);

		JLabel lblNewP = new JLabel("New Password :");
		lblNewP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewP.setBounds(31, 74, 155, 39);
		passwordPan.add(lblNewP);

		JLabel lblConfirmP = new JLabel("Confirm Password :");
		lblConfirmP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblConfirmP.setBounds(31, 124, 184, 39);
		passwordPan.add(lblConfirmP);

		OldPass = new JPasswordField();
		OldPass.setBounds(229, 37, 147, 20);
		passwordPan.add(OldPass);

		NewPass = new JPasswordField();
		NewPass.setBounds(229, 87, 147, 20);
		passwordPan.add(NewPass);

		ConfirmPass = new JPasswordField();
		ConfirmPass.setBounds(229, 137, 147, 20);
		passwordPan.add(ConfirmPass);

		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.setBounds(229, 300, 166, 49);
		passwordPan.add(btnNewButton);
	}
}
