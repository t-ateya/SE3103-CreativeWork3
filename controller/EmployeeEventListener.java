package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.EmpoyeePanel;

public class EmployeeEventListener implements ActionListener {
	private EmpoyeePanel panel;

	public EmployeeEventListener (EmpoyeePanel panel){
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

	}
	
}
