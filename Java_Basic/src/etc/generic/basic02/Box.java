package etc.generic.basic02;

//멀티 제네렉(key, value)
public class Box<K, V> {
	
	private K key;
	private V value;
	
	public Box(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public void put(K key, V value) {//setter메서드, Map의 put 메서드처럼 만든거임
		this.key = key;
		this.value = value;
	}
	
	public V get(K key) {//getter 메서드
		return this.value;
	}
	
	private String tostirng() {
		return "{" + key + "=" + value + "}";
	}
	

}
