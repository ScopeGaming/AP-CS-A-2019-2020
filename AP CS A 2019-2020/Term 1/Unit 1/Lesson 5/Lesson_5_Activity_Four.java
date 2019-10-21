import java.util.Scanner;
import java.lang.Math;

class Lesson_5_Activity_Four {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a price:");
    double a;
    
    a=scan.nextDouble();
    
    System.out.println("Change from $20: $" + (20.00 - a) );
    
    
  }
}
