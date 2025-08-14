/*
  Program: Encapsulation Example
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program demonstrates encapsulation by using private fields
    and public getter/setter methods.
*/

class Person {
    private String name;
    private int age;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class P58_Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Viraj");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

/*
  Sample Output:
  Name: Viraj
  Age: 25
*/
