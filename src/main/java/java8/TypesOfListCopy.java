package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TypesOfListCopy {

    public static void main(String[] args) {
        List<Integer> source = Arrays.asList(1, 2, 3);
        List<Integer> dest = Arrays.asList(5, 6, 7, 8, 9, 10);
        // One
        Collections.copy(dest, source);
        System.out.println(dest);

        // Two
        List<Integer> anotherlIst = new ArrayList<>(source);
        System.out.println(anotherlIst);

        // Three
        List<Integer> oneMore = new ArrayList<>();
        oneMore.addAll(source);
        System.out.println(oneMore);

        // Four
        List<Integer> java8way = source.stream().collect(Collectors.toList());
        System.out.println(java8way);

        //Five
        List<Integer> optionalNullSafeList = Optional.ofNullable(source)
                .map(List::stream)
                .orElseGet(Stream::empty)
                .collect(Collectors.toList());
        System.out.println(optionalNullSafeList);
    }
}
