/*
  Program: Serialize and Deserialize Object
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    This program demonstrates object serialization and deserialization
    using ObjectOutputStream and ObjectInputStream.
*/

import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class P69_SerializationExample {
    public static void main(String[] args) {
        String filename = "student.ser";

        // Serialize object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            Student s1 = new Student(101, "Viraj");
            out.writeObject(s1);
            System.out.println("Object serialized successfully into " + filename);
        } 
        catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // Deserialize object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Student s2 = (Student) in.readObject();
            System.out.println("Object deserialized successfully.");
            s2.display();
        } 
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}

/*
  Sample Output:
  Object serialized successfully into student.ser
  Object deserialized successfully.
  ID: 101, Name: Viraj
*/
