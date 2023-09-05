package etc.api.util.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysExample {

	public static void main(String[] args) {
		
		//배열의 복사
		char[] arr = {'J', 'A', 'V', 'A'};
		char[] arr2 = Arrays.copyOf(arr, arr.length);//원본복사 완료!
		char[] arr3 = Arrays.copyOfRange(arr, 1, 3);
		
		arr[2] = 'F';
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		//배열의 탐색: binarySearch(배열, 검색할 값) -> return 인덱스 값;
		//선행조건 : 반드시 정렬이 되어있어야함
		int [] numbers = {1, 3, 5, 7, 9, 11, 13};
		System.out.println("9의 위치: " + Arrays.binarySearch(numbers, 9));
		//배열에 없는 값도 찾아줌 리턴은 -값으로 나타남. 이것마저 안나오면 그냥 해당x임
		
		//배열의 정렬
		Integer[] nums = {23,74,33,4,5,2,6,34};
		Arrays.sort(nums); // 오름차순 정렬 메서드
		System.out.println(Arrays.toString(nums));
		
		//내림차 정렬(Integer[]을 지원)
		Arrays.sort(nums, Collections.reverseOrder());// 내림차순 정렬 메서드
		System.out.println(Arrays.toString(nums));
		
		//배열 내부 요소가 모두 동일한지의 여부를 확인
		arr[2] = 'F';
		System.out.println(Arrays.equals(arr, arr2));
		
		
	}

}














