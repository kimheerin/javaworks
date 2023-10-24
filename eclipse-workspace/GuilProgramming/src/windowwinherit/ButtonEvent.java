package windowwinherit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonEvent extends JFrame{
		//프레임 생성 - 상속을 받으면 frame 객체 생성 필요 없음
		//JFrame frame = new JFrame("레이아웃 해제");
		public ButtonEvent() {
		this.setTitle("버튼 이벤트");
		//this.setSize(250,100);
		this.setLocation(200,100);
		
		
		//컴포넌트 생성 - BorderLayout 배치(위쪽 입력, 버튼, 아래쪽 - 레이블)
		JTextField text = new JTextField();
		text.setPreferredSize(new Dimension(200, 40));
		text.setForeground(new Color(100, 100, 65));	//색상 표현법 - 1.16진수 ex)0xffffff, 2(255,255,255)
		text.setFont(new Font("맑은고딕", Font.PLAIN, 15)); //보통 굵기, 크기 15
		text.setBackground(Color.lightGray);
		
		JButton button = new JButton("확인");
		
		JLabel label = new JLabel("HELLO");
		label.setPreferredSize(new Dimension(200, 50));
		label.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		
		//프레임에 객체 추가
		this.add(text, BorderLayout.CENTER);
		this.add(button, BorderLayout.EAST);
		this.add(label, BorderLayout.SOUTH);

		//액션 이벤트
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = text.getText();
				label.setText("HELLO" + username);
			}
		};
		button.addActionListener(listener);
		this.pack(); //프레임 역할
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		}
	public static void main(String[] args) {
			ButtonEvent event = new ButtonEvent();
	
		}//main
}//class
