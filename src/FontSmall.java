import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FontSmall extends JFrame {
	public FontSmall() {
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.setFont(new Font("TimesRoman", Font.PLAIN, 10)); // 10 픽셀 크기
		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {			//+키 사용하면 크기가 커짐
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("TimesRoman", Font.PLAIN, size+5)); 					
				}
				else if(e.getKeyChar() == '-') {		//-키 사용시 글자크기 줄어듦.
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("TimesRoman", Font.PLAIN, size-5)); //5폰트 이하로 안내려가게 설정					
				}				
			}
		});
		setSize(300,150);
		setVisible(true);
		
		label.setFocusable(true); // 레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus(); // 레이블에 키 입력 포커스 서정
	}
	static public void main(String [] args) {
		new FontSmall();
	}
}