package etc.api.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		/*
        1. 파일을 쓸 때 (작성) 사용하는 클래스는 FileOutputStream 입니다.
        2. 생성자의 매개값으로 파일을 쓸 전체 경로를 지정합니다.
        3. io패키지의 모든 클래스들은 생성자에 throws 키워드가 있기 때문에
        try-catch 블록을 항상 작성해야 합니다.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명: ");
		String fileName = sc.next();//여기서 test를 가져가고
		
		FileOutputStream fos = null;//finally에서 객체를 반납해 주기 위해서 변수만 밖에서 선언
		
		try {
			fos = new FileOutputStream("C:/MyWork/" + fileName + ".txt");
		
			System.out.println("문장을 입력하세요: ");
			sc.nextLine(); //파일명 작성 후 엔터 입력값 처리용.
			String str = sc.nextLine();//문장이니까 nextLine()으로 땡기겠다.
			//ㄴ> 여기서 test후에 엔터친 엔터를 가져와서 끝난거임
			
			byte[] arr = str.getBytes();//문자열 데이터를 바이트 데이터로 변환.
			fos.write(arr);// 파일을 바이트 단위로 써 내림.
			
			System.out.println("파일이 정상적으로 저장되었습니다.");//확인용
			
		} catch (Exception e) {//이렇게 다 받거나 다중캐치문으로 따로 받거나 선택
			e.printStackTrace();
		}finally {
			//스트림을 더이상 사용하지 않는 경우에는
			//시스템 자원을 반납하는 코드를 꼭 작성합니다.
			try {
				fos.close();//close라는 객체도 throws가 붙어있음(예외:객체가 생성이 안됬을시에)
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//괄호 안에 어디로 내보내질지 경로를 작성한다! 파일명과 파일유형까지 작성해줘야함.
		//FileOutputStream은 throws가 붙어 있어서 예외처리를 해줘야함.
		

	}

}
