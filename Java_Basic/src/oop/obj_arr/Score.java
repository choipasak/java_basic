package oop.obj_arr;

public class Score {

	/*
	     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
	      담을 수 있는 객체를 디자인하세요.

	     - 학생의 모든 정보를 한 눈에 확인할 수 있게
	      scoreInfo() 메서드를 선언해 주세요.
	      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

	     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
	 */

	private String name;
	private int lang;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int[] sub = {lang, math, eng};
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLang() {
		return lang;
	}

	public void setLang(int lang) {
		this.lang = lang;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int[] getSub() {
		return sub;
	}

	public void setSub(int[] sub) {
		this.sub = sub;
	}

	public Score() {}
	
	public Score(String name, int lang, int eng, int math) {
		
		this.name = name;
		this.lang = lang;
		this.eng = eng;
		this.math = math;
		
		total = this.lang + this.eng + this.math;
		avg = (double)total / sub.length;
	}

	void scoreInfo(Score[] scores)	{
		System.out.println("        국   영   수 총합점 평균");
		System.out.printf("이름: %s %d  %d  %d  %d  %.1f\n"
				,this.name, this.lang, this.eng, this.math, total, avg);
		
	}
	
}
