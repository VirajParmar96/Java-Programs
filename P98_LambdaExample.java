/*
  Program: Lambda Expressions in Java
  Level  : Advanced
  Author : Viraj Parmar
  Description:
    Demonstrates the use of lambda expressions in Java
    to simplify code for functional interfaces.
*/

import java.util.Arrays;
import java.util.List;

public class P98_LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Viraj", "Parmar", "Java", "Lambda");

        System.out.println("Names List:");
        // Using lambda expression to iterate and print each name
        names.forEach(name -> System.out.println(name));
    }
}

/*
  Sample Output:
  Names List:
  Viraj
  Parmar
  Java
  Lambda
*/
