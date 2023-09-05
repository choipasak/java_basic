package etc.api.lang.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Person m = new Person("마루", 5);
		Person c = new Person("춘배", 6);
		
		//객체 타입의 변수를 출력하거나 값을 얻을 때는
		//뒤에 자동으로 toString()이 붙어서 진행됩니다.
		System.out.println(m);
		System.out.println(c);
		
		if(m.equals(c)) {
			System.out.println("이름과 나이가 둘다 일치");
		}else {
			System.out.println("이름이 다를 수도, 나이가 다를 수도, 둘 다 다를 수도 ...");
		}
		
		//finalize는 gc가 호출되는 순서가 보장되지 않기 때문에
		//사용이 권장되지 않습니다.(deprecated)
		//c = null;
		//m = null;
		//System.gc(); //가비지 컬렉터를 호출. (부른다고 바로 안 올수도 있음. 할 일이 있으면 바로 안옴)
	
		Person kim = new Person("김복제", 100);
		
		try {
			Person clonePerson = (Person) kim.clone();
			System.out.println("복사된 객체 정보: " + clonePerson);//toString이 그냥 참조변수만 출ㄹ력했을때랑 같잖아
			System.out.println("kim과 clone의 equals 결과: " + kim.equals(clonePerson));
			System.out.println("kim의 주소: " + kim.hashCode());
			System.out.println("복제된 객체 주소: " + clonePerson.hashCode());
			//두개의 개체가 하나의 객체를 보게 만들어서 주소값이 같게 나오게 해준 것이다.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	
	
	
	
	}

}










