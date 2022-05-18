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
	public void init() {	// 컴포넌트 생성
		f = new Frame("회원 추가/수정/조회/삭제");
		b1 = new Button("회원 정보 추가");
		b2 = new Button("회원 정보 조회");
		b3 = new Button("회원 정보 수정");
		b4 = new Button("회원 정보 삭제");
		b5 = new Button("확인");
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
		p2.add(b2,"South");	// 조회
		
		p1.setLayout(new GridLayout(8, 1));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(tf4);
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
		tf4.setVisible(false);
	}
	
	public void addEvent() {// 이벤트 만들기
		list.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int t = list.getSelectedIndex();
				MemberVo mem = mlist.get(t);
				String s = "ID: "+mem.getId()+", 비밀번호: "+mem.getPwd()+", 성함: "+mem.getName();
				maintf.setText(s);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// 회원 정보 추가
				a = 1;
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(true);
				tf4.setVisible(false);
				tf1.setText("새로운 회원 ID를 적어주세요.");
				tf2.setText("비밀번호를 입력해주세요.");
				tf3.setText("성함을 입력해주세요.");
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
			public void actionPerformed(ActionEvent e) {	// 회원 정보 수정
				a = 2;
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(true);
				tf4.setVisible(true);
				tf1.setText("수정하실 회원의 ID를 적어주세요.");
				tf2.setText("비밀번호를 입력해주세요.");
				tf3.setText("변경된 비밀번호를 입력해주세요.");
				tf4.setText("변경된 성함을 입력해주세요.");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// 회원 삭제
				a = 3;
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(false);
				tf4.setVisible(false);
				tf1.setText("삭제하실 회원의 ID를 적어주세요.");
				tf2.setText("비밀번호를 입력해주세요.");
			}
		});
		
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				while (a == 1) {	// 새 회원
					try {
						String id = tf1.getText();
						String pwd = tf2.getText();
						String name = tf3.getText();
						MemberVo v = new MemberVo(id, pwd, name);
						dao.insert(v);
						maintf.setText("ID: "+v.getId()+", 비밀번호: "+v.getPwd()+", 성함: "+v.getName()+"   새로운 계정이 생성됐습니다.");
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
				while (a == 2) {	// 수정
					try {
						String id = tf1.getText();		// ID
						String pwd = tf2.getText();		// 기존 비번
						String npwd = tf3.getText();	// new pwd
						String nname = tf4.getText();	// new name
						MemberVo m = new MemberVo(id, npwd, nname);
						if(!dao.select(m.getId()).getPwd().equals(pwd)) {
							throw new Exception("비밀번호를 확인해주세요.");
						}
						dao.update(m);
						maintf.setText("ID: "+m.getId()+", 비밀번호: "+m.getPwd()+", 성함: "+m.getName()+"   회원 정보가 수정됐습니다.");
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
				while (a == 3) {	// 삭제\
					try {
						String id = tf1.getText();
						String pwd = tf2.getText();
						String name = dao.select(id).getName();
						if (!dao.select(id).getPwd().equals(pwd)) {
							throw new Exception("비밀번호를 확인해주세요.");
						}
						dao.delete(id);
						maintf.setText("ID: "+id+", 비밀번호: "+pwd+", 성함: "+name+"   회원 정보가 삭제됐습니다.");
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
			public void windowClosing(WindowEvent e) {	// 종료 이벤트
				f.dispose();
			}
			
		});
	}
}
