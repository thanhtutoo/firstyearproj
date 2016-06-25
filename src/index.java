import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.Toolkit;


public class index extends JFrame {
	
	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");
	private final JLabel lblNewLabel_1 = new JLabel("");
	private JLabel label_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() {
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
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Notebookshop.jpg"));
		label.setBounds(285, 26, 391, 75);
		contentPane.add(label);
		
		JButton btnChackout = new JButton("");
		btnChackout.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Checkout.PNG"));
		btnChackout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String labal_3="SAMSUNG Series 3 NP305V4Z-T02TH";
				int label_2=16900;
				
					
				calculate calculate=new calculate();
				calculate.setResult(label_2);
				calculate.setVisible(true);
				calculate.setName(labal_3);
				setVisible(false);
				
		
			}
		});
		btnChackout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnChackout.setBounds(704, 610, 120, 40);
		contentPane.add(btnChackout);
		
		JButton btnApple = new JButton("Apple");
		btnApple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index_01 index_01=new index_01();
				index_01.setVisible(true);
				setVisible(false);
			}
		});
		btnApple.setForeground(new Color(255, 255, 255));
		btnApple.setBackground(new Color(0, 0, 0));
		btnApple.setBounds(136, 132, 89, 31);
		contentPane.add(btnApple);
		
		JButton btnSamsung = new JButton("Samsung");
		btnSamsung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index index=new index();
				index.setVisible(true);
				setVisible(false);
			}
		});
		btnSamsung.setForeground(new Color(255, 255, 255));
		btnSamsung.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSamsung.setBackground(new Color(0, 0, 0));
		btnSamsung.setBounds(20, 132, 99, 31);
		contentPane.add(btnSamsung);
		
		JButton btnAsus = new JButton("Asus");
		btnAsus.setForeground(new Color(255, 255, 255));
		btnAsus.setBackground(new Color(0, 0, 0));
		btnAsus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index_02 index_02=new index_02();
				index_02.setVisible(true);
				setVisible(false);
			}
		});
		btnAsus.setBounds(249, 132, 89, 31);
		contentPane.add(btnAsus);
		
		JButton btnAcer = new JButton("Acer");
		btnAcer.setForeground(new Color(255, 255, 255));
		btnAcer.setBackground(new Color(0, 0, 0));
		btnAcer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index_03 index_03=new index_03();
				index_03.setVisible(true);
				setVisible(false);
	
			}
		});
		btnAcer.setBounds(362, 132, 89, 31);
		contentPane.add(btnAcer);
		
		JButton btnHp = new JButton("HP");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index_04 index_04=new index_04();
				index_04.setVisible(true);
				setVisible(false);
			}
		});
		btnHp.setForeground(new Color(255, 255, 255));
		btnHp.setBackground(new Color(0, 0, 0));
		btnHp.setBounds(481, 132, 89, 31);
		contentPane.add(btnHp);
		lblNewLabel_1.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\tab_product.jpg"));
		lblNewLabel_1.setBounds(0, 132, 800, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\tab_product.jpg"));
		label_1.setBounds(704, 132, 145, 31);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Samsung\\np300-bk.gif"));
		label_2.setBounds(20, 312, 217, 170);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Samsung\\Name.PNG"));
		label_3.setBounds(20, 221, 318, 54);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Samsung\\spead.PNG"));
		label_4.setBounds(266, 322, 72, 157);
		contentPane.add(label_4);
		
		JLabel lblBath = new JLabel("16,900  Bath");
		lblBath.setForeground(Color.RED);
		lblBath.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBath.setBounds(276, 461, 177, 31);
		contentPane.add(lblBath);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Samsung\\date.PNG"));
		lblNewLabel_2.setBounds(398, 246, 332, 303);
		contentPane.add(lblNewLabel_2);
		
	
	}
}
