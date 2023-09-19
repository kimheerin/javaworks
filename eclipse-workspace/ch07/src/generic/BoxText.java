package generic;

public class BoxText {

	public static void main(String[] args) {
		// 문자형 타입으로 객체 생성
		Box<String> box1 = new Box<>();
		
		box1.set("행운을 빌어요!");
		String msg = box1.get();
		System.out.println(msg);
		
		//숫자형 타입으로 객체 생성
		Box<Integer> box2 = new Box<>();
		
		box2.set(100);
		Integer num = box2.get();
		System.out.println(num);
		
		//Fruit형 타입으로 객체 생성
		Box<Fruit> box3 = new Box<>();
		
		Fruit fruit = new Fruit("apple!");
		box3.set(fruit);
		//box3.set(new Fruit("apple")); //이렇게 써도 됨
		
		Fruit apple = box3.get();
		System.out.println(apple);
	
	}

}
