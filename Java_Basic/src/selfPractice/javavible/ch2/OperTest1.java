package selfPractice.javavible.ch2;

public class OperTest1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println(++a); //11
		
		System.out.println(++a + b++); //12 + 20
		
		System.out.println((++a%3) + (a*++b)); //1 +  13*22

	}

}
