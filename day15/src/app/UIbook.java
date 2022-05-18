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

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class UIbook {
	// Field
	Dao<Integer, BookVo> dao;
	java.util.List<BookVo> blist;
	Frame f;
	Button b1,b2,b3,b4,b5;
	Panel p1,p2,main;
	TextField tf1,tf2,tf3,maintf;
	List list;
	int a = 0;
	
	// Constructor
	public UIbook() {
		dao = new BookDao();
		init();
		make();
		addEvent();
	}
	
	// Method
	public void init() {	// ������Ʈ ����
		f = new Frame("å �߰�/����/��ȸ/����");
		b1 = new Button("å ���� �߰�");
		b2 = new Button("å ���� ��ȸ");
		b3 = new Button("å ���� ����");
		b4 = new Button("å ���� ����");
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
		p1.setBackground(Color.LIGHT_GRAY);	// �Ƕ��� ���� ���ϱ�
		p2.setBackground(Color.GRAY);
		
		p2.setLayout(new BorderLayout());
		p2.add(list,"Center");
		p2.add(b2,"South");	// ��ȸ
		
		p1.setLayout(new GridLayout(7, 1));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
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
	}
	public void addEvent() {	// �̺�Ʈ �����
		list.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int t = list.getSelectedIndex();
				BookVo book = blist.get(t);
				String s = "ISBN: "+book.getIsbn()+", å ����: "+book.getName()+", ����: "+book.getAuthor()+", ���� ���� ����:"+book.isStatus();
				maintf.setText(s);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// å �߰�
				a = 1;
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(false);
				tf1.setText("���ο� å ������ �Է����ּ���.");
				tf2.setText("���ο� å�� ���ڸ� �Է����ּ���.");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// list
				try {
					list.removeAll();
					blist = dao.select();
					for (BookVo b : blist) {
						String str = "ISBN: "+b.getIsbn()+", å ����: "+b.getName()+", ����: "+b.getAuthor()+", ���� ���� ����:"+b.isStatus();
						list.add(str);
						maintf.setText(blist.size()+": Completed");
					}
				} catch (Exception e1) {
					maintf.setText(e1.getMessage());
				}
			}
		});
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// å ���� ����
				a = 2;
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(true);
				tf1.setText("�����Ͻ� å�� ISBN�� �����ּ���.");
				tf2.setText("������ å ������ �����ּ���.");
				tf3.setText("������ å�� ���ڸ� �Է����ּ���.");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// å ���� ����
				a = 3;
				tf1.setVisible(true);
				tf2.setVisible(false);
				tf3.setVisible(false);
				tf1.setText("�����Ͻ� å�� ISBN�� �����ּ���.");
			}
		});
		
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				while (a == 1) {	// �߰�
					try {
						String name = tf1.getText();
						String author = tf2.getText();
						BookVo v = new BookVo(name, author);
						dao.insert(v);
						maintf.setText(name+"  å ������ �ԷµǾ����ϴ�.");
					} catch (Exception e1) {
						maintf.setText("�߸��� �Է� �����Դϴ�.");
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
				while (a == 2) {	// ����
					try {
						int isbn = Integer.parseInt(tf1.getText());
						String name = tf2.getText();
						String author = tf3.getText();
						BookVo b = new BookVo(isbn,name,author);
						dao.update(b);
						maintf.setText("ISBN: "+b.getIsbn()+", ����: "+b.getName()+", ����: "+b.getAuthor()+"  å ������ �����Ǿ����ϴ�.");
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
				while (a == 3) {	// ����
					try {
						int isbn = Integer.parseInt(tf1.getText());
						BookVo b = dao.select(isbn);
						String name = b.getName();
						String author = b.getAuthor();
						dao.delete(isbn);
						maintf.setText("ISBN: "+isbn+", ����: "+name+", ����: "+author+"  å ������ �����Ǿ����ϴ�.");
					} catch(NumberFormatException e1) {
						maintf.setText("�߸��� ISBN �����Դϴ�.");
					} catch(Exception e2) {
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
