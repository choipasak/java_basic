package basic.array;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		/*
		 #배열 (array)
		 -> 같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형

		 1. 배열 변수의 선언
		 */
		int[] arr; //java style
//		int arr[]; c style

		//2. 배열 객체를 생성 - 실제 값들이 저장될 공간을 형성
		// 생성할 때 배열의 크기를 정해 주셔야 합니다.
		arr = new int[5];//배열의 크기를 정함, 정하지 않으면 배열 생성이x

		//3. 배열의 초기화 - 배열 내부에 실제 값들을 저장.
		//배열의 초기화는 인덱스를 통해 수행합니다.
		//인덱스란 배열 내부의 위치를 지정할 수 있는 값입니다.
		//인덱스는 0번부터 시작하여 1씩 순차적으로 증가합니다.
		arr[0] = 65;
		arr[1] = 88;
		arr[2] = arr[0];
		arr[3] = (int) 3.14;// 값의 누락 발생하긴함
//		arr[4] = "can i in?" (x)
		arr[4] = 100;
//		arr[5] = 70; -> index 범위를 초과
		
		//4. 배열의 총 크기(길이) 확인. -> 배열변수명.length
		System.out.println("arr 배열의 길이 : " + arr.length);
		
		//5. 배열에 저장된 값을 참조(사용)하는 법 (인덱스를 이용)
		System.out.println("배열의 1번째 데이터 : " + arr[0]);
		System.out.println("배열의 1번째 데이터 : " + arr[1]);
		System.out.println("배열의 1번째 데이터 : " + arr[2]);
		System.out.println("배열의 1번째 데이터 : " + arr[3]);
		System.out.println("배열의 1번째 데이터 : " + arr[4]);
		System.out.println("============================");
		//6. 배열의 반복문 처리
		// 배열은 인덱스 번호를 제어변수로 활용하여 쉽게 반복문을 처리할 수 있습니다.
		for(int idx=0; idx<arr.length; idx++) {
			System.out.printf("배열의 %d번째 데이터 : %d\n"
					, idx+1, arr[idx]);
		}
		
		//7. 배열 내부의 요소값을 문자열 형태로 한눈에 출력하기
		System.out.println(Arrays.toString(arr));
		// toString은 단순 문자열 함수기 때문에 확인용으로만 사용하면 된다!
		
		//8. 배열의 선언과 생성을 동시에 하기
		double[] dArr = new double[3];
		String[] sArr = new String[4];
		byte[] bArr = new byte[10];
		
		System.out.println("================");
		System.out.println(Arrays.toString(dArr));//0.0
		System.out.println(Arrays.toString(sArr));//null
		System.out.println(Arrays.toString(bArr));//0
		// 이걸로 알 수 있는 점은 배열 내부는 생성하면 각 타입의 기본값으로 차있다.
		// 그리고 인덱스를 넣으면 기존의 기본값이 밀려나고 새로 들어간다.
		//정리 : 배열은 생성됨과 동시에 각 타입의 기본값으로 자동 초기화 된다.
		
		//9. 배열의 생성과 동시에 초기화도 하는 방법.
		char[] letters = new char[] {'A', 'B', 'C', 'D'};
		System.out.println(Arrays.toString(letters));
		
		//선언과 동시에 초기화를 할 때
		//딱 1번만@!! 가능한 문법
		String[] names = {"홍길동", "김철수", "곽동식"};
		//넣을 값을 미리 알고있는 경우긴함
		//자바의 배열은 생성후에 추가를 할 수가 없음.
		// 그래도 추가해주고 싶다.
		names = new String[] {"홍길동", "김철수", "곽동식", "김춘식"};
		// 정리 : 자바에서의 배열은 크기가 고정이기 때문에 늘어나거나 줄어들 수 없습니다.
		// 만약 배열의 크기를 늘리거나 줄이고 싶다면
		// 기존의 배열을 조작하는 것이 아니라 새롭게 생성하셔야 합니다.
		
		int[] ant = {1, 11, 111, 1111, 11111};
		for(int house : ant) {
			System.out.println(house);
		}
		
		

	}

}
