package test;

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
import vo.RentVo;

public class RentUiTest {
	// Field
	Dao<Integer, RentVo> dao;
	java.util.List<RentVo> rlist;	// 서로 다른 라이브러리에 있는 같은 이름의 객체는 이렇게 들어감
	Frame f;
	Button b1,b2,b3,b4,b5;	// 버튼 만들기
	Panel p1,p2;			// 판때기
	Panel main;
	TextField tf1,tf2,tf3;
	TextField maintf;
	List list;
	int a = 0;
		
	// Constructor
	public RentUiTest() {
		dao = new RentDao();
		init();
		make();
		addEvent();
	}
	
	// Method
	public void init() {	// 컴포넌트 생성
		f = new Frame("대출/연장/반납");
		b1 = new Button("책 대출");
		b2 = new Button("대출 정보 조회");
		b3 = new Button("대출 연장");
		b4 = new Button("책 반납");
		b5 = new Button("확인");
		p1 = new Panel();
		p2 = new Panel();
		main = new Panel();
		maintf = new TextField();
		tf1 = new TextField("");
		tf2 = new TextField("");
		tf3 = new TextField("");
		list = new List();
	}
	
	public void make() {	// 사이즈 조절
		p1.setBackground(Color.LIGHT_GRAY);	// 판떼기 색깔 정하기
		p2.setBackground(Color.GRAY);
		
		p2.setLayout(new BorderLayout());	// p2의 속성 바꾸기
		p2.add(list,"Center");
		p2.add(b2,"South");	// 목록
		
		p1.setLayout(new GridLayout(7, 1));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(b5);		// 확인
		p1.add(b1);		// 대출 a=1
		p1.add(b3);		// 연장 a=2
		p1.add(b4);		// 반납 a=3
		
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
	
	public void addEvent() {		// 이벤트 만들기
		list.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int t = list.getSelectedIndex();
				RentVo mem = rlist.get(t);
				String s = "대출 번호: "+mem.getOrderNum()+", ISBN: "+mem.getIsbn()+", ID: "+mem.getId()+", 대출 날짜: "+mem.getRentDate()+", 반납 날짜: "+mem.getReturnDate();
				maintf.setText(s);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// 대출
				a = 1;
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(true);
				tf1.setText("책의 ISBN을 입력해주세요.");	
				tf2.setText("회원 ID를 입력해주세요.");
				tf3.setText("회원 비밀번호를 입력해주세요.");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// list
				try {
					list.removeAll();
					rlist = dao.select();
					for (RentVo r : rlist) {
						String str = "대출 번호: "+r.getOrderNum()+", ISBN: "+r.getIsbn()+", ID: "+r.getId()+", 대출 날짜: "+r.getRentDate()+", 반납 날짜: "+r.getReturnDate();
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
			public void actionPerformed(ActionEvent e) {	// 연장
				a = 2;
				tf1.setVisible(true);
				tf2.setVisible(false);
				tf3.setVisible(false);
				tf1.setText("반납 연장을 위해 orderNum을 입력해주세요.");	
			}
		});
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// 반납
				a = 3;
				tf1.setVisible(true);
				tf2.setVisible(false);
				tf3.setVisible(false);
				tf1.setText("반납을 위해 orderNum을 입력해주세요.");
			}
		});
		
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// 확인 버튼
				while (a == 1) {	// 대출할 때
					try {
						int isbn = Integer.parseInt(tf1.getText());
						String id = tf2.getText();
						String pwd = tf3.getText();
						RentVo r = new RentVo(isbn, id, pwd);
						dao.insert(r);
						rlist = dao.select();
						maintf.setText("Order Number: "+rlist.get(rlist.size()-1).getOrderNum()+"  대출 정보가 입력되었습니다.");
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						a = 0;
					} catch (NumberFormatException e1) {
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						maintf.setText("잘못된 ISBN 형식입니다.");
						a = 0;
					} catch (Exception e2) {
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						maintf.setText(e2.getMessage());
						a = 0;
					}
				}
				while (a == 2) {	// 연장할 때
					try {
						int orderNum = Integer.parseInt(tf1.getText());
						RentVo r = new RentVo(orderNum);
						dao.update(r);
						tf1.setText("반납 연장을 위해 orderNum을 입력해주세요.");
						maintf.setText("Order Number: "+orderNum+"  반납이 4일 연장됐습다.");
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						a = 0;
					} catch (NumberFormatException e1) {
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						maintf.setText("잘못된 orderNum 형식입니다.");
						a = 0;
					} catch (Exception e2) {
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						maintf.setText(e2.getMessage());
						a = 0;
					}
				}
				while (a == 3) {	// 반납할 때
					try {
						int orderNum = Integer.parseInt(tf1.getText());
						dao.delete(orderNum);
						tf1.setText("반납을 위해 orderNum을 입력해주세요.");	
						maintf.setText("Order Number: "+orderNum+"  반납이 완료 되었습니다.");
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						a = 0;
					} catch (NumberFormatException e1) {
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						maintf.setText("잘못된 ISBN 형식입니다.");
						a = 0;
					} catch (Exception e2) {
						tf1.setVisible(false);
						tf2.setVisible(false);
						tf3.setVisible(false);
						tf1.setText("");	
						tf2.setText("");
						tf3.setText("");
						maintf.setText(e2.getMessage());
						a = 0;
					}
				}
			}
		});
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {	// 종료 이벤트
				System.exit(0);
			}
			
		});
	}

}
