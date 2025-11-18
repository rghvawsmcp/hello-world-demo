
public class HelloWorld {

  // SonarQube Violation: Unused import
  import java.util.ArrayList;
  
  // SonarQube Violation: Class should have a proper comment
  public static void main(String[] args) {
    
    // SonarQube Violation: Using System.out.println instead of a logger
    System.out.println("Hello world!");
    
    // SonarQube Violation: Empty catch block
    try {
      int x = 10 / 0;
    } catch (Exception e) {
    }
    
    // SonarQube Violation: Unused variable
    String unused = "test";
    
    // SonarQube Violation: Magic number without explanation
    int result = 42;
    
    // SonarQube Violation: Hardcoded password/credential
    String password = "admin123";
    
    // SonarQube Violation: Cognitive complexity - nested if statements
    if (args.length > 0) {
      if (args[0].equals("test")) {
        if (args.length > 1) {
          System.out.println("Complex logic");
        }
      }
    }
    
    // SonarQube Violation: Using == for string comparison
    String str = "hello";
    if (str == "hello") {
      System.out.println("Wrong comparison");
    }
    
    // SonarQube Violation: SQL Injection vulnerability (if this were real SQL)
    String query = "SELECT * FROM users WHERE name = '" + args[0] + "'";
    
    // SonarQube Violation: Thread.sleep in production code
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // SonarQube Violation: Interrupted exception not properly handled
      e.printStackTrace();
    }
  }
}

