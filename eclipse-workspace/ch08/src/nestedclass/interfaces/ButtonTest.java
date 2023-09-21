package nestedclass.interfaces;

import nestedclass.interfaces.Button.OnClickListener;

public class ButtonTest {

	public static void main(String[] args) {
		//버튼 객체 생성
		Button button = new Button();
		
		//전화 걸기 객체 생성
		CallListener call = new CallListener();
		
		//문자 보내기 객체 생성
		//MassageListener msg = new MassageListener();	//얘 대신
		
		
		//전화 걸기 구현
		//call.OnClick();			//방법1
		button.setListener(call);	//방법2
		button.touch();
		
		//문자 보내기 구현
		button.setListener(new MassageListener());		//이렇게 가능
		button.touch();
		
		//사진 찍기 구현		//클래스 따로 만들지 않고 바로
		button.setListener(new Button.OnClickListener() {
			@Override
			public void OnClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		button.touch();
		
		//쇼핑 - 구매하기 구현	//클래스 따로 만들지 않고 바로
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void OnClick() {
				System.out.println("상품을 구매합니다.");
			}
		});
		button.touch();
	}

}
