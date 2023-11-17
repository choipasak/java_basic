package etc.stream;

import java.util.Comparator;
import java.util.Optional;

import static etc.stream.Menu.*;
import static java.util.Comparator.*;

public class Finding {

    public static void main(String[] args) {
         
        // 음식 메뉴 중에 채식주의자가 먹을 수 있는 요리가 있는가?
        boolean flag1 = menuList.stream()
                .anyMatch(dish -> dish.isVegetarian());
        System.out.println("flag1 = " + flag1);
        // 결과: flag1 = true


        // 음식 메뉴 중에 마로리가 50 미만인 음식이 있는가?
        boolean flag2 = menuList.stream()
                .anyMatch((dish -> dish.getCalories() < 50));
        System.out.println("flag2 = " + flag2);
        // 결과 : flag2 = false


        // 음식 메뉴중에 모든 요리가 1000칼로리 미만입니까?
        boolean flag3 = menuList.stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("flag3 = " + flag3);
        // 결과 : flag3 = true

        // 음식 메뉴중에 모든 요리가 1000칼로리 미만이 아닙니까?
        boolean flag4 = menuList.stream()
                .noneMatch(dish -> dish.getCalories() < 1000);
        System.out.println("flag4 = " + flag4);
        // 결과 : flag4 = false

        // 음식 중에 칼로리가 가장 낮은 음식을 조회해 주세요
//        Dish dish = menuList.stream()
//                        .min((o1, o2) -> o1.getCalories() - o2.getCalories()).get();
                        // 이렇게 작성도 가능하지만 더 간결하게도 작성이 가능함.
        // 결과
        // dish = Dish{name='season fruit', vegetarian=true, calories=120, type=OTHER}

        Optional<Dish> min = menuList.stream()
                .min(comparing(Dish::getCalories));

        // ifPresent() : Consumer라는 얘를 매개 값으로 받음.
        // 조건에 맞는 값이 존재 한다면 출력문을 출력 해준다!
        min.ifPresent(dish -> System.out.println(dish));

        System.out.println("min = " + min);
        // 결과: dish = Dish{name='season fruit', vegetarian=true, calories=120, type=OTHER}
    }
    
}
