import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame4 extends JFrame
{
	JPanel P;
    JLabel La;
        String SB = "Love Java";
        Frame4()	//	������ ����
        {
                this.setTitle("���ڿ� �ٲٱ�");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                P = new JPanel();
                La = new JLabel(SB);
                Key K = new Key();
                La.addKeyListener(K);
                P.add(La);
                this.add(P);
                this.setVisible(true);
                this.setSize(300, 300);
                La.requestFocus();		// JLabel�� ��Ŀ�� ����
        }
        class Key implements KeyListener
        {
                public void keyPressed(KeyEvent e)
                {
                        if(e.getKeyCode() == KeyEvent.VK_LEFT)	// ���� ȭ��ǥ�� ������ ������ġ ����
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
