import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;


public class paypal extends JFrame {
	public static final String Email="classic@hotmail.com";
	public static final String password="tojsiab";	
	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel label_3;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paypal frame = new paypal();
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
	public paypal() {
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
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Angsana New", Font.BOLD, 30));
		lblEmail.setBounds(259, 397, 65, 26);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBounds(446, 389, 284, 34);
		contentPane.add(textField);
		
		JLabel lblPaypalpassword = new JLabel("Paypal Password:");
		lblPaypalpassword.setFont(new Font("Angsana New", Font.BOLD, 30));
		lblPaypalpassword.setBounds(255, 482, 167, 23);
		contentPane.add(lblPaypalpassword);
		
		JButton btnChackout = new JButton("Chackout");
		btnChackout.setForeground(new Color(255, 255, 255));
		btnChackout.setBackground(new Color(0, 0, 0));
		btnChackout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnChackout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = textField.getText();
			String pass = passwordField.getText();
			if(email.equalsIgnoreCase(Email)&&pass.equalsIgnoreCase(password)){
				thank thank = new thank();
				thank.setVisible(true);
				setVisible(false);
			}
			else{
				label_3.setVisible(true);
			}
			}
		});
		btnChackout.setBounds(446, 575, 112, 34);
		contentPane.add(btnChackout);
		
		JButton button = new JButton("Back");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectpayment selectpayment=new selectpayment();
				selectpayment.setVisible(true);
				setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(589, 575, 112, 34);
		contentPane.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField.setBounds(446, 479, 284, 34);
		contentPane.add(passwordField);
		
		JLabel lblPaypal = new JLabel(":. Paypal");
		lblPaypal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPaypal.setBounds(10, 107, 131, 34);
		contentPane.add(lblPaypal);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\tab_menu.jpg"));
		label_4.setBounds(0, 107, 834, 34);
		contentPane.add(label_4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Notebookshop.jpg"));
		label.setBounds(231, 27, 390, 84);
		contentPane.add(label);
		
		label_3 = new JLabel("E-mail or Password Wrong");
	    label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
	    label_3.setForeground(Color.RED);
		label_3.setBounds(445, 524, 256, 14);
		contentPane.add(label_3);
		label_3.setVisible(false);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\paypal-banner.png"));
		label_2.setBounds(0, 107, 491, 353);
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\wall_e29.jpg"));
		label_1.setBounds(-145, 152, 1173, 521);
		contentPane.add(label_1);
	}
}
