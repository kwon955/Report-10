import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseMotionColor extends JFrame {		//클래스 생성
	public MouseMotionColor() {
		setTitle("드래깅동안 YELLOW...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.GREEN);		//컨텐트팬의 배경색을 초록색으로 설정
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		setSize(300,200);
		setVisible(true);
	}
	 class MyMouseListener implements MouseListener, MouseMotionListener {//마우스리스너, 마우스모션리스너 사용
		public void mousePressed(MouseEvent e) { }
		public void mouseReleased(MouseEvent e) {}
		public void mouseDragged(MouseEvent e) {	//드래그 시 노란색으로 배경색 변경
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
