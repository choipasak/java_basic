package etc.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;
import static java.util.stream.Collectors.*;

public class Filtering {

    public static void main(String[] args) {
        
        // stream의 filter
        // 인터페이스 만들고 구현 클래스도 만들고 해야하는 과정이 아닌
        // 자바에서 제공하는 stream의 filter.
        // 필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환
        
        
        // 메뉴 중에 채식주의자가 먹을 수 있는 요리를 필터링
        menuList.stream()
                .filter(dish -> dish.isVegetarian())
                .collect(toList())
                .forEach(dish -> System.out.println("dish = " + dish));

//        for (Dish dish : dishINVegiterian) {
//            System.out.println("dish = " + dish);
//        }

        // 위처럼 작성하지 않고
//        dishINVegiterian.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("==== 육류 이면서 600칼로리 미만의 요리를 필터링 ===");
        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT && d.getCalories() < 600)
                .collect(toList())
                .forEach(d -> System.out.println(d));
        
        System.out.println("==== 요리중에 요리 이름이 4글자인 요리만 필터링 ===");
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("==== 요리중에 300칼로리보다 큰 요리에서 상위 3개만 필터링 ===");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3) // 상위 top3 추출
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("===============================================");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2) // 맨 앞 2개 제외시킴
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("=========== 메뉴 목록에서처음 등장하는 2개의 생선요리 필터링 ===========");
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.FISH)
                .limit(2)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8,8);

        // 짝수만 걸러내기
        List<Integer> res = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(toList());
//                .forEach(d -> System.out.println(d));
        System.out.println("res = " + res);

        // 중복 되는 결과를 없애기 -> 중복 허용을 안하는 HashSet사용
        HashSet<Integer> distinctNumbers = new HashSet<>(res);
        System.out.println(distinctNumbers);
    }
}
