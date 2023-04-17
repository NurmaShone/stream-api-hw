import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(average);


//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> squares = numbers.stream()
//                .map(x -> x * x)
//                .collect(Collectors.toList());
//        System.out.println(squares);


//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> evens = numbers.stream()
//                .filter(x -> x % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(evens);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        boolean containsThree = numbers.stream()
//                .anyMatch(x -> x == 3);
//        System.out.println(containsThree);

//        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
//        String joined = strings.stream()
//                .collect(Collectors.joining(", "));
//        System.out.println(joined);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> firstThree = numbers.stream()
//                .limit(3)
//                .collect(Collectors.toList());
//        System.out.println(firstThree);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 4, 6);
//        List<Integer> uniqueNumbers = numbers.stream()
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(uniqueNumbers);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        Optional<Integer> max = numbers.stream()
//                .max(Integer::compareTo);
//        System.out.println(max);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> reverseSorted = numbers.stream()
//                .sorted(Collections.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println(reverseSorted);


        ///ЛЯМБДА

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        numbers.replaceAll(x -> x * 2);


//        BinaryOperator<Integer> sum = (a, b) -> a + b;
//        int result = sum.apply(3, 5);
//        System.out.println(result);

//        Predicate<Integer> isGreaterThan10 = x -> x > 10;
//        boolean result = isGreaterThan10.test(15);
//        System.out.println(result);

//        Predicate<String> hasMoreThan5Chars = s -> s.length() > 5;
//        boolean result = hasMoreThan5Chars.test("abcdefg");
//        System.out.println(result);

//        Function<String, Integer> getLength = s -> s.length();
//        int result = getLength.apply("Hello, world!");
//        System.out.println(result);

//        Function<Integer, Integer> square = x -> x * x;
//        int result = square.apply(5);
//        System.out.println(result);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
//        System.out.println(sum);

//        Predicate<String> startsWithA = s -> s.startsWith("A");
//        boolean result = startsWithA.test("Apple");
//        System.out.println();

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());
//        System.out.println(squares);




    }
}