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

import dao.RentDao;
import frame.Dao;
import vo.BookVo;
import vo.MemberVo;
import vo.RentVo;

public class UIrent {
	// Field
	Dao<Integer, RentVo> daor;
	java.util.List<RentVo> rlist;
	Dao<Integer, BookVo> daob;
	java.util.List<BookVo> blist;
	Dao<String, MemberVo> daom;
	java.util.List<MemberVo> mlist;
	Frame f;
	Button b1,b2,b3,b4,b5;	// ��ư �����
	Panel p1,p2;					// �Ƕ���
	Panel main;
	TextField tf1,tf2,tf3;
	TextField maintf;
	List list;
	int a = 0;
		
	// Constructor
	public UIrent() {
		daor = new RentDao();
		init();
		make();
		addEvent();
	}
	
	// Method
	public void init() {	// ������Ʈ ����
		f = new Frame("����/����/�ݳ�");
		b1 = new Button("å ����");
		b2 = new Button("���� ���� ��ȸ");
		b3 = new Button("���� ����");
		b4 = new Button("å �ݳ�");
		b5 = new Button("Ȯ��");
		p1 = new Panel();
		p2 = new Panel();
		main = new Panel();
		maintf = new TextField();
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		list = new List();
	}
	
	public void make() {
		p1.setBackground(Color.LIGHT_GRAY);
		p2.setBackground(Color.GRAY);

		p2.setLayout(new BorderLayout());
		p2.add(list,"Center");
		p2.add(b2,"South");	// ���� ���
		
		p1.setLayout(new GridLayout(7, 1));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(b5);		// Ȯ��
		p1.add(b1);		// ���� a=1
		p1.add(b3);		// ���� a=2
		p1.add(b4);		// �ݳ� a=3
		
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
	}
	
	public void addEvent() {		// �̺�Ʈ �����
		list.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int t = list.getSelectedIndex();
				RentVo mem = rlist.get(t);
				String s = "���� ��ȣ: "+mem.getOrderNum()+", ISBN: "+mem.getIsbn()+", ID: "+mem.getId()+", ���� ��¥: "+mem.getRentDate()+", �ݳ� ��¥: "+mem.getReturnDate();
				maintf.setText(s);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// ����
				a = 1;
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(true);
				tf1.setText("å�� ISBN�� �Է����ּ���.");	
				tf2.setText("ȸ�� ID�� �Է����ּ���.");
				tf3.setText("ȸ�� ��й�ȣ�� �Է����ּ���.");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// list
				try {
					p2.add(list,"Center");
					list.removeAll();
					rlist = daor.select();
					for (RentVo r : rlist) {
						String str = "���� ��ȣ: "+r.getOrderNum()+", ISBN: "+r.getIsbn()+", ID: "+r.getId()+", ���� ��¥: "+r.getRentDate()+", �ݳ� ��¥: "+r.getReturnDate();
						list.add(str);
						maintf.setText(rlist.size()+": Completed");
					}
				} catch (Exception e1) {
					maintf.setText(e1.getMessage());
				}
			}
		});
		
		b3.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {	// ����
				a = 2;
				tf1.setVisible(true);
				tf2.setVisible(false);
				tf3.setVisible(false);
				tf1.setText("�ݳ� ������ ���� ���� ��ȣ�� �Է����ּ���.");	
			}
		});
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// �ݳ�
				a = 3;
				tf1.setVisible(true);
				tf2.setVisible(false);
				tf3.setVisible(false);
				tf1.setText("�ݳ��� ���� ���� ��ȣ�� �Է����ּ���.");
			}
		});
		
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// Ȯ�� ��ư
				while (a == 1) {	// ������ ��
					try {
						int isbn = Integer.parseInt(tf1.getText());
						String id = tf2.getText();
						String pwd = tf3.getText();
						RentVo r = new RentVo(isbn, id, pwd);
						daor.insert(r);
						rlist = daor.select();
						maintf.setText("���� ��ȣ: "+rlist.get(rlist.size()-1).getOrderNum()+"  ���� ������ �ԷµǾ����ϴ�.");
					} catch (NumberFormatException e1) {
						maintf.setText("�߸��� ISBN �����Դϴ�.");
					} catch (Exception e2) {
						maintf.setText(e2.getMessage());
					} finally {
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						a = 0;
					}
				}
				while (a == 2) {	// ������ ��
					try {
						int orderNum = Integer.parseInt(tf1.getText());
						RentVo r = new RentVo(orderNum);
						daor.update(r);
						maintf.setText("���� ��ȣ: "+orderNum+"  �ݳ��� 4�� ����ƽ���.");
					} catch (NumberFormatException e1) {
						maintf.setText("�߸��� ���� ��ȣ �����Դϴ�.");
					} catch (Exception e2) {
						maintf.setText(e2.getMessage());
					} finally {
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						a = 0;
					}
				}
				while (a == 3) {	// �ݳ��� ��
					try {
						int orderNum = Integer.parseInt(tf1.getText());
						daor.delete(orderNum);
						maintf.setText("���� ��ȣ: "+orderNum+"  �ݳ��� �Ϸ� �Ǿ����ϴ�.");
					} catch (NumberFormatException e1) {
						maintf.setText("�߸��� ISBN �����Դϴ�.");
					} catch (Exception e2) {
						maintf.setText(e2.getMessage());
					} finally {
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
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