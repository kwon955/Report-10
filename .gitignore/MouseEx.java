import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEx extends JFrame {		//JFrame�� ��ӹ޴� ������ ����
	public MouseEx() {
		super("���콺 �ø��� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();		//contentpane ����
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
				la.setText("�����");
			}			
		});
		setSize(250,150);			//ũ�� ����
		setVisible(true);
	}
	static public void main(String [] args) {	//main�� �ۼ�
		new MouseEx();
	}
}
