package referance.circle;

public class Circle {
	Point center;	//point center = null(참, 클래스)
	int radius;
	
	public Circle(int x, int y, int radius) {
		center = new Point(x, y);	//center 객체가 생성됨
		this.radius = radius;
		
	}
	
	public void showCircleInfo() {
		System.out.println("원의 중심은 (" + center.x + ", " + center.y + ")이고 반지름은 " + 
							radius + "입니다.");
	}
	
}
