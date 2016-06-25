import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.UIManager;


public class selectpayment extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectpayment frame = new selectpayment();
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
	public selectpayment() {
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
		lblNewLabel.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\LOGO.png"));
		lblNewLabel.setBounds(0, 0, 270, 75);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Notebookshop.jpg"));
		label.setBounds(292, 26, 391, 75);
		contentPane.add(label);
		
		JButton btnPaypal = new JButton("PayPal");
		btnPaypal.setBackground(UIManager.getColor("Button.darkShadow"));
		btnPaypal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPaypal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				paypal paypal= new paypal();
				paypal.setVisible(true);
				setVisible(false);
			}
		});
		btnPaypal.setBounds(489, 528, 130, 40);
		contentPane.add(btnPaypal);
		
		JButton button = new JButton("Credit");
		button.setBackground(UIManager.getColor("Button.darkShadow"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				credit credit= new credit();
				credit.setVisible(true);
				setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(89, 528, 130, 40);
		contentPane.add(button);
		
		JLabel lblSelectPayment = new JLabel(":. Select Payment");
		lblSelectPayment.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSelectPayment.setBounds(10, 107, 260, 34);
		contentPane.add(lblSelectPayment);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\credit-cards.png"));
		label_1.setBounds(10, 228, 244, 271);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\paypal4.gif"));
		label_2.setBounds(405, 268, 310, 231);
		contentPane.add(label_2);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\tab_menu.jpg"));
		label_4.setBounds(0, 107, 834, 34);
		contentPane.add(label_4);
		
		JButton btnBack = new JButton("");
		btnBack.setBackground(Color.WHITE);
		btnBack.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\back.png"));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index index=new index();
				index.setVisible(true);
				setVisible(false);
				
				
			}
		});
		btnBack.setBounds(0, 595, 70, 66);
		contentPane.add(btnBack);
	}
}
