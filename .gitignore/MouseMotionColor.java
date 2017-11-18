import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseMotionColor extends JFrame {		//Ŭ���� ����
	public MouseMotionColor() {
		setTitle("�巡�뵿�� YELLOW...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.GREEN);		//����Ʈ���� ������ �ʷϻ����� ����
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		setSize(300,200);
		setVisible(true);
	}
	 class MyMouseListener implements MouseListener, MouseMotionListener {//���콺������, ���콺��Ǹ����� ���
		public void mousePressed(MouseEvent e) { }
		public void mouseReleased(MouseEvent e) {}
		public void mouseDragged(MouseEvent e) {	//�巡�� �� ��������� ���� ����
		Component c = (Component)e.getSource(); 
		c.setBackground(Color.YELLOW);
		}
		public void mouseMoved(MouseEvent e) {}
	
		public void mouseClicked(MouseEvent e) {}
	
		public void mouseEntered(MouseEvent e) {}
		
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseMotionColor();
	}

}
