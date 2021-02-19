package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Employee;
import model.EmployeeDB;
import view.EmpoyeePanel;
import view.MenuScreen;

public class EmployeeEventListener implements ActionListener {
	private EmpoyeePanel panel;
	private ArrayList<Employee> emps = new ArrayList<>();

	public EmployeeEventListener(EmpoyeePanel panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if (button == panel.getExitButton()) {
			panel.getWindow().getContentPane().removeAll();
			var menu = new MenuScreen(panel.getWindow());
			menu.init();
			panel.getWindow().pack();
			panel.getWindow().revalidate();
		} else if (button == panel.getViewEmpButton()) {
			int index = panel.getEmpCanvas().getEmpIndex();
			++index;
			if (index == EmployeeDB.getAllemployees().size()) {
				index = 0;
			}
			panel.getEmpCanvas().setEmpIndex(index);
			panel.getEmpCanvas().repaint();
		} else if (button == panel.getPrevEmpButton()) {
			int index = panel.getEmpCanvas().getEmpIndex();
			--index;
			if (index < 0) {
				index = EmployeeDB.getAllemployees().size();
			}
			panel.getEmpCanvas().setEmpIndex(index);
			panel.getEmpCanvas().repaint();
		} else if (button == panel.getAddEmpButton()) {
			String msgName = panel.getAddEmpNameArea().getText();
			String msgID = panel.getAddEmpIDField().getText();
			if (msgName.equals("") && msgID.equals("")) {
				JOptionPane.showMessageDialog(panel.getWindow(), "Sorry! Must Enter Employee ID or Name");
				return;
			} else {

				String empName = panel.getAddEmpNameArea().getText();
				String empID = panel.getAddEmpIDField().getText();
				if (empName.equals("") && !empID.equals("")) {
					emps = EmployeeDB.getAllemployees();
					for (var em : emps) {
						if (em.getId().contains(empID)) {
							System.out.println("Employee: "
							+em.getLastName()
							+ ", ID: "+em.getId());

						}
					}
					// System.out.println(empID);
					// panel.getAddEmpIDField().setText("");

				} else if (!empName.equals("") && empID.equals("")) {
					emps = EmployeeDB.getAllemployees();
					for (var ems : emps) {
						if (ems.getFirstName().contains(empName) || ems.getLastName().contains(empName)) {
							
						System.out.println("Employee: " 
						+ ems.getName()
						+ ", ID: "+ems.getId());
							
						}
					}

				}
				panel.getAddEmpNameArea().setText("");
				panel.getAddEmpIDField().setText("");
			}

		}

	}

	

}
