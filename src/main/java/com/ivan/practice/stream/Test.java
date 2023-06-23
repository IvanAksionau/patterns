package com.ivan.practice.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        int[] array = {123, 456, 789, 10, 55};

        findNumberWithMaxDigitSum(array);
    }

    private static void findNumberWithMaxDigitSum(int[] array) {
        int result = Arrays.stream(array)
                .boxed()
                .max(Comparator.comparingInt(number -> {
                    int sum = 0;
                    while (number != 0) {
                        sum += number % 10;
                        number /= 10;
                    }
                    return sum;
                })).orElse(0);

        System.out.println("Number with max digit sum: " + result);
    }

    private static void comparatorTest() {
        Arrays.asList(4, 5).sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n1.compareTo(n2);
            }
        });

        Arrays.asList(4, 5).sort(Integer::compareTo);
    }

    private static void sortByLastLetter() {
        Arrays.asList("Black", "White", "Red").sort((o1, o2) -> {
            String o1LastLetter = o1.substring(o1.length() - 1);
            String o2LastLetter = o2.substring(o2.length() - 1);
            return o1LastLetter.compareTo(o2LastLetter);
        });
    }

    private static void findMostlyMentionedNumber() {
//        Получаем наиболее распространенный элемент в списке
        Stream.of(1, 3, 4, 3, 4, 3, 2, 3, 3, 3, 3, 3)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);

        Function<Integer, Integer> f = x -> x + 2;
        Function<String, Integer> fd = Integer::parseInt;
        System.out.println(f.apply(4));  // Prints 6

    }
}
