package etc.lambda;


// 해당 인터페이스가 람다 표현식으로 객체 생성이 가능한 인터페이스 인지를 검사
@FunctionalInterface
// ㄴ> 이걸 사용했을 때 이 인터페이스를 람다로 사용 가능하다는 뜻
public interface ApplePredicate {

    // 사과를 전달 받으면 조건에 맞는 검사를 수행하는 메서드
    boolean test(Apple apple);


}

