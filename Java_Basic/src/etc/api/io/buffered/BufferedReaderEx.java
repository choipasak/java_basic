package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:/MyWork/hello.txt");
			br = new BufferedReader(fr);
			/*
			System.out.println(br.readLine()); // 한 줄씩 읽어옴.
			System.out.println(br.readLine()); // 한 줄씩 읽어옴.
			System.out.println(br.readLine()); // 읽을 데이터가 없어서 null이 옴.
			*/
			
			//BufferedReader에는 readLine() 메서드가 있고
            //한 줄을 통째로 읽어서 String으로 리턴합니다.
            //더 이상 읽어들일 데이터가 없다면 null을 리턴.
			
			//위의 내용을 간추리면
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