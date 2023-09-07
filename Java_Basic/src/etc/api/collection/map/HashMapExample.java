package etc.api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		/*
        # Map
        - Key / Value가 한 세트를 이루는 자료구조
        - Key값을 통해 Value를 참조하는 방식.
        - Key는 중복 저장을 허용하지 않는다.
        - 데이터의 구분을 Key로 한다.
        */
		
		//Map은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 설정.
		Map<String, String> map = new HashMap<>();
		//ㄴ> QQQQQQQQQQQQQQQ다형성
		
		//Map에 데이터를 추가하는 메서드: put(key, value)
		map.put("마루", "파삭");
		map.put("춘배", "핑카");
		map.put("고양이", "믹경");
		System.out.println(map);
		//개체가 3개 있다고 해야함. put으로 6개를 넣은게 아니라 3쌍을 넣은 것
		
		//Map은 Key의 중복 저장을 허용하지 않습니다.
		//만약 중복 키를 사용해서 put을 호출하면 value만 수정이 된다.
		//value값을 수정하고 싶을 때 일부러 중복 put을 하는 경우도 있다.
		map.put("마루", "최파삭");
		map.put("어흥이", "핑카");
		System.out.println(map);
		//value가 중복되도 상관없다. key값만 중복되지 않는다면 상관 없음.
		
		//Map 내부에 key의 존재 유무를 확인하는 메서드: containsKey(key)
		System.out.println(map.containsKey("메뚜기"));
		
		//Map 내부의 값을 참조하는 법: get(Key)
		//list에선 인덱스를 주지만 map에서는 key를 줌
		System.out.println(map.get("마루")); //value값을 출력해준다.
		
		System.out.println(map.get("메뚜기")); 
		//ㄴ> 없는 key값을 주면 null을 줌/ 좋지 않음 nullpoint예외가 뜰 수 도 있기 때문
		//ㄴ> 그래서 get하기 전에 contains를 이용해서 키가 있는기 확인하고 작성하기
		//예시
		String name = "야옹이";
		if(map.containsKey(name)) {
			System.out.printf("%s의 별명을 가진 학생은 %s입니다.\n"
					, name, map.get(name));
		}else {
			System.out.println("그런 별명 가진 학생은 없습니다~");
		}
		
		//Map의 크기를 확인하는 메서드: size()
		System.out.println("map의 크기: " + map.size());
		
		//map은 향상for문을 사용하지못함. 받는 값이 2개이기 때문
		//일반 for문도 사용할 순 없음.
		//그럼 어떻게 해야하냐 -> set으로 key들만 받아와서 향상for문으로 꺼내준다
		
		//Map에서 key들만 추출하는 메서드: keySet()
		//모든 key들을 Set에 담아서 반환합니다.
		Set<String> keys = map.keySet(); 
		for(String k : keys) {
			System.out.println(k + " : " + map.get(k));
			//키값을 얻어냈으니 키.get해서 value값까지 같이 얻어줄 수 있음
			//저장 순서는 당연히 보장되지 않는다.
		}
		
		//Map의 객체를 삭제: remove(key)
		//key를 주시면 value도 함께 제거됩니다.
		map.remove("어흥이");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
		
		
		
	}

}












