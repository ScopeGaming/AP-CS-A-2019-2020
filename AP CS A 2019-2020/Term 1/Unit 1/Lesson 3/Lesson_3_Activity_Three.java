import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_Three {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner (System.in);
    String a;
    String b;
    
    System.out.println("Hi there. What is your name?");
    a=scan.nextLine();
    
    System.out.println("What adjective describes you?");
    b=scan.nextLine();
    
    System.out.println("My name is " + a + ". I am " + b + ".");
    
  }
}