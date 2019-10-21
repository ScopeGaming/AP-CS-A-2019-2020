import java.util.Scanner;
import java.lang.Math;

class Lesson_5_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a radius");
    double r = scan.nextDouble();
    
    System.out.print("Circumference: ");
    System.out.print( (2 * Math.PI * r) );
    
    System.out.print("Area: ");
    System.out.print( (Math.PI * r * r) );
    
    
  }
}
  