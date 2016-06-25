import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class calculate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculate frame = new calculate();
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
	public calculate() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\My ProG\\Project SE\\Image\\chardevice---.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNotebook = new JLabel("Notebook:");
		lblNotebook.setFont(new Font("Angsana New", Font.BOLD, 29));
		lblNotebook.setBounds(117, 136, 94, 33);
		contentPane.add(lblNotebook);
		
		JLabel lblPayment = new JLabel("Order Total:");
		lblPayment.setFont(new Font("Angsana New", Font.BOLD, 29));
		lblPayment.setBounds(117, 245, 116, 33);
		contentPane.add(lblPayment);
		
		JLabel lblX = new JLabel("x");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX.setBounds(420, 198, 40, 21);
		contentPane.add(lblX);
		
		label_1 = new JLabel("");
		label_1.setBackground(Color.WHITE);
		label_1.setFont(new Font("Angsana New", Font.PLAIN, 30));
		label_1.setBounds(248, 136, 492, 33);
		contentPane.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setFont(new Font("Angsana New", Font.PLAIN, 30));
		label_2.setBounds(250, 189, 100, 33);
		contentPane.add(label_2);
		
		
		
		JButton btnNewButton = new JButton("Online Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				selectpayment selectpayment=new selectpayment();
				selectpayment.setVisible(true);
				setVisible(false);
			}
		});

		btnNewButton.setFont(new Font("Angsana New", Font.BOLD, 29));
		btnNewButton.setBounds(460, 566, 176, 33);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Angsana New", Font.PLAIN, 30));
		textField.setBounds(448, 189, 57, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final JLabel label_3 = new JLabel("");
		label_3.setFont(new Font("Angsana New", Font.PLAIN, 30));
		label_3.setBounds(249, 245, 106, 33);
		contentPane.add(label_3);
		
		JLabel lblCartSubtotal = new JLabel("Cart Subtotal");
		lblCartSubtotal.setFont(new Font("Angsana New", Font.BOLD, 29));
		lblCartSubtotal.setBounds(117, 191, 124, 31);
		contentPane.add(lblCartSubtotal);
		
		JButton btnTtt = new JButton("");
		btnTtt.setForeground(Color.RED);
		btnTtt.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\cal.png"));
		btnTtt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sum1=textField.getText();
				int sum2=Integer.parseInt(sum1);
			if(sum2<=15){
				String numberlabal1=label_2.getText();
				int numberlabal2=Integer.parseInt(numberlabal1);
				
				String numberlabal3=textField.getText();
				int numberlabal4=Integer.parseInt(numberlabal3);
				
				int sum=numberlabal2*numberlabal4;
				label_3.setText(Integer.toString(sum));		
				
			}else{
				
				JOptionPane.showMessageDialog(null, "You can buy the product less than 15 pieces !!!","Warning",JOptionPane.WARNING_MESSAGE);

			
			}
			}
		});
		btnTtt.setBounds(531, 183, 33, 39);
		contentPane.add(btnTtt);
		
		JLabel lblBath = new JLabel("Baht");
		lblBath.setFont(new Font("Angsana New", Font.BOLD, 25));
		lblBath.setBounds(365, 199, 45, 21);
		contentPane.add(lblBath);
		
		JLabel label_4 = new JLabel("Baht");
		label_4.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_4.setBounds(365, 252, 45, 21);
		contentPane.add(label_4);
		
		JButton btnCashPayment = new JButton("Cash Payment");
		btnCashPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cash cash=new cash();
				cash.setVisible(true);
				setVisible(false);
				
				String sum=label_3.getText();
				cash.setNumber1Value(sum);
			}

			private String labal_3() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnCashPayment.setFont(new Font("Angsana New", Font.BOLD, 29));
		btnCashPayment.setBounds(266, 566, 162, 33);
		contentPane.add(btnCashPayment);
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				index index=new index();
				index.setVisible(true);
				setVisible(false);
			}
		});
		label_5.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\back.png"));
		label_5.setBounds(10, 581, 88, 80);
		contentPane.add(label_5);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\My ProG\\Project SE\\Image\\225600.jpg"));
		label.setBounds(0, 0, 834, 661);
		contentPane.add(label);
	}
	JLabel label_2;
	public void setResult(int  labal_2){
		label_2.setText(Integer.toString(labal_2));
		
		
	}
	JLabel label_1;
	public void setName(String labal_3){
		label_1.setText(labal_3);
	}
}
