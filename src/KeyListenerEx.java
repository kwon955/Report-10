import java.awt.*;				//import문 작성
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerEx extends JFrame {		
	public KeyListenerEx() {
		setTitle("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {	//유니코드가 아닌 left입력
					JLabel la = (JLabel)e.getSource();
					StringBuffer text  = new StringBuffer(la.getText());
					la.setText(text.reverse().toString());
				}
			}
		});
		c.add(label);
		setSize(250,100);
		setVisible(true);
		label.setFocusable(true); 
		label.requestFocus(); 
	}
	static public void main(String [] args) { //main문 작성하기
		new KeyListenerEx();
	}
}
