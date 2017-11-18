import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FontSmall extends JFrame {
	public FontSmall() {
		setTitle("+,- Ű�� ��Ʈ ũ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.setFont(new Font("TimesRoman", Font.PLAIN, 10)); // 10 �ȼ� ũ��
		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {			//+Ű ����ϸ� ũ�Ⱑ Ŀ��
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("TimesRoman", Font.PLAIN, size+5)); 					
				}
				else if(e.getKeyChar() == '-') {		//-Ű ���� ����ũ�� �پ��.
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("TimesRoman", Font.PLAIN, size-5)); //5��Ʈ ���Ϸ� �ȳ������� ����					
				}				
			}
		});
		setSize(300,150);
		setVisible(true);
		
		label.setFocusable(true); // ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		label.requestFocus(); // ���̺��� Ű �Է� ��Ŀ�� ����
	}
	static public void main(String [] args) {
		new FontSmall();
	}
}