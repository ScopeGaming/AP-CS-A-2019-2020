import java.util.Scanner;
import java.lang.Math;

class Lesson_12_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    int uno = scan.nextInt();
    int dos = scan.nextInt();
    int tres = scan.nextInt();
    
    double average = (double)((uno + dos +tres));
    average = average/3;
    
    if (average >= 89.5){
      System.out.println("ABOVE AVERAGE");
    }
  }
}