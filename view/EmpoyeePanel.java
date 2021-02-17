package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.EmployeeEventListener;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

public class EmpoyeePanel {
	private JFrame window;
	private EmployeeCanvas empCanvas;

	private JButton viewEmpButton = new JButton("View Employee");
	private JButton prevEmpButton = new JButton("Prev Employee");
	private JButton exitButton = new JButton("Exit");
	private JButton addEmpButton = new JButton("Add Employeee");
	private JButton delEmpButton = new JButton("Delete Employeee");
	private JTextArea addEmpNameArea = new JTextArea();
	private JTextField addEmpIDField = new JTextField(5);
	// private JTextArea delEmpNameArea = new JTextArea();
	private JTextField delEmpIDField = new JTextField(5);

	public EmpoyeePanel(JFrame window) {
		this.window = window;
	}

	public void init() {
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

		// crate employee canvas
		empCanvas = new EmployeeCanvas(this);
		empCanvas.removeAll();
		cp.add(BorderLayout.CENTER, empCanvas);

		EmployeeEventListener listener = new EmployeeEventListener(this);
		prevEmpButton.addActionListener(listener);
		viewEmpButton.addActionListener(listener);
		exitButton.addActionListener(listener);
		addEmpButton.addActionListener(listener);
		delEmpButton.addActionListener(listener);

	}

	public EmployeeCanvas getEmpCanvas() {
		return empCanvas;
	}

	public JTextField getAddEmpIDField() {
		return addEmpIDField;
	}

	public JTextArea getAddEmpNameArea() {
		return addEmpNameArea;
	}

	public JButton getAddEmpButton() {
		return addEmpButton;
	} 

	public JButton getDelEmpButton() {
		return delEmpButton;
	}
	public JTextField getDelEmpIDField() {
		return delEmpIDField;
	}

	

	public JButton getExitButton() {
		return exitButton;
	}

	public JButton getPrevEmpButton() {
		return prevEmpButton;
	}

	public JButton getViewEmpButton() {
		return viewEmpButton;
	}

	public JFrame getWindow() {
		return window;
	}
}
