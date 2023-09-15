package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		// 1 증가, 1 감소 연산자 (++, --) : 연속?? 사용
		
		//int num = 18;
		
		//num += 1;
		
		int num2 = 20;
		//num2 = num2 - 1;
		num2 -= 1;
		//num - -;
		System.out.println(num2);
		
		//복합 대입 연삽자 연습
		int val = 100;
		System.out.println(val += 1); 	//val = val +1	
		System.out.println(val -= 1);	//val = val - 1
		System.out.println(val *= 10);	//val = val * 10
		System.out.println(val /= 10); 	//val = val / 10
		

	}

}
