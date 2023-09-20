package nestedclass;

class A {
	
	A() {System.out.println("A 객체 생성");}
		
	//내부 멤버 클래스
	class B {
		int field1;
		//static int field1() {} //내부 클래스에서는 static 불가
		B() {System.out.println("B 객체 생성");}
		
		void method1() {}
	}
	//내부 점적 멤버 클래스
	static class C {
		int field1;
		static int field2;
		
		C() {System.out.println("C 객체 생성");}
		
		void method1() {}
		static void method2() {}
	}
	
	//메서드 내부 로컬 클래스 사용
	void method() {
		class D {
			int field1;
			D() {System.out.println("D 객체 생성");}
			void method1() {};
		}
	//D 객체 생성
	D d = new D();
	d.field1 = 10;
	d.method1();
	}
}

public class NestedClassTest {

	public static void main(String[] args) {
		//A 객체 생성
		A a = new A(); 
		
		//B 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//C 객체 생성
		//static이 있으면 A.C로 접근
		A.C c = new A.C();
		c.field1 = 2;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//D 클래스의 method 사용
		a.method();	
	}

}
