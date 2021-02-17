package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

public class EmpoyeePanel {
	private JFrame window;
	private EmployeeCanvas employeeCanvas;

	private JButton viewEmpButton = new JButton("View Employee");
	private JButton prevEmpButton = new JButton("Prev Employee");
	private JButton exitButton = new JButton("Exit");
	private JButton addEmployee = new JButton("Add Employeee");
	private JButton deleteEmployee = new JButton("Delete Employeee");
	private JTextArea addEmpNameArea = new JTextArea();
	private JTextField addEmpIDField = new JTextField(5);
	//private JTextArea delEmpNameArea = new JTextArea();
	private JTextField delEmpIDField = new JTextField(5);	
	
	public EmpoyeePanel (JFrame window){
		this.window =window;
	}

	public void init(){
		Container cp = window.getContentPane();

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(2, 1));

		cp.add(BorderLayout.SOUTH, southPanel);
		
		JPanel south1 = new JPanel();
		south1.add(new JLabel("INPUT EMPLOYEE NAME TO ADD: "));
		south1.add(addEmpNameArea);
		south1.add(new JLabel("INPUT EMLOYEE ID TO ADD: "));
		south1.add(addEmpIDField);
		south1.add(new JLabel("INPUT ID TO DELETE EMPLOYEE: "));
		south1.add(delEmpIDField);
		southPanel.add(south1);

		JPanel south2 = new JPanel();
		south2.add(prevEmpButton);
		south2.add(viewEmpButton);
		south2.add(exitButton);
		southPanel.add(south2);

		

	}
}
