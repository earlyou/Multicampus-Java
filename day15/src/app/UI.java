package app;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UI {
	// Field
	Frame f;
	Button b1,b2,b3;	// ��ư �����
	Panel main;
	
	// Constructor
	public UI() {
		init();
		make();
		addEvent();
	}
	
	// Method
	public void init() {	// ������Ʈ ����
		f = new Frame("�������� ���Ű� ȯ���մϴ�.");
		b1 = new Button("å ���� ����");
		b2 = new Button("ȸ�� ���� ����");
		b3 = new Button("���� ���� ����");
		main = new Panel();
	}
	public void make() {
		main.setLayout(new GridLayout(1, 2));		// 1��,2���� ���̾ƿ��� ������. �׸��� ���·�
		
		main.add(b1);
		main.add(b2);
		main.add(b3);
		
		f.add(main,"Center");
		
		f.setSize(400,150);
		f.setVisible(true);
	}
	public void addEvent() {// �̺�Ʈ �����
		
		b1.addActionListener(new ActionListener() {	// ��ư Ŭ������ �� �̺�Ʈ
			@Override
			public void actionPerformed(ActionEvent e) {	// add
				UIbook bui = new UIbook();
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// list
				UImember mui = new UImember();
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// list
				UIrent rui = new UIrent();
			}
		});
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {	// ���� �̺�Ʈ
				System.exit(0);
			}
			
		});
	}
}
