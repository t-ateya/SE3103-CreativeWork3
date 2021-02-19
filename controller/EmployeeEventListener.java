package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.EmployeeDB;
import view.EmpoyeePanel;
import view.MenuScreen;

public class EmployeeEventListener implements ActionListener {
	private EmpoyeePanel panel;

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
		}else if (button == panel.getAddEmpButton()){
			String msgName = panel.getAddEmpNameArea().getText();
			String msgID = panel.getAddEmpIDField().getText();
			if (msgName.equals("") && msgID.equals("")){
				JOptionPane.showMessageDialog(panel.getWindow(), "Sorry! Must Enter Employee ID or Name");
			} else{
				String empName = panel.getAddEmpNameArea().getText();
				String empID = panel.getAddEmpIDField().getText();
				if (empName.equals("")){
					System.out.println(empID);
					panel.getAddEmpIDField().setText("");

				}else{
					System.out.println(empName);
					panel.getAddEmpNameArea().setText("");
				}
			}



		}

	}

}
