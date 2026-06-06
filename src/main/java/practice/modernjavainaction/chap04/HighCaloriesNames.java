package practice.modernjavainaction.chap04;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static practice.modernjavainaction.chap04.Dish.menu;

public class HighCaloriesNames {
    public static void main(String... args) {
        List<String> names = menu.stream()
                .filter(dish -> {
                    System.out.println("filter: " + dish.getName());
                    return dish.getCalories() > 500;
                })
                .map(dish -> {
                    System.out.println("mapping: " + dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(toList());
        System.out.println(names);
    }
}
