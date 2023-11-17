package etc.stream;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;

public class Mapping {

    private static class DishNameType{
        private String name;
        private Dish.Type type;

        public DishNameType(Dish dish) {
            this.name = dish.getName();
            this.type = dish.getType();
        }

        @Override
        public String toString() {
            return "DishNameType{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }


    private static class SimpleDish {
        private String name;
        private int calroires;

        public SimpleDish(String name, int calroires) {
            this.name = name;
            this.calroires = calroires;
        }

        public SimpleDish(Dish dish) {
            this.name = dish.getName();
            this.calroires = dish.getCalories();
        }

        @Override
        public String toString() {
            return "SimpleDish{" +
                    "name='" + name + '\'' +
                    ", calroires=" + calroires +
                    '}';
        }
    }

    public static void main(String[] args) {
        
        // stream의 map: 컬렉션(리스트, 셋, 맵,,,) 에서
        // 원하는 정보만 추출하여 새로운 컬렉션으로 반환해 줌.

        // List의 타입이 String -> dish.getName()이 리턴타입이 String이기 때문
        List<Integer> nameList = menuList.stream()
                .map(dish -> dish.getCalories())
                .collect(Collectors.toList());

        System.out.println("nameList = " + nameList);


        /*
            요리 목록에서 메뉴 이름과 칼로리를 추출하고 싶다.
            => .map에 조건을 2개를 받겠다고 입력하면 리턴 타입이 boolean이 된다.
                원하는 건 저게 아님
                그럼 이름과 칼로리만 받는 클래스가 필요한데 따로 만들 순 없으니
                내부 클래스를 선언한다.
         */

        System.out.println("nameList = " + nameList);

        /*
            메뉴 목록에서 칼로리가 500 칼로리보다 큰
            음식들을 필터링 한 다음에 음식의 이름과 타입만 추출해서
            출력 해 주세요.
         */

        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> new SimpleDish(dish))
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

    }
}
