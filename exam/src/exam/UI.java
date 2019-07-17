package exam;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;

import pojo.Student;
import utils.Read;

public class UI {

	private JFrame frame;
	List<String> ques = new ArrayList<>();
	List<Student> stus = new ArrayList<>();
	private JTextField t;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
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
	public UI() {
		initialize();
		try {
			ques=Read.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u8BD5\u9898\u62BD\u7B7E\u7CFB\u7EDF");
		frame.setBounds(100, 100, 1203, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		t = new JTextField();
		t.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		t.setBounds(84, 201, 1002, 54);
		frame.getContentPane().add(t);
		t.setColumns(10);
		
		JButton button = new JButton("\u62BD\u95EE\u9898");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=(int)(Math.random()*ques.size());
				t.setText(ques.get(i));
				ques.remove(i);
				if(ques.size()<=0) {
					t.setText("问完了");
				}
			}
		});
		button.setFont(new Font("黑体", Font.PLAIN, 28));
		button.setBounds(65, 64, 135, 54);
		frame.getContentPane().add(button);
		
		
		
	
		
		
		
		
	}
}
