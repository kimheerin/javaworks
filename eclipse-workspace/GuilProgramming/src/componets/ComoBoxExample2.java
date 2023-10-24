package componets;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComoBoxExample2 extends JFrame implements ActionListener {

	//필드
	String[] currency = {"달러", "위안", "유로", "원화"};
	JComboBox<String> comboBox;
	JLabel label;
	
	//생성자
	public ComoBoxExample2 (){
		//프레임
		this.setTitle("목록 상자");
		this.setLocation(200, 100);
		this.setSize(300, 300);
		
		//컴포넌트 객체 생성
		
	    comboBox = new JComboBox<>(currency);
	    label = new JLabel("화폐를 선택해 주세요.");
	       
		//배치 = BorderLayout
		this.add(comboBox, BorderLayout.NORTH);
		this.add(label, BorderLayout.CENTER);
		
		//콤보 이벤트
		
		comboBox.addActionListener(this);
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}
	public static void main(String[] args) {
		new ComoBoxExample2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	      String currency =(String)comboBox.getSelectedItem();
	      label.setText(currency+ "를 선택하셨습니다.");
	}
}