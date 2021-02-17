package view;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;

public class EmployeeCanvas extends JPanel {
	private EmpoyeePanel panel;
	public EmployeeCanvas(EmpoyeePanel panel){
		this.panel = panel;
		setPreferredSize(new Dimension(600, 500));
		setBackground(Color.BLACK);
	}
	
}
