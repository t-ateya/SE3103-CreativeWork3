package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.EmpoyeePanel;
import view.MenuScreen;

public class EmployeeEventListener implements ActionListener {
	private EmpoyeePanel panel;

	public EmployeeEventListener (EmpoyeePanel panel){
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		if (button == panel.getExitButton()){
			panel.getWindow().getContentPane().removeAll();
			var menu = new MenuScreen(panel.getWindow());
			menu.init();
			panel.getWindow().pack();
			panel.getWindow().revalidate();
		}

	}
	
}
