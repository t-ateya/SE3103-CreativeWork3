package view;

import javax.swing.JPanel;

import model.Employee;
import model.EmployeeDB;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class EmployeeCanvas extends JPanel {

	private static final long serialVersionUID = 1L;
	private EmpoyeePanel panel;
	private int empIndex = -1;

	public EmployeeCanvas(EmpoyeePanel panel) {
		this.setPanel(panel);
		setPreferredSize(new Dimension(600, 500));
		setBackground(Color.BLACK);
	}

	public EmpoyeePanel getPanel() {
		return panel;
	}

	public void setPanel(EmpoyeePanel panel) {
		this.panel = panel;
	}

	public void setEmpIndex(int empIndex) {
		this.empIndex = empIndex;
	}

	public int getEmpIndex() {
		return empIndex;
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		if (empIndex >= 0){
			Graphics2D g2 = (Graphics2D)g;

			Employee e = EmployeeDB.allEmployees.get(empIndex);
			e.render(g2);
		}
	}
}
