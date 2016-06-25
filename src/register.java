import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class register extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public register() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\My ProG\\Project SE\\Image\\chardevice---.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\LOGO.png"));
		lblNewLabel.setBounds(0, 0, 270, 75);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(435, 332, 169, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name - Last Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(213, 334, 208, 23);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmail.setBounds(213, 399, 73, 15);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(435, 397, 280, 25);
		contentPane.add(textField_1);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(213, 457, 111, 25);
		contentPane.add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(435, 460, 280, 25);
		contentPane.add(textField_2);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConfirmPassword.setBounds(213, 523, 178, 14);
		contentPane.add(lblConfirmPassword);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(435, 521, 280, 25);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("Member information / ข้อมูลสมาชิก");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(277, 263, 500, 49);
		contentPane.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(626, 332, 169, 25);
		contentPane.add(textField_4);
		
		JLabel lblExampleWebmastertojsiabcom = new JLabel("Example: webmaster@notebookshop.com");
		lblExampleWebmastertojsiabcom.setBounds(435, 430, 280, 14);
		contentPane.add(lblExampleWebmastertojsiabcom);
		
		JLabel label_2 = new JLabel("\u0E01\u0E23\u0E38\u0E13\u0E32\u0E23\u0E30\u0E1A\u0E38 6 \u0E15\u0E31\u0E27\u0E02\u0E36\u0E49\u0E19\u0E44\u0E1B");
		label_2.setBounds(435, 496, 111, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("! ! \u0E22\u0E37\u0E19\u0E22\u0E31\u0E19\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19\u0E2D\u0E35\u0E01\u0E04\u0E23\u0E31\u0E49\u0E07");
		label_3.setFont(new Font("Angsana New", Font.PLAIN, 16));
		label_3.setBounds(213, 548, 139, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("รหัสผ่าน");
		label_4.setFont(new Font("Angsana New", Font.PLAIN, 16));
		label_4.setBounds(213, 480, 73, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("ชื่อ - นามสกุล");
		label_5.setFont(new Font("Angsana New", Font.PLAIN, 16));
		label_5.setBounds(213, 357, 86, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("อีเมล");
		label_6.setFont(new Font("Angsana New", Font.PLAIN, 16));
		label_6.setBounds(213, 417, 46, 14);
		contentPane.add(label_6);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setBackground(new Color(0, 0, 0));
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
			}
		});
		btnSubmit.setBounds(435, 591, 94, 31);
		contentPane.add(btnSubmit);
		
		JButton button = new JButton("BACK");
		button.setBackground(new Color(0, 0, 0));
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login=new login();
				login.setVisible(true);
				setVisible(false);
			}
		});
		button.setBounds(539, 591, 94, 31);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\book.gif"));
		label_1.setBounds(355, -70, 500, 322);
		contentPane.add(label_1);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\easymoblog.png"));
		label_7.setBounds(199, 237, 126, 92);
		contentPane.add(label_7);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\tumblr_kveye9wMrI1qzv218o1_1280.jpg"));
		label.setBounds(-427, -149, 1358, 914);
		contentPane.add(label);
	}
}
