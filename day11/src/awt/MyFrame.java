package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame {		// ȭ�鿡 �����ִ� UI
	// Field
	Frame f;
	Button b;		// ��ư
	
	// Constructor
	public MyFrame() {
		f = new Frame("My Frame");	// ȭ�鿡 �������� ��ü
		b = new Button("Click");
		b.addActionListener(new ActionListener() {		// ��ư�� event ���̱�
			
			@Override
			public void actionPerformed(ActionEvent e) {	// ��ư ������ �� ó��
				b.setLabel("Clicked");
			}
		});
	}
	
	// Method
	public void setView() {
		f.add(b, "North");	// ���ʿ� ��ư �ޱ�
		f.setSize(300,200);	// ������
		f.setVisible(true);	// ȭ�鿡 ��������
		f.addWindowListener(new WindowAdapter() {		// �����ӿ� event�� �����ڴ�.
														// Anonymous Class
			@Override
			public void windowClosing(WindowEvent e) {	// x������ ȭ�� ������ �ϱ�
				System.exit(0);
			}
			
		});
	}
}
