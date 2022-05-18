package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame {		// 화면에 보여주는 UI
	// Field
	Frame f;
	Button b;		// 버튼
	
	// Constructor
	public MyFrame() {
		f = new Frame("My Frame");	// 화면에 보여지는 객체
		b = new Button("Click");
		b.addActionListener(new ActionListener() {		// 버튼에 event 붙이기
			
			@Override
			public void actionPerformed(ActionEvent e) {	// 버튼 눌렀을 때 처리
				b.setLabel("Clicked");
			}
		});
	}
	
	// Method
	public void setView() {
		f.add(b, "North");	// 북쪽에 버튼 달기
		f.setSize(300,200);	// 사이즈
		f.setVisible(true);	// 화면에 보여져라
		f.addWindowListener(new WindowAdapter() {		// 프레임에 event를 붙히겠다.
														// Anonymous Class
			@Override
			public void windowClosing(WindowEvent e) {	// x누르면 화면 꺼지게 하기
				System.exit(0);
			}
			
		});
	}
}
