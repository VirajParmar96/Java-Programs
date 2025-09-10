/*
  Program: Streams API Usage
  Level  : Advanced
  Author : Viraj Parmar
  Description:
    Demonstrates how to use Java's Streams API for processing
    collections in a functional style.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P99_StreamsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);

        // Filter even numbers and collect to a list
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers:");
        evenNumbers.forEach(System.out::println);
    }
}

/*
  Sample Output:
  Even Numbers:
  10
  20
  30
*/
