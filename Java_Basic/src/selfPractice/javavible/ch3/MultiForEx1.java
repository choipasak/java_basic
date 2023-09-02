package selfPractice.javavible.ch3;

public class MultiForEx1 {

	public static void main(String[] args) {
		
		char go = 'A';
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(go++ + " ");
			}
			System.out.println();
		}

	}

}
