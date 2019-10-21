import java.util.Scanner;
import java.lang.Math;

class Lesson_6_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Please input a decimal number: ");
    
    double X = scan.nextDouble();
    
    System.out.println("Answer: " + (int)((X - (int)X) * 100) );
    
  }
    
}