package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Footer extends JPanel{
	
	JButton addTask;
	JButton clear;
	
	
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	Footer()
	{
		this.setPreferredSize(new Dimension(400,60));
		this.setBackground(Color.gray);
		
		addTask = new JButton("Add Task");
		addTask.setFont(new Font("Arial",Font.PLAIN, 16));
		addTask.setVerticalAlignment(JButton.BOTTOM);
		addTask.setBackground(new Color(40,40,40));
		addTask.setForeground(Color.white);

		this.add(addTask);
		
		
		this.add(Box.createHorizontalStrut(20));
		clear = new JButton("Clear");
		clear.setFont(new Font("Arial",Font.PLAIN, 16));
		clear.setFocusPainted(false);
		clear.setToolTipText("Clear Finished Task");
		clear.setBackground(new Color(40,40,40));
		clear.setForeground(Color.white);
		
		this.add(clear);
		
		
	}
	
	public JButton getNewTask(){
		return addTask;
	}
	
	public JButton getClear() {
		return clear;
	}
}
