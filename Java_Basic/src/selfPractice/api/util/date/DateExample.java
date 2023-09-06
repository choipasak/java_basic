package selfPractice.api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateExample {

	public static void main(String[] args) {
		
		//현재 년 월 일 얻기
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		//현재 시간 정보 얻기 시 분 초
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		//현재 년 월 일 시 분 초 얻기
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		//내가 원하는 특정 날짜와 시간 정보 얻기
		LocalDateTime want = LocalDateTime.of(2002, 10, 20, 15, 00);
		System.out.println(want);
		
		//위에서 통으로 구했던 것들에서 년도만 빼거나 월만 빼거나 일만 빼거나
		int year = ldt.getYear();
		System.out.println(year);
		
		//정수 형태의 월 추출
		int vmonth = ldt.getMonthValue();
		//.getMonthValue()가 내가 원하는 월 추출임
		System.out.println(vmonth);
		
		//날짜 포맷 변경하기
		System.out.println(ldt);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(
				"YYYY년 MM월 dd일 E요일 a hh시 mm분 ss초");
		System.out.println(ldt.format(dtf));

	}

}
