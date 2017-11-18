import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassListener extends JFrame{
	public InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Hello");
		btn.addActionListener(new MyActionListener());
		btn.addActionListener(new MyActionListener("1"));
		btn.addActionListener(new MyActionListener("2"));
		btn.addActionListener(new MyActionListener("3"));
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	private class MyActionListener implements ActionListener {
		private String msg;
		public MyActionListener(String msg) {this.msg = msg;}
		public MyActionListener() {
			// TODO Auto-generated constructor stub
		}
		public void actionPerformed(ActionEvent e) {System.out.println(msg); }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();
	}

}
