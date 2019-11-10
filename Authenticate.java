import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Authenticate extends JFrame {

	JLabel l1, l2, l3;
	int c=0;
	JTextField tf1;
	JButton btn1;
	JPasswordField p1;
	private JPanel contentPane,contentPane2;
	String text = "Hello";
	JLabel label;
	int charIndex = 0;;

	private JTextField tfUsername;
	private JPasswordField pfPassword;
	private JLabel lbUsername;
	private JLabel lbPassword;
	private JButton btnLogin;
	private JButton btnCancel;
	private boolean succeeded;
	static Authenticate frame; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					frame = new Authenticate();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Authenticate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1334, 692);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(102, 204, 204));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Reetik\\Desktop\\tenorgif.gif"));
		lblNewLabel.setBounds(817, 33, 516, 468);
		contentPane.add(lblNewLabel);

		JLabel lblEmuds = new JLabel("EMUDS");
		lblEmuds.setFont(new Font("Berlin Sans FB", Font.BOLD, 35));
		lblEmuds.setBounds(31, 33, 179, 57);
		contentPane.add(lblEmuds);

		JLabel lblIAm = new JLabel("I AM");
		lblIAm.setFont(new Font("Snap ITC", Font.PLAIN, 55));
		lblIAm.setBounds(595, 164, 212, 71);
		contentPane.add(lblIAm);

		JButton btnTeacher = new JButton("Teacher");
		btnTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				contentPane2 = new JPanel();
				contentPane2.setBackground(Color.WHITE);
				contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane2);
				contentPane2.setLayout(null);
				JFrame frame1 = new JFrame("Login Form");
				frame1.setLocationRelativeTo(btnTeacher); 

				l1 = new JLabel("Login Form");
				l1.setForeground(Color.blue);
				l1.setFont(new Font("Serif", Font.BOLD, 20));	
				l2 = new JLabel("Username");
				l3 = new JLabel("Passwordss");
				tf1 = new JTextField();
				p1 = new JPasswordField();
				btn1 = new JButton("Login");

				l1.setBounds(147, 11, 151, 30);
				l2.setBounds(80, 70, 200, 30);
				l3.setBounds(80, 110, 80, 30);
				tf1.setBounds(174, 71, 200, 30);
				p1.setBounds(174, 110, 200, 30);
				btn1.setBounds(147, 212, 100, 30);

				frame1.add(l1);
				frame1.add(l2);
				frame1.add(tf1);
				frame1.add(l3);
				frame1.add(p1);
				frame1.add(btn1);

				frame1.setSize(400, 400);
				frame1.getContentPane().setLayout(null);
				frame1.setBounds(500,200,100,100);
				JLabel lblNewLabel_12 = new JLabel("New label");
				lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\Reetik\\Downloads\\background-3246124_1280.jpg"));
				lblNewLabel_12.setBounds(0, 0, 384, 361);
				frame1.getContentPane().add(lblNewLabel_12);
				frame1.setSize(400,400);
				frame1.setVisible(true);

			}
		});

		btnTeacher.setBackground(new Color(51, 204, 204));
		btnTeacher.setBounds(572, 322, 201, 42);
		contentPane.add(btnTeacher);

		JButton btnStudent = new JButton("Student");
		btnStudent.setBackground(new Color(51, 204, 204));
		btnStudent.setBounds(572, 427, 201, 42);
		contentPane.add(btnStudent);
		btnTeacher.addMouseListener(new MouseAdapter() {
			Color oldcolor = btnTeacher.getBackground();
			Color oldcolor1 = btnTeacher.getForeground();
			public void mouseEntered(MouseEvent me) {
				oldcolor = btnTeacher.getBackground();
				btnTeacher.setBackground(Color.white);
				//	           oldcolor1 = btnTeacher.getForeground();
				//	           btnTeacher.setForeground(Color.cyan);
			}
			public void mouseExited(MouseEvent me) {
				btnTeacher.setBackground(oldcolor);
				//	       	btnTeacher.setForeground(oldcolor1);
			}
		});
		btnStudent.addMouseListener(new MouseAdapter() {
			Color oldcolor = btnStudent.getBackground();
			public void mouseEntered(MouseEvent me) {
				oldcolor = btnStudent.getBackground();
				btnStudent.setBackground(Color.white);
			}
			public void mouseExited(MouseEvent me) {
				btnStudent.setBackground(oldcolor);
			}
		});



	}
}