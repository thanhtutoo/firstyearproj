import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class thank extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thank frame = new thank();
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
	public thank() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\My ProG\\Project SE\\Image\\chardevice---.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 20, 850, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\LOGO.png"));
		label.setBounds(75, 47, 283, 145);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Notebookshop.jpg"));
		label_1.setBounds(272, 23, 429, 152);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Thank2.jpg"));
		label_2.setBounds(232, 143, 475, 312);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index index=new index();
				index.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\kfm_home.png"));
		btnNewButton.setBounds(10, 560, 80, 71);
		contentPane.add(btnNewButton);
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setForeground(new Color(0, 0, 0));
		lblHome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHome.setBounds(20, 636, 90, 14);
		contentPane.add(lblHome);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				index index=new index();
				index.setVisible(false);
				setVisible(false);
				
			}
		});
		button.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\exit.png"));
		button.setBounds(741, 560, 80, 71);
		contentPane.add(button);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Globe.png"));
		label_4.setBounds(372, 437, 225, 165);
		contentPane.add(label_4);
		
		JLabel label_3 = new JLabel("CLOSE");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(764, 636, 90, 14);
		contentPane.add(label_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\wall_e29.jpg"));
		lblNewLabel.setBounds(-108, 0, 1135, 661);
		contentPane.add(lblNewLabel);
	}
}
