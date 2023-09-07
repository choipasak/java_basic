package etc.api.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {
		
		/*
        1. 스캐너를 통해서 파일명을 정확히 입력받습니다.
        
        2. MyWork폴더에 해당 파일이 존재한다면 해당 파일을 
        upload폴더로 복사하세요.
        파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.
        
        3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
        */
		
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\MyWork\\upload");
		
		if(!file.exists()) {
			file.mkdir();
			System.out.println("파일명이 없습니다.");
		}else {
			System.out.println("upload폴더가 이미 존재 합니다.");
		}
		
		System.out.println("===================================");
		
		System.out.print("만들 파일명> ");
		String fileName = sc.next();
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		try {
			newFile = new FileOutputStream("C:\\MyWork\\" + fileName + ".txt");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		if(file.exists()) {
			
			try {
				oldFile = new FileInputStream("C:\\MyWork\\test.txt");
				newFile = new FileOutputStream("C:\\MyWork\\upload");
				
				byte[] arr = new byte[100];
				
				while(true) {
					int copy = oldFile.read(arr);
					if(copy == -1) {
						break;
					}
					
					newFile.write(arr, 0, copy);
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("\"파일이나 경로를 찾을 수 없습니다.\"");
				e.printStackTrace();
			}catch (IOException e) {
				System.out.println("\"파일 처리 중 예외 발생!\"");
			} finally {
				try {
					oldFile.close();
					newFile.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			
		}
		
		

	}

}
