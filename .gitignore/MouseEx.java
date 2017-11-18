import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEx extends JFrame {		//JFrame을 상속받는 생성자 생성
	public MouseEx() {
		super("마우스 올리기 내리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();		//contentpane 생성
		c.setLayout(new FlowLayout());		
		
		JLabel label = new JLabel("Love Java");
		c.add(label); 
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");		
			}
			@Override
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");
			}			
		});
		setSize(250,150);			//크기 지정
		setVisible(true);
	}
	static public void main(String [] args) {	//main문 작성
		new MouseEx();
	}
}
