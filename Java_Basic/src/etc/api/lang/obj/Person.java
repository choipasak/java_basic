package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable{

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//패키지 경로가 같지 않다면
			return false;
		Person other = (Person) obj;//name과 age를 사용하기 위해서 타입 내림
		return age == other.age && Objects.equals(name, other.name);
	}
	 */

	@Override
	//Person 객체의 이름을 비교해 주는 메서드로 override
	public boolean equals(Object obj) {
		if(this == obj)return true;// obj가 물려준 내용을 그대로 사용한단 말QQQQQQQQQQ
		if(obj instanceof Person){//Person객체 타입이니?
			Person p = (Person) obj;//Object타입을 Person타입으로 형 변환 -> name과 age를 확인하기 위해서
			if(this.name.equals(p.name) && this.age == p.age) {
				return true;
			}
		}
		return false;
	};
	
	//equals를 오버라이딩 할 때는 hashcode도 함께 오버라이딩을 진행해 주시는 것이 좋습니다.
	//equals를 재 정의한다는 것은 내가 원하는 방식의 동등 비교를 하겠는 것이기 때문에
	//hashcode의 값도 그에 맞게 같이 재 정의가 되어야 합니다. (hash 주소를 equals에 맞게 정의)
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동으로 호출(gc가 실행될 때 호출된다는 소리)
		System.out.println(this.name + "가 주것습니다 ㅜㅜ");
	}

	//객체 복사 메서드
	//cloneable 인터페이스를 구현해서 사용해야 한다. implements 필요
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	//그냥 사람정보 출력 메서드
	public void personInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age + "세");
	}
}
