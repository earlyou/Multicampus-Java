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

public class UI {	// 화면 만들기
	// Field
	Dao<String, CustVo> dao;
	java.util.List<CustVo> clist;	// 서로 다른 라이브러리에 있는 같은 이름의 객체는 이렇게 들어감
	Frame f;
	Button b1,b2;	// 버튼 만들기
	Panel p1,p2;	// 판때기
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
	public void init() {	// 컴포넌트 생성
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
	public void make() {	// 사이즈 조절
//		f.add(b1,"North");	// 버튼 붙히기
		p1.setBackground(Color.red);	// 판떼기 색깔 정하기
		p2.setBackground(Color.blue);
		
		p2.setLayout(new BorderLayout());	// p2의 속성 바꾸기
		p2.add(list,"Center");
		p2.add(b2,"South");
		
		p1.setLayout(new GridLayout(6, 1));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(b1);	// 판때기에 버튼 붙히기
		
		main.setLayout(new GridLayout(1, 2));		// 1행,2열로 레이아웃을 나눈다. 그리드 형태로
		main.add(p1);	// 그리드를 나누고 판떼기 붙히기
		main.add(p2);
		
		f.add(main,"Center");
		f.add(maintf,"South");
		
		f.setSize(500,500);
		f.setVisible(true);
	}
	public void addEvent() {// 이벤트 만들기
		
		list.addActionListener(new ActionListener() {	// list에 이벤트 붙히기
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int t = list.getSelectedIndex();	// t에 list 주소를 넣기
				CustVo cust = clist.get(t);	// 0번째 고객정보가 나온다.
				String s = cust.getId()+" "+cust.getPwd()+" "+cust.getName();
				maintf.setText(s);		// int를 String으로 바꾸기 위해 ""더해줌
			}
		});
		
		b1.addActionListener(new ActionListener() {	// 버튼 클릭했을 때 이벤트
			@Override
			public void actionPerformed(ActionEvent e) {	// add
				String id = tf1.getText();		// 입력된 값에서 끄집어 내기
				String pwd = tf2.getText();
				String name = tf3.getText();
				CustVo v = new CustVo(id, pwd, name);
				try {
					dao.insert(v);
					tf1.setText("");	// 작동하면 없어지게 만듦
					tf2.setText("");
					tf3.setText("");
					maintf.setText(id+"  Insert OK");
				} catch (Exception e1) {
					tf1.setText("");	// 작동하면 없어지게 만듦
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
			public void windowClosing(WindowEvent e) {	// 종료 이벤트
				System.exit(0);
			}
			
		});
	}
}
