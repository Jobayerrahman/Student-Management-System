package GUILayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class AddStudent {

	private JFrame frame;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtDob;
	private JTextField txtClass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 537, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Tahoma", Font.ITALIC, 14));
		txtId.setText("                AUTO GENERATED");
		txtId.setEditable(false);
		txtId.setColumns(10);
		txtId.setBounds(155, 67, 260, 31);
		frame.getContentPane().add(txtId);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(155, 109, 260, 31);
		frame.getContentPane().add(txtName);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(155, 151, 260, 31);
		frame.getContentPane().add(txtAge);
		
		txtDob = new JTextField();
		txtDob.setColumns(10);
		txtDob.setBounds(155, 193, 260, 31);
		frame.getContentPane().add(txtDob);
		
		txtClass = new JTextField();
		txtClass.setColumns(10);
		txtClass.setBounds(155, 235, 260, 31);
		frame.getContentPane().add(txtClass);
		
		JLabel label = new JLabel("Id");
		label.setFont(new Font("Verdana", Font.BOLD, 15));
		label.setBounds(37, 75, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Date of Birth");
		label_1.setFont(new Font("Verdana", Font.BOLD, 15));
		label_1.setBounds(37, 199, 117, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Name");
		label_2.setFont(new Font("Verdana", Font.BOLD, 15));
		label_2.setBounds(37, 117, 60, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Age");
		label_3.setFont(new Font("Verdana", Font.BOLD, 15));
		label_3.setBounds(37, 159, 60, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Class");
		label_4.setFont(new Font("Verdana", Font.BOLD, 15));
		label_4.setBounds(37, 243, 104, 14);
		frame.getContentPane().add(label_4);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Georgia", Font.BOLD, 15));
		btnSave.setBounds(326, 277, 89, 31);
		frame.getContentPane().add(btnSave);
	}

}
