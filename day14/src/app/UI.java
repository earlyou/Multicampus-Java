package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class UI {	// ȭ�� �����
	// Field
	Dao<String, CustVo> dao;
	java.util.List<CustVo> clist;	// ���� �ٸ� ���̺귯���� �ִ� ���� �̸��� ��ü�� �̷��� ��
	Frame f;
	Button b1,b2;	// ��ư �����
	Panel p1,p2;	// �Ƕ���
	Panel main;
	TextField tf1, tf2, tf3;
	TextField maintf;
	List list;
	
	// Constructor
	public UI() {
		dao = new CustDao();
		init();
		make();
		addEvent();
	}
	
	// Method
	public void init() {	// ������Ʈ ����
		f = new Frame("My Frame");
		b1 = new Button("ADD");
		b2 = new Button("SELECT");
		p1 = new Panel();
		p2 = new Panel();
		main = new Panel();
		maintf = new TextField();
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		list = new List();
	}
	public void make() {	// ������ ����
//		f.add(b1,"North");	// ��ư ������
		p1.setBackground(Color.red);	// �Ƕ��� ���� ���ϱ�
		p2.setBackground(Color.blue);
		
		p2.setLayout(new BorderLayout());	// p2�� �Ӽ� �ٲٱ�
		p2.add(list,"Center");
		p2.add(b2,"South");
		
		p1.setLayout(new GridLayout(6, 1));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(b1);	// �Ƕ��⿡ ��ư ������
		
		main.setLayout(new GridLayout(1, 2));		// 1��,2���� ���̾ƿ��� ������. �׸��� ���·�
		main.add(p1);	// �׸��带 ������ �Ƕ��� ������
		main.add(p2);
		
		f.add(main,"Center");
		f.add(maintf,"South");
		
		f.setSize(500,500);
		f.setVisible(true);
	}
	public void addEvent() {// �̺�Ʈ �����
		
		list.addActionListener(new ActionListener() {	// list�� �̺�Ʈ ������
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int t = list.getSelectedIndex();	// t�� list �ּҸ� �ֱ�
				CustVo cust = clist.get(t);	// 0��° �������� ���´�.
				String s = cust.getId()+" "+cust.getPwd()+" "+cust.getName();
				maintf.setText(s);		// int�� String���� �ٲٱ� ���� ""������
			}
		});
		
		b1.addActionListener(new ActionListener() {	// ��ư Ŭ������ �� �̺�Ʈ
			@Override
			public void actionPerformed(ActionEvent e) {	// add
				String id = tf1.getText();		// �Էµ� ������ ������ ����
				String pwd = tf2.getText();
				String name = tf3.getText();
				CustVo v = new CustVo(id, pwd, name);
				try {
					dao.insert(v);
					tf1.setText("");	// �۵��ϸ� �������� ����
					tf2.setText("");
					tf3.setText("");
					maintf.setText(id+"  Insert OK");
				} catch (Exception e1) {
					tf1.setText("");	// �۵��ϸ� �������� ����
					tf2.setText("");
					tf3.setText("");
					maintf.setText("Insert Error ...  !!!");
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// list
				try {
					clist = dao.select();
					for (CustVo c : clist) {
						String str = c.getId()+" "+c.getName();
						list.add(str);
						maintf.setText(clist.size()+": Completed");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
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
