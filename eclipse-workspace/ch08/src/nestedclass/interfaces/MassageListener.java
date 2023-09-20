package nestedclass.interfaces;

//Button 내부의 인터페이스를 구현한 클래스 정의
public class MassageListener implements Button.OnClickListener {

	@Override
	public void OnClick() {
		System.out.println("문자를 보냅니다.");	
	}
}
