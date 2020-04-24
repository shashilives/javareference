package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8 {


    public static void main(String[] args) {
        Predicate<String> predicate1 = str -> str.startsWith("J");
        Predicate<String> predicate2 =  str -> str.length() < 4;
        List<String> names = Arrays.asList("Shashi","Asangad","Shabad");
        List<Predicate<String>> allPredicates = new ArrayList<Predicate<String>>();
        allPredicates.add(str -> str.startsWith("A"));
        allPredicates.add(str -> str.contains("d"));
        allPredicates.add(str -> str.length() > 4);

             names.stream()
                .filter(allPredicates.stream().reduce(x->false, Predicate::or))
                .forEach(s -> System.out.println(s));
    }
}
