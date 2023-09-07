package etc.generic.basic;

public class Box<T> {//제네릭 클래스로 선언
	
	private T obj;
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	//데이터타입과 리턴타입, 매개변수 다 T
	//Box객체를 생성할 때 지정한 제네릭타입으로 지정하겠다는 의미
	
}
