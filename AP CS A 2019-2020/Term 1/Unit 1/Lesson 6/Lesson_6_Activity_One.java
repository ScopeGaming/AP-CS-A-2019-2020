import java.util.Scanner;
import java.lang.Math;

class Lesson_6_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter two integers:");
    double y = scan.nextDouble();
    double x = scan.nextDouble();
     
    double half = ( (y+x) /2);
    
    System.out.println("The average is: " + (half) );
    
  }
}