import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class cash extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");
	private JTextField textField;
	private String number1value;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cash frame = new cash();
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
	public cash() {
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
		
		JLabel lblCash = new JLabel(":. Cash");
		lblCash.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCash.setBounds(10, 107, 195, 34);
		contentPane.add(lblCash);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\tab_menu.jpg"));
		label_4.setBounds(0, 107, 834, 34);
		contentPane.add(label_4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\Notebookshop.jpg"));
		label.setBounds(224, 11, 388, 75);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Angsana New", Font.BOLD, 25));
		textField.setBounds(433, 268, 155, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		label_1 = new JLabel("");
		label_1.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_1.setBounds(433, 301, 155, 27);
		contentPane.add(label_1);
		
		final JLabel label_2 = new JLabel("");
		label_2.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_2.setBounds(433, 340, 155, 27);
		contentPane.add(label_2);
		
		final JLabel label_3 = new JLabel("");
		label_3.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_3.setBounds(433, 369, 155, 27);
		contentPane.add(label_3);
		
		final JLabel label_5 = new JLabel("");
		label_5.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_5.setBounds(433, 407, 155, 27);
		contentPane.add(label_5);
		
		final JLabel label_6 = new JLabel("");
		label_6.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_6.setBounds(433, 439, 155, 27);
		contentPane.add(label_6);
		
		JButton btnFinish = new JButton("Checkout");
		btnFinish.setForeground(Color.BLACK);
		btnFinish.setBackground(Color.LIGHT_GRAY);
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				
				String sum1=textField.getText();
				int sum2=Integer.parseInt(sum1);
				
				String sumt=label_1.getText();
				int sumr=Integer.parseInt(sumt);
				
				
				if(sum2 < sumr){
					JOptionPane.showMessageDialog(null, "You do not have enough money !!!","Warning",JOptionPane.WARNING_MESSAGE);
				}
				else if(sum2 <= 0){
					JOptionPane.showMessageDialog(null, "You do not have enough money !!!","Warning",JOptionPane.WARNING_MESSAGE);
					
				}else if(sum2>600000){
					JOptionPane.showMessageDialog(null, "Under or over withdrawal limit !!!","Warning",JOptionPane.WARNING_MESSAGE);
				}else{
					
					String numberlabal1=label_1.getText();
					int numberlabal2=Integer.parseInt(numberlabal1);
					
					String numberlabal3=textField.getText();
					int numberlabal4=Integer.parseInt(numberlabal3);
					
					int sum=numberlabal4-numberlabal2;
					label_2.setText(Integer.toString(sum));
					
					int change1 = sum/1000;
					int change2 = sum%1000/500;
					int change3 = sum%1000%500/100;
					
					label_3.setText(Integer.toString(change1));
					label_5.setText(Integer.toString(change2));
					label_6.setText(Integer.toString(change3));
					JOptionPane.showMessageDialog(null, "Payment already  ^__^");
				
				}
				}
			
		});
		btnFinish.setFont(new Font("Angsana New", Font.BOLD, 30));
		btnFinish.setBounds(229, 616, 125, 34);
		contentPane.add(btnFinish);
		
		JButton button = new JButton("Finish");
		button.setForeground(Color.BLACK);
		button.setBackground(Color.LIGHT_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thank thank=new thank();
				thank.setVisible(true);
				setVisible(false);
			}
		});
		button.setFont(new Font("Angsana New", Font.BOLD, 30));
		button.setBounds(364, 616, 125, 34);
		contentPane.add(button);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				index index=new index();
				index.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel label_8 = new JLabel("");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				index index=new index();
				index.setVisible(true);
				setVisible(false);
				
			}
		});
		label_8.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\back.png"));
		label_8.setBounds(0, 580, 72, 70);
		contentPane.add(label_8);
		label_7.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\kfm_home.png"));
		label_7.setBounds(82, 570, 88, 80);
		contentPane.add(label_7);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\bg_calculate.gif"));
		lblNewLabel_1.setBounds(-44, 140, 878, 521);
		contentPane.add(lblNewLabel_1);
	}
	JLabel label_1;
	public void setResult(int  labal_2){
		label_1.setText(Integer.toString(labal_2));
	}

	public void setNumber1Value(String sum) {
		// TODO Auto-generated method stub
		label_1.setText(sum);
	
	}
}
