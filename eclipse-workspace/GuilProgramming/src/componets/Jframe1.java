package componets;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jframe1 {

	public static void main(String[] args) {
		//프레임 - 윈도우 전체
		JFrame frame = new JFrame();
		
		//제목 표시줄 -
		frame.setTitle("처음 만드는 윈도우");
		frame.setSize(300, 200);		//300px : 너비, 200px : 높이
		frame.setLocation(200, 100); 	//x 좌표 - 200, y 좌표 : 100
		
		//레이블 (글자 출력)
		JLabel label = new JLabel("HI JAVA");
		//label.setText("HI JAVA");
		
		//레이블 정렬(Alignment : 왼쪽, 가운데, 오른쪽)
		label.setHorizontalAlignment(JLabel.CENTER);
		//BorderLayout - 프레임을 동서남북, 중앙으로 배치
		frame.add(label, BorderLayout.CENTER);
		
		//버튼 생성
		JButton btn = new JButton("확인");
		frame.add(btn, BorderLayout.SOUTH);
		
		//윈도우 종료(닫기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우 디스플레이
		frame.setVisible(true);

	}
}
