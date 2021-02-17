package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Container;

public class MenuScreen {
	private JFrame window;

	public MenuScreen(JFrame window){
		this.window = window;
	}

	public void init(){
		Container cp = window.getContentPane();

		JPanel menuPanel = new JPanel();
		//menuPanel.setLayout(new GridLayout(2, 1));
		menuPanel.setPreferredSize(new Dimension(500, 500));

		JButton employeeButton = new JButton();
		menuPanel.add(employeeButton);
		cp.add(BorderLayout.CENTER, menuPanel);

		employeeButton.addActionListener(event->{
			window.getContentPane().removeAll();
			var panel = new EmployeePanel(window);
			panel.init();
			window.pack();
			window.revalidate();

		});
		
	}
	
	
}
