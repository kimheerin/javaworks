package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

   public static void main(String[] args) {
      //Map 자료구조의 객체 생성
      Map<String ,Integer> map = new HashMap<>();
      int idx = 0;
      
      //자료 저장
      map.put("java", ++idx);
      map.put("Python", ++idx);
      map.put("C", ++idx);
      map.put("Python", ++idx);
      map.put("javascript", ++idx);
      
      //key 가져오기 
      Set<String> keys = map.keySet();
      
      //자료형 크기
      System.out.println("객체 수: " +map.size());
      System.out.println("엔트리(key) 수: " +keys.size());
      
      //key value 조회 //중복 안된다.
      for(String key : keys)
         System.out.println(key+" : " + map.get(key));
      
      System.out.println("=======================");
      
      //자료 삭제
      if(map.containsKey("Python")) {
         map.remove("Python");
      }
      //람다식으로 구현 
      keys.forEach(key -> System.out.println(key + ":" + map.get(key)));
      
      //자료 존재 유무
      System.out.println(map.containsKey("C++")); //false 나옴 없으니까 ; 있으면 true
   }
}