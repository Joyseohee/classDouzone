package ex07.innerclass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 2.
public class InnerMain {

	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스");		// window를 가짐
		Button btn = new Button("Button - Start");
		
//		EventHandler handler = new InnerMain().new EventHandler();
//		btn.addActionListener(handler);	// add the ActionEvent in button.
		
		btn.addActionListener(new ActionListener() {	// innerClass 사용률 적을 땐 무명 클래스로
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent Occured");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println();
			}
		});
		
		frame.addWindowListener(new WindowAdapter() {	// anonymous inner class

			@Override
			public void windowClosing(WindowEvent e) {	// window closing
				System.exit(0);
			}
			
		}); // finish the parameter and method line
		
		frame.add(btn);	// add the button component in Frame.
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setLocation(600, 300);
	}
}

/*
// 1.
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Event;

public class InnerMain {	// OuterClass
	class EventHandler implements ActionListener {	// InnerClass

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Occured ActionEvent");
		}
	}

	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스");		// window를 가짐
		Button btn = new Button("Button - Start");
		
		// 1.
		EventHandler handler = new InnerMain().new EventHandler();
		btn.addActionListener(handler);	// add the ActionEvent in button.
		
		frame.add(btn);	// add the button component in Frame.
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(600, 300);
	}
}

//*/