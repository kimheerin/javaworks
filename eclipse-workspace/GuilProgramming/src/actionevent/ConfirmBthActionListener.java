package actionevent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfirmBthActionListener implements ActionListener {
	
	//필드
	JTextField text;
	JLabel label;
	
	//생성자
	public ConfirmBthActionListener(JTextField text, JLabel label) {
		this.text = text;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			//버튼을 클릭했을 때 상태 구현 : 입력된 이름을 가져와서 레이블에서 출력
			String name = text.getText();
			label.setText("HELLO" + name);
	}
}