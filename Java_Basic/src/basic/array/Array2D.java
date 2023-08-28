package basic.array;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {

		/*
		 # 2차원 배열
		 - 배열 안에 배열이 존재하는 형태를 2차원 배열이라고 합니다.
		 - 실제 배열에는 배열의 주소값이 들어가게 됩니다.
		 */
		
//		int[] arr = {1, 2, 3};
		
		//2차원 배열은 배열기호 2개! [][]
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12, 13}
		}; // 배열안에 배열이 존재한다. => 2차원 배열이다!
		
		System.out.println(arr.length);
		// 배열 덩어리를 4개 품고있음
		// 결과 : 4
		
		System.out.println(Arrays.toString(arr));
		// 안에 배열이 4개 들어가 있음.
		// 그러므로 각각의 배열의 주소값이 출력된다.
		// 2차원배열의 메모리값을 얻고 싶다면 더블 인덱싱이 필요하다.
		// 1차 : 배열들의 주소값 받기 | 2차 : n번째 배열의 메모리 호출
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		//결과 : [1, 2, 3]
//	            [4, 5, 6]
//		        [7, 8, 9]	여기서 9를 꺼내고싶다!
		
		System.out.println((arr[2][2]));
		// 결과 : 9
		
		// 근데 2차원 배열 내부의 배열의 모든 요소들을 확인하고 싶다!
		System.out.println(Arrays.deepToString(arr)); // 깊게 보겠다! deep!
		// 결과 : [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12, 13]]
		
		System.out.println("===================================================");
		
		// 빈 2차원 배열 만들기
		int[][] arr2 = new int[3][4]; // 3행 4열(4개의 요소를 가진 배열 덩어리 3개)
		System.out.println(Arrays.deepToString(arr2));
		
		arr2[1][2] = 50;
		arr2[2][1] = 70;
		
		for(int[] array : arr2) { // 1차
			//변수에 int 배열 덩어리가 오는거임
			for(int n : array) { // 2차
				// 한번 더 들어가서 인덱스 값들을 출력
				System.out.print(n + " ");
			}
			System.out.println();
		} // 이러면 3x4의 형태로 출력된다.
		
		
	}

}
