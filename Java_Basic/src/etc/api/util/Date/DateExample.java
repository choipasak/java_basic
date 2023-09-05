package etc.api.util.Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);

		System.out.println("=============================");
		
		//현재 날짜 정보 얻기(년, 월, 일)
		LocalDate ld = LocalDate.now();//static메서드
		System.out.println(ld);
		
		//현재 시간 정보 얻기(시, 분, 초)
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		//현재 날짜와 시간 정보 얻기 (년, 월, 일, 시, 분, 초)
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		//특정 날짜와 시간 정보 얻기
		LocalDateTime beginDate = LocalDateTime.of(2023, 7,1,5,0,0);
		System.out.println("beginDate: " + beginDate);
		
		//연, 월, 일 따로 추출
		int year = ldt.getYear();
		System.out.println(year);
		
		//정수 형태의 월 추출
		int monthValue = ldt.getMonthValue();
		System.out.println(monthValue);
		
		//문자 형태의 월 추출(Month 라는 열거형 타입 중 하나)
		Month month = ldt.getMonth();
		System.out.println("month: " + month);
		

		
		//요일 (열거형 타입 리턴)
		DayOfWeek dayOfWeek = ldt.getDayOfWeek();
		System.out.println("dayOfWeek: " + dayOfWeek);
		
		System.out.println("==========================================");
		
		//지금으로부터 3일 뒤
		LocalDateTime rtd = ldt.plusDays(3);
		System.out.println(rtd);

		//지금으로부터 1년 2개월 7일뒤
		LocalDateTime later = ldt
				.plusYears(1)
				.plusMonths(2)
				.plusDays(7); // 메서드 체이닝
		
		System.out.println(later);
		
		//오늘로부터 9월 23일 전에
		LocalDateTime before = ldt.minusMonths(9).minusDays(23);
		System.out.println(before);
		
		//사이 날짜 연산
		LocalDate b = ld.of(2020, 12, 30);
		LocalDate f = ld.of(2022, 9, 14);
		
		long between = ChronoUnit.WEEKS.between(b, f);
		System.out.println(between);
		
		System.out.println("======================================");
		
		//날짜 포맷 변경하기
		System.out.println(ldt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(
				"YYYY년 MM월 dd일 E요일 a hh시 mm분 ss초");
		System.out.println(ldt.format(dtf));
		
		
	}

}

















