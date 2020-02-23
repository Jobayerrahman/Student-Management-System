package GUILayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.TextField;
import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.ScrollPane;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import DAOLayer.StudentDAO;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import EntityLayer.Student;
import TableModelLayer.StudentTableModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
//import javax.swing.text.html.AccessibleHTML.TableElementInfo.TableAccessibleContext;
public class StudentView {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentView window = new StudentView();
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
	public StudentView() {
		initialize();
		this.populateTable();
		
	}
	
	StudentDAO studentDAO= new StudentDAO();
    private JScrollPane tblStudent;
    private JTable table;
	private void populateTable() {
		ArrayList<Student> student= new ArrayList<Student>();
		student = studentDAO.GetAllStudent();
		//student.addAll(student);
		StudentTableModel studentTableModel = new StudentTableModel(student);
        table.setModel(studentTableModel);
		
	}
    
    
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(204, 255, 255));
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 240));
		panel.setForeground(new Color(0, 0, 255));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Action", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 102)));
		panel.setBounds(10, 38, 684, 72);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 16, 241, 41);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnSearch.setBounds(261, 19, 96, 32);
		panel.add(btnSearch);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnAdd.setBounds(367, 19, 96, 32);
		panel.add(btnAdd);
		
		JButton btnDlt = new JButton("Delete");
		btnDlt.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnDlt.setBounds(579, 19, 96, 32);
		panel.add(btnDlt);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnEdit.setBounds(473, 19, 96, 32);
		panel.add(btnEdit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 0, 128));
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Data", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(20, 121, 674, 312);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 24, 654, 277);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, textField, btnSearch, btnAdd, btnDlt, btnEdit}));
		frame.setBounds(100, 100, 726, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
