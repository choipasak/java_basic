package basic.array;

import java.util.Arrays;

public class ArrayDelete {
	public static void main(String[] args) {

		int[] arr = {1, 3, 5, 7, 9, 11, 13};
		//배열은 삭제라는 개념이 없다

		//만약 7이 삭제되었으면 좋겠다!
		//삭제하고자 하는 값 기준으로 뒤의 값들을 한칸씩 앞으로 땡기겠다!
		// 그럼 마지막 값 두개가 마지막 값으로 중복되겠지 13, 13으로
		//그럼이제 새로운 배열을 만들건데 전의 배열보다 한칸 짧은 배열을 생성
		// 후에 넣어주고 원본 배열은 없애주고 삭제된것처럼 보이게 만들어준다!

		/*
		arr[3] = arr[4];
		arr[4] = arr[5];
		arr[5] = arr[6];
		이러지말고
		반복문을 이용하자!
		 */

		//삭제되는 값을 기준으로 뒤에 있는 값을 한칸씩 앞으로 땡기는 작업을 시작!
		//추후에 생성될 새 배열의 값을 그대로 대입하기 편하게 하기 위해 하는 작업.

		for(int i=3; i<arr.length-1; i++) {
			//-1 : 맨 뒤의 값은 더이상 뒤에서 땡겨올 값이 없기 때문에
			arr[i] = arr[i+1];
		}
		System.out.println(Arrays.toString(arr));

		// 기존의 배열보다 크기가 하나 작은 새 배열 생성!
		int[] temp = new int[arr.length-1];
		//이러면 나중에 arr의 배열이 길어져도 수정하지 않아도 된다!
		//		temp[0] = arr[0];
		//		temp[1] = arr[1];
		//		temp[2] = arr[2];

		//원본 배열의 값을 새 배열에 인덱스를 맞춰서 그대로 대입
		for(int j=0; j<temp.length; j++) {
			temp[j] = arr[j];
		}
		System.out.println(Arrays.toString(temp));

		//원래 배열의 이름은 arr이다.
		//arr과 temp의 주소값은 다르니까 temp가 가진 주소값을 arr한테주고
		//temp는 null을 줘서 어떠한 배열도 참조하지 않도록 설정해준다.
		arr = temp; // -> temp배열의 주소값을 arr에게 전달
		temp = null; // ->주소값을 지워서 메모리에서 temp는 자동 소멸하게 한다!

		//확인해보자!
		System.out.println(Arrays.toString(arr));
	}
}








