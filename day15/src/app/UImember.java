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

import dao.MemberDao;
import frame.Dao;
import vo.MemberVo;

public class UImember {
	// Field
	Dao<String, MemberVo> dao;
	java.util.List<MemberVo> mlist;
	Frame f;
	Button b1,b2,b3,b4,b5;
	Panel p1,p2,main;
	TextField tf1,tf2,tf3,tf4,maintf;
	List list;
	int a = 0;
	
	// Constructor
	public UImember() {
		dao = new MemberDao();
		init();
		make();
		addEvent();
	}
	
	// Method
	public void init() {	// ������Ʈ ����
		f = new Frame("ȸ�� �߰�/����/��ȸ/����");
		b1 = new Button("ȸ�� ���� �߰�");
		b2 = new Button("ȸ�� ���� ��ȸ");
		b3 = new Button("ȸ�� ���� ����");
		b4 = new Button("ȸ�� ���� ����");
		b5 = new Button("Ȯ��");
		p1 = new Panel();
		p2 = new Panel();
		main = new Panel();
		maintf = new TextField();
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		tf4 = new TextField();
		list = new List();
	}
	
	public void make() {
		p1.setBackground(Color.LIGHT_GRAY);
		p2.setBackground(Color.GRAY);
		
		p2.setLayout(new BorderLayout());
		p2.add(list,"Center");
		p2.add(b2,"South");	// ��ȸ
		
		p1.setLayout(new GridLayout(8, 1));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(tf4);
		p1.add(b5);		// Ȯ��
		p1.add(b1);		// �߰� a=1
		p1.add(b3);		// ���� a=2
		p1.add(b4);		// ���� a=3
		
		main.setLayout(new GridLayout(1, 2));
		main.add(p1);
		main.add(p2);
		
		f.add(main,"Center");
		f.add(maintf,"South");
		
		f.setSize(1000,500);
		f.setVisible(true);
		tf1.setVisible(false);
		tf2.setVisible(false);
		tf3.setVisible(false);
		tf4.setVisible(false);
	}
	
	public void addEvent() {// �̺�Ʈ �����
		list.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int t = list.getSelectedIndex();
				MemberVo mem = mlist.get(t);
				String s = "ID: "+mem.getId()+", ��й�ȣ: "+mem.getPwd()+", ����: "+mem.getName();
				maintf.setText(s);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// ȸ�� ���� �߰�
				a = 1;
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(true);
				tf4.setVisible(false);
				tf1.setText("���ο� ȸ�� ID�� �����ּ���.");
				tf2.setText("��й�ȣ�� �Է����ּ���.");
				tf3.setText("������ �Է����ּ���.");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// list
				try {
					list.removeAll();
					mlist = dao.select();
					for (MemberVo m : mlist) {
						String str = m.toString();
						list.add(str);
						maintf.setText(mlist.size()+": Completed");
					}
				} catch (Exception e1) {
					maintf.setText(e1.getMessage());
				}
			}
		});
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// ȸ�� ���� ����
				a = 2;
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(true);
				tf4.setVisible(true);
				tf1.setText("�����Ͻ� ȸ���� ID�� �����ּ���.");
				tf2.setText("��й�ȣ�� �Է����ּ���.");
				tf3.setText("����� ��й�ȣ�� �Է����ּ���.");
				tf4.setText("����� ������ �Է����ּ���.");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// ȸ�� ����
				a = 3;
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(false);
				tf4.setVisible(false);
				tf1.setText("�����Ͻ� ȸ���� ID�� �����ּ���.");
				tf2.setText("��й�ȣ�� �Է����ּ���.");
			}
		});
		
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				while (a == 1) {	// �� ȸ��
					try {
						String id = tf1.getText();
						String pwd = tf2.getText();
						String name = tf3.getText();
						MemberVo v = new MemberVo(id, pwd, name);
						dao.insert(v);
						maintf.setText("ID: "+v.getId()+", ��й�ȣ: "+v.getPwd()+", ����: "+v.getName()+"   ���ο� ������ �����ƽ��ϴ�.");
					} catch (Exception e1) {
						maintf.setText(e1.getMessage());
					} finally {
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf4.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						tf4.setText("");
						a = 0;
					}
				}
				while (a == 2) {	// ����
					try {
						String id = tf1.getText();		// ID
						String pwd = tf2.getText();		// ���� ���
						String npwd = tf3.getText();	// new pwd
						String nname = tf4.getText();	// new name
						MemberVo m = new MemberVo(id, npwd, nname);
						if(!dao.select(m.getId()).getPwd().equals(pwd)) {
							throw new Exception("��й�ȣ�� Ȯ�����ּ���.");
						}
						dao.update(m);
						maintf.setText("ID: "+m.getId()+", ��й�ȣ: "+m.getPwd()+", ����: "+m.getName()+"   ȸ�� ������ �����ƽ��ϴ�.");
					} catch (Exception e2) {
						maintf.setText(e2.getMessage());
					} finally {
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf4.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						tf4.setText("");
						a = 0;
					}
				}
				while (a == 3) {	// ����\
					try {
						String id = tf1.getText();
						String pwd = tf2.getText();
						String name = dao.select(id).getName();
						if (!dao.select(id).getPwd().equals(pwd)) {
							throw new Exception("��й�ȣ�� Ȯ�����ּ���.");
						}
						dao.delete(id);
						maintf.setText("ID: "+id+", ��й�ȣ: "+pwd+", ����: "+name+"   ȸ�� ������ �����ƽ��ϴ�.");
					} catch (Exception e2) {
						maintf.setText(e2.getMessage());
					} finally {
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf4.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						tf4.setText("");
						a = 0;
					}
				}
			}
		});
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {	// ���� �̺�Ʈ
				f.dispose();
			}
			
		});
	}
}
