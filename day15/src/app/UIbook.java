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
	public void init() {	// 컴포넌트 생성
		f = new Frame("책 추가/수정/조회/삭제");
		b1 = new Button("책 정보 추가");
		b2 = new Button("책 정보 조회");
		b3 = new Button("책 정보 수정");
		b4 = new Button("책 정보 삭제");
		b5 = new Button("확인");
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
		p1.setBackground(Color.LIGHT_GRAY);	// 판떼기 색깔 정하기
		p2.setBackground(Color.GRAY);
		
		p2.setLayout(new BorderLayout());
		p2.add(list,"Center");
		p2.add(b2,"South");	// 조회
		
		p1.setLayout(new GridLayout(7, 1));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(b5);		// 확인
		p1.add(b1);		// 추가 a=1
		p1.add(b3);		// 수정 a=2
		p1.add(b4);		// 삭제 a=3
		
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
	public void addEvent() {	// 이벤트 만들기
		list.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int t = list.getSelectedIndex();
				BookVo book = blist.get(t);
				String s = "ISBN: "+book.getIsbn()+", 책 제목: "+book.getName()+", 저자: "+book.getAuthor()+", 대출 가능 여부:"+book.isStatus();
				maintf.setText(s);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// 책 추가
				a = 1;
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(false);
				tf1.setText("새로운 책 제목을 입력해주세요.");
				tf2.setText("새로운 책의 저자를 입력해주세요.");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// list
				try {
					list.removeAll();
					blist = dao.select();
					for (BookVo b : blist) {
						String str = "ISBN: "+b.getIsbn()+", 책 제목: "+b.getName()+", 저자: "+b.getAuthor()+", 대출 가능 여부:"+b.isStatus();
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
			public void actionPerformed(ActionEvent e) {	// 책 정보 수정
				a = 2;
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(true);
				tf1.setText("수정하실 책의 ISBN을 적어주세요.");
				tf2.setText("수정된 책 제목을 적어주세요.");
				tf3.setText("수정된 책의 저자를 입력해주세요.");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// 책 정보 삭제
				a = 3;
				tf1.setVisible(true);
				tf2.setVisible(false);
				tf3.setVisible(false);
				tf1.setText("삭제하실 책의 ISBN을 적어주세요.");
			}
		});
		
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				while (a == 1) {	// 추가
					try {
						String name = tf1.getText();
						String author = tf2.getText();
						BookVo v = new BookVo(name, author);
						dao.insert(v);
						maintf.setText(name+"  책 정보가 입력되었습니다.");
					} catch (Exception e1) {
						maintf.setText("잘못된 입력 형식입니다.");
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
				while (a == 2) {	// 수정
					try {
						int isbn = Integer.parseInt(tf1.getText());
						String name = tf2.getText();
						String author = tf3.getText();
						BookVo b = new BookVo(isbn,name,author);
						dao.update(b);
						maintf.setText("ISBN: "+b.getIsbn()+", 제목: "+b.getName()+", 저자: "+b.getAuthor()+"  책 정보가 수정되었습니다.");
					} catch (NumberFormatException e1) {
						maintf.setText("잘못된 ISBN 형식입니다.");
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
				while (a == 3) {	// 삭제
					try {
						int isbn = Integer.parseInt(tf1.getText());
						BookVo b = dao.select(isbn);
						String name = b.getName();
						String author = b.getAuthor();
						dao.delete(isbn);
						maintf.setText("ISBN: "+isbn+", 제목: "+name+", 저자: "+author+"  책 정보가 삭제되었습니다.");
					} catch(NumberFormatException e1) {
						maintf.setText("잘못된 ISBN 형식입니다.");
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
			public void windowClosing(WindowEvent e) {	// 종료 이벤트
				f.dispose();
			}
		});
	}
}
