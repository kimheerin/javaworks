package actionevent;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonActionEvent {

	public static void main(String[] args) {
		//프레임
		JFrame frame = new JFrame("레이아웃 예제");
		frame.setSize(300, 200);		//300px : 너비, 200px : 높이
		frame.setLocation(200, 100); 	//x 좌표 - 200, y 좌표 : 100
		
		//컴포넌트 생성 - JTextField(입력 상자), JButton, JLabel
		JTextField text = new JTextField();
		JButton btn = new JButton("확인");
		JLabel label = new JLabel("hello!");
		
		//button 이벤트
		ConfirmBthActionListener listener =
					new ConfirmBthActionListener(text, label);
		btn.addActionListener(listener);
		
		
		//컴포넌트 배치 - BorderLayout 사용
		frame.add(text, BorderLayout.CENTER);	//중앙
		
		btn.setPreferredSize(new Dimension(60, 40));	
		frame.add(btn, BorderLayout.EAST);		//버튼을 오른족에 위치
		
		label.setPreferredSize(new Dimension(250, 40));
		frame.add(label, BorderLayout.SOUTH);	//아래
		
		//디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
