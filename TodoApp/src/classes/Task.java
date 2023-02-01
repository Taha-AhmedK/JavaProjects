package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel{
	
	JLabel index;
	JTextField taskName;
	JButton done;
	
	private boolean checked;
	
	Task()
	{
		this.setPreferredSize(new Dimension(400,20));
		this.setBackground(Color.black);
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		index.setForeground(Color.white);
		this.add(index,BorderLayout.WEST);
	
		taskName = new JTextField("Enter Text Here");
		taskName.setForeground(Color.white);
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(Color.gray);

		
		this.add(taskName,BorderLayout.CENTER);
		
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setBackground(Color.black);
		done.setForeground(Color.white);
		done.setFocusPainted(false);
		
		this.add(done,BorderLayout.EAST);
		
	}
	
	public void changeIndex(int num)
	{
		this.index.setText(num+"");
		this.revalidate();
	}
	
	
	public JButton getDone()
	{
		return done;
	}
	
	public boolean getState()
	{
		return checked;
	}
	
	public void changeState()
	{
		this.setBackground(new Color(62, 113, 23));
		taskName.setBackground(new Color(183, 238, 141));
		taskName.setForeground(Color.black);
		checked = true;
		revalidate();
	}
}
