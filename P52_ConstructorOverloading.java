/*
  Program: Constructor Overloading
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program demonstrates constructor overloading in Java.
*/

class Student {
    String name;
    int age;

    // Constructor with only name
    Student(String n) {
        name = n;
        age = 0; // default
    }

    // Constructor with name and age
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class P52_ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob", 22);

        s1.display();
        s2.display();
    }
}

/*
  Sample Output:
  Name: Alice, Age: 0
  Name: Bob, Age: 22
*/
