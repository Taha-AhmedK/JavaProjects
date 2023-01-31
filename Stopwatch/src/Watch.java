import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Watch implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton startbtn = new JButton("Start");
	JButton stopbtn = new JButton("Stop");
	JButton resetbtn = new JButton("Reset");
	JLabel timeLabel = new JLabel();
	
	boolean started = false;
	int elapsedTime = 0;
	int seconds = 0;
	int minutes =0;
	int hours = 0 ;
	String seconds_str = String.format("%02d", seconds);
	String minutes_str = String.format("%02d", minutes);
	String hours_str = String.format("%02d", hours);
	Timer timer = new Timer(1000,new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			elapsedTime += 1000;
			seconds = (elapsedTime/1000) %60;
			minutes = (elapsedTime/60000)%60 ;
			hours = (elapsedTime/3600000) ;
			
			seconds_str = String.format("%02d", seconds);
			minutes_str = String.format("%02d", minutes);
			hours_str = String.format("%02d", hours);
			
			timeLabel.setText(hours_str+":"+minutes_str+":"+seconds_str);
		}
		
		
	});
	
	Watch(){
		
		timeLabel.setText(hours_str+":"+minutes_str+":"+seconds_str);
		timeLabel.setBounds(50,100,400,100);
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,36));
		timeLabel.setBorder(BorderFactory.createRaisedBevelBorder());
		timeLabel.setOpaque(true);
		timeLabel.setHorizontalAlignment(JTextField.CENTER);
		
		startbtn.setBounds(140 , 250 , 100, 50);
		startbtn.setFont(new Font("Arial",Font.PLAIN,20));
		startbtn.setBackground(Color.GREEN);
		startbtn.setFocusable(false);
		startbtn.addActionListener(this);
		
		resetbtn.setBounds(250 , 250 , 100, 50);
		resetbtn.setFont(new Font("Arial",Font.PLAIN,20));
		resetbtn.setFocusable(false);
		resetbtn.addActionListener(this);
		resetbtn.setBackground(Color.cyan);
		
		frame.add(timeLabel);
		frame.add(startbtn);
		frame.add(resetbtn);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==startbtn) {
			if (started==false) {
				started=true;
				startbtn.setText("Stop");
				startbtn.setBackground(Color.red);
				start();
			}
			else {
				started=false;
				startbtn.setText("Start");
				stop();
			}
			
		}
		if(e.getSource()==resetbtn) {
			started=false;
			startbtn.setText("Start");
			startbtn.setBackground(Color.green);
			reset();
		}
		
	}
	void start() {
		timer.start();
	}
	
	void stop() {
		timer.stop();
	}
	void reset() {
		timer.stop();
		elapsedTime=0;
		seconds=0;
		minutes=0;
		hours=0;
		seconds_str = String.format("%02d", seconds);
		minutes_str = String.format("%02d", minutes);
		hours_str = String.format("%02d", hours);
		timeLabel.setText(hours_str+":"+minutes_str+":"+seconds_str);

		
	}
	
} 
