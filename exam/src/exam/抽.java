package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class ³é {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					³é window = new ³é();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ³é() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 835, 593);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel l = new JLabel("");
		l.setFont(new Font("ËÎÌå", Font.PLAIN, 30));
		l.setBounds(135, 70, 430, 148);
		frame.getContentPane().add(l);
		
		JButton button = new JButton("\u62BD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   int i = (int)(Math.random()*8+1);	
			   l.setText(i+"");
			}
		});
		button.setBounds(99, 266, 97, 23);
		frame.getContentPane().add(button);
		
		
	}
}
