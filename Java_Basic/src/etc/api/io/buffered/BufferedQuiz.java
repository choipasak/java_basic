package etc.api.io.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
		         1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로
		          오늘 날짜 20230908file 이라는 이름으로 폴더를 생성하세요.
		         2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
		         3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
		          파일을 작성합니다. 
		          (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
		           연결해 주시면 됩니다.)
		                각 문장은 줄 개행을 포함합니다.
		         4. '그만'으로 파일이 작성되었다면, 아무 방법으로나 
		          파일을 읽어서 콘솔에 출력해 보세요.
		         */
		
		
		LocalDate folderName = LocalDate.now();//LocalDateFomatter어쩌고 사용
		
		folderName.format()
		System.out.println("파일명을 입력해 주세요");
		System.out.print("> ");
		Scanner sc = new Scanner(System.in);
		File f = new File("C:/MyWork/" + folderName + "file/" + sc + ".txt");
		
		String fileName = sc.next();
		String infile = sc.next();
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			
			byte[] arr = new String(infile).getBytes();
			
			System.out.println("'그만'을 입력하면 프로그램을 종료합니다.");
			
			for(byte b : arr) {
				while(true) {
					System.out.println("파일에 적을 내용을 입력해주세요");
					System.out.print("> ");
					bw.write(b);
					if(infile.equals("그만")) break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//쓰기 끝
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}












