import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame6 extends JFrame
{
        JPanel P;
        JLabel La;
        Frame6()		//	JFrame �����ϱ�
        {
                this.setTitle("���콺 �ø���");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                P = new JPanel();
                P.setLayout(null);
                La = new JLabel("C");	// C�� Frame�� ��µ�	
                La.setSize(20, 20);
                La.setLocation(100, 100);
                Mouse Mo = new Mouse();
                La.addMouseListener(Mo);
                P.add(La);
                this.add(P);
                this.setVisible(true);
                this.setSize(350, 350);	//	Frame ũ�� ����
        }
        class Mouse implements MouseListener	// ���콺 ������ ���
        {
                public void mouseClicked(MouseEvent e)	//���콺 Ŭ���� ������ ��ġ�� ������
                {
                        JLabel La = (JLabel)e.getSource();
                        int X = (int)(Math.random()*300);
                        int Y = (int)(Math.random()*300);
                        La.setLocation(X, Y);
                }
                public void mouseEntered(MouseEvent e){}

                public void mouseExited(MouseEvent e){}

                public void mousePressed(MouseEvent e){}

                public void mouseReleased(MouseEvent e){}
        }
}
public class ClickSwing
{
        public static void main(String[] args)
        {
                new Frame6();
        }
}
