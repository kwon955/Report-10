import java.awt.*;				//import�� �ۼ�
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerEx extends JFrame {		
	public KeyListenerEx() {
		setTitle("Left Ű�� ���ڿ� ��ü");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {	//�����ڵ尡 �ƴ� left�Է�
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
	static public void main(String [] args) { //main�� �ۼ��ϱ�
		new KeyListenerEx();
	}
}
