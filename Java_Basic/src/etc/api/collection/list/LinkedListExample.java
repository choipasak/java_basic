package etc.api.collection.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		//추가
		list.add("홍길동");
		list.add("김철수");
		list.add("박영희");
		
		//LinkedList만의 메서드, 맨 앞의 값과 맨 뒤의 값을 추가할 수 있음
		list.addFirst("맨 앞");
		list.addLast("맨 뒤");
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		//똑같은 메서드로 출력도 찝어서 할 수 있음	
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.remove(0);
		System.out.println(list);
		
		//LIFO -> last in first out -> stack(얘도 Collections)
		// 페이지 앞으로가기, 뒤로가기 같은 곳에 stack구조를 사용.
		//push, pop, peek
		list.push("김춘배");//앞에서부터 추가
		System.out.println(list);
		
		//뽑힌 데이터는 삭제됨. 삭제하면서 데이터를 읽기
		System.out.println(list.pop()); //뽑힌 요소를 출력
		System.out.println(list); //뽑히고 나서의 배열
		
		
		//삭제하지 않으면서 읽기, 원하는 데이터를 고르는 것
		System.out.println(list.peek());
		System.out.println(list);
		
		//FIFO -> first in first out -> Queue
		//대기열의 개념이라고 생각하면 된다.
		//대기열 처리에 많이 사용
		//offer, poll, peek
		list.offer("a");
		list.offer("b");
		list.offer("c");//얘는 데이터가 들어오면 배열의 뒤쪽에 쌓임
		System.out.println(list);
		
		System.out.println(list.poll());//그리고 나가는건 앞의 요소가 나감.
		System.out.println(list); // 수평적 구조여서 그럼(Queue)
		
		System.out.println(list.peek());
		System.out.println(list);// 이건 똑같음! 맨 앞의 요소를 삭제하지 않고 보여주기! 임.
		

	}

}












