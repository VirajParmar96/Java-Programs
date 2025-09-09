/*
  Program: Read Config File Using Properties Class
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Demonstrates how to read key-value pairs from a configuration file
    using Java's Properties class.
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class P97_ReadConfigFile {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);

            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");

            System.out.println("Configuration Details:");
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("URL: " + url);

            file.close();
        } catch (IOException e) {
            System.out.println("Error reading config file: " + e.getMessage());
        }
    }
}

/*
  Sample Output (given config.properties file content):
  
  config.properties file content:
  username=admin
  password=admin123
  url=jdbc:mysql://localhost:3306/mydb
  
  Output:
  Configuration Details:
  Username: admin
  Password: admin123
  URL: jdbc:mysql://localhost:3306/mydb
*/
