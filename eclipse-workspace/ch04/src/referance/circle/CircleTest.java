package referance.circle;

public class CircleTest {

	public static void main(String[] args) {
		/*Circle c1 = new Circle(2, 3, 5);
		c1.showCircleInfo();
		
		Circle c2 = new Circle(10, 12, 10);
		c2.showCircleInfo();*/
		
		
		//객체.new 배열(1)					//우리가 만든 거라 앞에 new (new circle)
		/*Circle[] circle = {
			new Circle(2, 3, 5),				//circle[0]		
			new Circle(10, 12, 10),				//circle[1]
			new Circle(-10, -12, 10),			//circle[2]
		};*/
		
		//객체.new 배열(2) - 한번에 공간 만들어 놓기
		Circle[] circle = new Circle[3];
		circle[0] = new Circle(2, 3, 5);
		circle[1] = new Circle(10, 12, 10);
		circle[2] = new Circle(-10, -12, 10);
		
		//2번 인덱스 출력
		circle[0].showCircleInfo();  	//[0] -> 출력값 : 2, 3, 5....
		System.out.println("====================================");								
		
		//전체 조회
		for(int i=0; i<circle.length; i++) {
			circle[i].showCircleInfo();
		}
		
		
		
	}

}
