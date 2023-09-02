package selfPractice.javavible.ch3;

public class Do_WhileEx1 {

	public static void main(String[] args) {
		
		int su = 5;
		
		String str = "Java DoublePlus";
		
		do {
			System.out.println(str);
		} while (su-- > 10);
		//doWhile문은 선처리 후조건 이여서 조건이 위에있었다면 에러났을 반복문인데,
		//한줄을 출력되고 나서 false가 되어 멈춤
	}

}
