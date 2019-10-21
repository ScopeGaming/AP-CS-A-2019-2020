import java.util.Scanner;
import java.lang.Math;

class Lesson_12_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter two numbers:");
    
    double uno = scan.nextDouble();
    double dos = scan.nextDouble();
    
    double largest = 0;
    if (uno >= dos) {
      largest = uno;
    } else if (dos >= uno) {
      largest = dos;
    }
    
    System.out.println("Largest is: " + largest);
  
  }
  
}