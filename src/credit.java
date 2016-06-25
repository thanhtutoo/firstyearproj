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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class credit extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					credit frame = new credit();
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
	public credit() {
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
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\credit.jpg"));
		label_2.setBounds(210, 208, 440, 128);
		contentPane.add(label_2);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFirstName.setBounds(143, 360, 118, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLastName.setBounds(143, 407, 101, 14);
		contentPane.add(lblLastName);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card Number:");
		lblCreditCardNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCreditCardNumber.setBounds(143, 439, 166, 23);
		contentPane.add(lblCreditCardNumber);
		
		JRadioButton rdbtnVisa = new JRadioButton("VISA");
		rdbtnVisa.setBounds(332, 499, 59, 23);
		contentPane.add(rdbtnVisa);
		
		JRadioButton rdbtnMasterCard = new JRadioButton("Master Card");
		rdbtnMasterCard.setBounds(435, 499, 118, 23);
		contentPane.add(rdbtnMasterCard);
		
		JLabel lblPaymentType = new JLabel("Payment Type:");
		lblPaymentType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPaymentType.setBounds(143, 496, 135, 22);
		contentPane.add(lblPaymentType);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(143, 547, 64, 23);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(327, 358, 284, 25);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(328, 405, 284, 25);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(328, 441, 284, 25);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(332, 549, 284, 25);
		contentPane.add(textField_3);
		
		JButton btnChackout = new JButton("Checkout");
		btnChackout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				thank thank=new thank();
				thank.setVisible(true);
				setVisible(false);
			}
		});
		btnChackout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnChackout.setBounds(332, 595, 118, 24);
		contentPane.add(btnChackout);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectpayment selectpayment=new selectpayment();
				selectpayment.setVisible(true);
				setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBounds(469, 595, 118, 24);
		contentPane.add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Notebookshop.jpg"));
		label.setBounds(224, 11, 388, 75);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Under.PNG"));
		label_1.setBounds(26, 630, 798, 14);
		contentPane.add(label_1);
		
		JLabel lblPaymentByCredit = new JLabel(":.Payment by Credit");
		lblPaymentByCredit.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPaymentByCredit.setBounds(10, 107, 249, 34);
		contentPane.add(lblPaymentByCredit);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\tab_menu.jpg"));
		label_4.setBounds(0, 107, 834, 34);
		contentPane.add(label_4);
	}
}
