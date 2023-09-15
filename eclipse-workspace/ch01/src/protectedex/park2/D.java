package protectedex.park2;

import protectedex.park1.A;
//A를 상속 받음
public class D extends A {

	public D() {
		super();
		this.field = "응"; //"응"만 D에서 설정
		this.method();
	}
	
}
