/*
  Program: Print All Alphabets
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program prints all lowercase and uppercase alphabets from A to Z and a to z.
*/

public class P22_PrintAlphabets {
    public static void main(String[] args) {
        System.out.println("Uppercase Letters:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nLowercase Letters:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}

/*
  Sample Output:
  Uppercase Letters:
  A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 

  Lowercase Letters:
  a b c d e f g h i j k l m n o p q r s t u v w x y z 
*/
