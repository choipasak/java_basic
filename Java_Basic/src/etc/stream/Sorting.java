package etc.stream;

import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Sorting {
    public static void main(String[] args) {

        // 음식 목록 중 칼로리가 낮은 순으로 정렬 (오름차 정렬)
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);
        /*
            - 결과
            Dish{name='season fruit', vegetarian=true, calories=120, type=OTHER}
            Dish{name='rice', vegetarian=true, calories=350, type=OTHER}
            Dish{name='chicken', vegetarian=false, calories=400, type=MEAT}
            Dish{name='prawns', vegetarian=false, calories=400, type=FISH}
            Dish{name='salmon', vegetarian=false, calories=450, type=FISH}
            Dish{name='french fries', vegetarian=true, calories=530, type=OTHER}
            Dish{name='pizza', vegetarian=true, calories=550, type=OTHER}
            Dish{name='beef', vegetarian=false, calories=700, type=MEAT}
            Dish{name='pork', vegetarian=false, calories=800, type=MEAT}
        */


        System.out.println("========================================");

        // 칼로리로 내림차 정렬 (높은 순)
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList())
                .forEach(System.out::println);
        // 추가 된 사항 -> .reversed()
        /*
            - 결과
            Dish{name='pork', vegetarian=false, calories=800, type=MEAT}
            Dish{name='beef', vegetarian=false, calories=700, type=MEAT}
            Dish{name='pizza', vegetarian=true, calories=550, type=OTHER}
            Dish{name='french fries', vegetarian=true, calories=530, type=OTHER}
            Dish{name='salmon', vegetarian=false, calories=450, type=FISH}
            Dish{name='chicken', vegetarian=false, calories=400, type=MEAT}
            Dish{name='prawns', vegetarian=false, calories=400, type=FISH}
            Dish{name='rice', vegetarian=true, calories=350, type=OTHER}
            Dish{name='season fruit', vegetarian=true, calories=120, type=OTHER}
        */

        System.out.println("=============================================");

        // 500 칼로리보다 작은 요리 중에 top3 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500)
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        /*
            - 결과
            Dish{name='chicken', vegetarian=false, calories=400, type=MEAT}
            Dish{name='rice', vegetarian=true, calories=350, type=OTHER}
            Dish{name='season fruit', vegetarian=true, calories=120, type=OTHER}
        */
        
        // 결과가 이상함, limit는 그냥 조회 된 순서에서 위의 3개를 가져오는 것임
        // 의도는 높은 애들 순서로 맨 위의 3개를 가져오는 것임
        // 그래서 일단 순서는
        // 필터링 -> 정렬

        System.out.println("================================================");
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500) // 칼로리가 500 미만 애들 걸러
                .sorted(comparing(Dish::getCalories).reversed()) // 거른 애들 정렬(높은 순)
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        // 이렇게 하면 칼로리가 500 미만인 애들중에 높은 순 3개의 값 가져올 수 있게 된다.
        /*
            - 결과
            Dish{name='salmon', vegetarian=false, calories=450, type=FISH}
            Dish{name='chicken', vegetarian=false, calories=400, type=MEAT}
            Dish{name='prawns', vegetarian=false, calories=400, type=FISH}
        */
    }
}
