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
	Button b1,b2,b3;	// 버튼 만들기
	Panel main;
	
	// Constructor
	public UI() {
		init();
		make();
		addEvent();
	}
	
	// Method
	public void init() {	// 컴포넌트 생성
		f = new Frame("도서관에 오신걸 환영합니다.");
		b1 = new Button("책 관련 업무");
		b2 = new Button("회원 관련 업무");
		b3 = new Button("대출 관련 업무");
		main = new Panel();
	}
	public void make() {
		main.setLayout(new GridLayout(1, 2));		// 1행,2열로 레이아웃을 나눈다. 그리드 형태로
		
		main.add(b1);
		main.add(b2);
		main.add(b3);
		
		f.add(main,"Center");
		
		f.setSize(400,150);
		f.setVisible(true);
	}
	public void addEvent() {// 이벤트 만들기
		
		b1.addActionListener(new ActionListener() {	// 버튼 클릭했을 때 이벤트
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
			public void windowClosing(WindowEvent e) {	// 종료 이벤트
				System.exit(0);
			}
			
		});
	}
}
