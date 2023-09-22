package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringTest1 {

	public static void main(String[] args) {

		//객체 생성
		List<String> list = Arrays.asList("LG", "APPLE", "SAMSUNG"); //아래의 간단 ver.
		/*List<String> list = new ArrayList<>();
		list.add("LG");
		list.add("APPLE");
		list.add("SAMSUNG");*/
		
		//comStream 생성 후 한번만 사용되며, 다시 사용하려면 재생성 필요
		Stream<String> comStream = list.stream();	//list의 모든 객체를 가져옴
		comStream.forEach(com -> System.out.println(com));	//람다식으로 출력
		
		//for(), forEach() 출력
	}

}
