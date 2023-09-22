package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StrudentStreamTest {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("김희린", 80),
			new Student("최은호", 70),
			new Student("함소연", 90)
		);
		
		Stream<Student> stdStream = list.stream();
		stdStream.forEach(std -> {
			/*System.out.println(std.getName()+ " : " + std.getScore());*/
			String name = std.getName();
			int score = std.getScore();
			System.out.println(name + " : " + score);
		});
		
		//학생의 이름만 출력
		//Stream은 한 번만 사용 가능하므로 재생성해야 함
		//map이란? 매개변수에 일치(매핑)하는 것을 구현 시, 사용
		//학생 객체에서 이름에 해당하는 내용만 출력
		stdStream = list.stream();
		stdStream.map(std -> std.getName())
					.forEach(std -> System.out.println(std));	
		
		//학생 점수에 해당하는 내용만 출력
		//정수형인 경우 - mapToint()
		stdStream = list.stream();
		stdStream.mapToInt(std -> std.getScore())
				 .forEach(n -> System.out.println(n));
		
		//점수가 90점 이상인 학생의 이름 출력
		//조건에 일치하는 내용을 걸러냄 - filter() 함수 
		list.stream().filter(std -> std.getScore() >= 90)
					.map(std -> std.getName())
					.forEach(s -> System.out.println(s));
	}
}
