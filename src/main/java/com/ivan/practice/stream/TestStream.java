package com.ivan.practice.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {
        /*
          'peek' Returns a stream consisting of the elements of this stream,
          additionally performing the provided action on each element
          as elements are consumed from the resulting stream.
         */
        double sum1 = DoubleStream.of(1, 2, 3, 4)
                .filter(e -> e > 2)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(e -> e * e)
                .peek(e -> System.out.println("Mapped value: " + e))
                .sum();

        int sum = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(Integer::intValue)
                .sum();

        String[] array = {"a", "b", "c", "d", "e"};
        List<String> strings = Arrays.asList(array);

        strings.forEach(book1 -> {
            System.out.println(book1);
            System.out.println(book1);
        });

        List<Student> students = Arrays.asList(
                new Student("2"),
                new Student("dfgd"),
                new Student("1"),
                new Student("2"),
                new Student("3"),
                new Student("4"),
                new Student("5"),
                new Student("28"),
                new Student("10"),
                new Student("14"),
                new Student("7"));

    }

    public static List<Student> sortStudentListByAverageMarkAsc(List<Student> list) {
        try {
            return list.stream()
                    .sorted(Comparator.comparing(it -> Integer.parseInt(it.getMark())))
                    .collect(Collectors.toList());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public static List<Student> sortStudentListByAverageMarkDesc(List<Student> list) {
        List<Student> collected = list.stream()
                .filter(it -> isNumeric(it.getMark()))
                .sorted(Comparator.comparing(it -> Integer.parseInt(it.getMark())))
                .collect(Collectors.toList());
        Collections.reverse(collected);
        return collected;

    }

    private static void extracted() {
        Map<String, Student> books = new HashMap<String, Student>() {{
            put("key1", new Student("9"));
            put("key2", new Student("8"));
        }};

        List<String> keys = books.entrySet().stream()
                .filter(e -> Integer.parseInt(e.getValue().getMark()) > 8 )
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private static boolean isNumeric(final String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    Integer sum(List<Integer> numbers) {
        int asInt = numbers.stream().mapToInt(Integer::intValue).min().getAsInt();
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Student> sortStudentListByAverageMarRemoveDuplicated(List<Student> list, int range) {
        return list.stream()
                .sorted(Comparator.comparing(it -> Integer.parseInt(it.getMark())))
//                .mapToInt(it -> Integer.parseInt(it.getMark())).sum()
                .distinct()
                .limit(range)
                .collect(Collectors.toList());
    }

    private static void extracted1() {
        Function<Double, Double> log = Math::log;
        Function<Double, Double> sqrt = Math::sqrt;
        Function<Double, Double> logThenSqrt = sqrt.compose(log);
// Output: 1.06
        Function<Double, Double> sqrtThenLog = sqrt.andThen(log);

        Double apply = sqrtThenLog.apply(1.3);
// Output: 0.57
    }

    public static Student getBestStudentFromList(List<Student> list) {
        //find the best student from the ranged list of best students
        return list.stream()
                .sorted(Comparator.comparing(it -> Integer.parseInt(it.getMark())))
                .max(Comparator.comparing(it -> Integer.parseInt(it.getMark())))
                .orElseGet(null);
    }

    public static double getAverageStudentsMark(List<Student> list) {
        return list.stream()
                .mapToInt(it -> Integer.parseInt(it.getMark()))
                .average()
                .orElseGet(null);
    }

    public static List<String> getListOfMarks(List<Student> list) {
        return list.stream()
                .map(Student::getMark)
                .collect(Collectors.toList());
    }
}
