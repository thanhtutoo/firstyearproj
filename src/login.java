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
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;


public class login extends JFrame {
	public static final String Email="classic@hotmail.com";
	public static final String password="1";		
	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel label_3;

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
	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\My ProG\\Project SE\\Image\\chardevice---.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 20, 850, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\LOGO.png"));
		lblNewLabel.setBounds(0, 0, 270, 75);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login ");
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD, 40));
		lblNewLabel_1.setBounds(246, 338, 91, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Angsana New", Font.BOLD, 30));
		lblEmail.setBounds(210, 410, 60, 26);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textField.setColumns(10);
		textField.setBounds(311, 405, 284, 31);
		contentPane.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setFont(new Font("Angsana New", Font.BOLD, 30));
		lblNewLabel_2.setBounds(210, 493, 91, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblExampleWebmastertojsiabcom = new JLabel("Example: webmaster@notebookshop.com");
		lblExampleWebmastertojsiabcom.setFont(new Font("Angsana New", Font.PLAIN, 20));
		lblExampleWebmastertojsiabcom.setBounds(311, 447, 249, 14);
		contentPane.add(lblExampleWebmastertojsiabcom);
		
		JButton btnSubmit = new JButton("Login");
		btnSubmit.setFont(new Font("Angsana New", Font.BOLD, 30));
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setBackground(new Color(0, 0, 0));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = textField.getText();
				String pass = passwordField.getText();
				if(email.equalsIgnoreCase(Email)&&pass.equalsIgnoreCase(password)){
					index index = new index();
					index.setVisible(true);
					setVisible(false);
				}
				else{
					label_3.setVisible(true);
				}
			}
		});
		btnSubmit.setBounds(311, 555, 107, 31);
		contentPane.add(btnSubmit);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		passwordField.setBounds(311, 488, 284, 31);
		contentPane.add(passwordField);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\hr1.jpg"));
		label_1.setBounds(186, 379, 205,1);
		contentPane.add(label_1);
		
	    label_3 = new JLabel("E-mail or Password Wrong");
	    label_3.setFont(new Font("Angsana New", Font.BOLD, 20));
	    label_3.setForeground(Color.RED);
		label_3.setBounds(311, 530, 249, 14);
		contentPane.add(label_3);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Under.PNG"));
		label_5.setBounds(20, 619, 814, 31);
		contentPane.add(label_5);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\login_bg.png"));
		label.setBounds(133, -77, 825, 596);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\lists.png"));
		label_2.setBounds(170, 311, 78, 81);
		contentPane.add(label_2);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\tumblr_kveye9wMrI1qzv218o1_1280.jpg"));
		label_6.setBounds(-450, -72, 1297, 766);
		contentPane.add(label_6);
		label_3.setVisible(false);


		
	}
}
