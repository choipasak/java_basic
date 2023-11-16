package etc.lambda;

@FunctionalInterface
public interface GenericFunction<X, Y> {

    // 얘가 가져야 할 동작!
    // X에서 Y를 추출 해 줄게
    // 메서드가 어떻게 작동할 건지 정의만 해 주면 된다. => 동작을 추상화
    Y apply(X x);

}
