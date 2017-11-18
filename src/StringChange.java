import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame4 extends JFrame
{
	JPanel P;
    JLabel La;
        String SB = "Love Java";
        Frame4()	//	생성자 생성
        {
                this.setTitle("문자열 바꾸기");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                P = new JPanel();
                La = new JLabel(SB);
                Key K = new Key();
                La.addKeyListener(K);
                P.add(La);
                this.add(P);
                this.setVisible(true);
                this.setSize(300, 300);
                La.requestFocus();		// JLabel에 포커스 설정
        }
        class Key implements KeyListener
        {
                public void keyPressed(KeyEvent e)
                {
                        if(e.getKeyCode() == KeyEvent.VK_LEFT)	// 왼쪽 화살표를 누르면 글자위치 변경
                        {
                                String StrStart, StrEnd;
                                StrStart = SB.substring(1);
                                StrEnd = SB.substring(0,1);
                                SB = StrStart + StrEnd;
                                La.setText(SB);
                        }
                }
                public void keyReleased(KeyEvent e) { }
                public void keyTyped(KeyEvent e){ }
        }
}
public class StringChange
{
        public static void main(String[] args)
        {
            new Frame4();
        }
}
