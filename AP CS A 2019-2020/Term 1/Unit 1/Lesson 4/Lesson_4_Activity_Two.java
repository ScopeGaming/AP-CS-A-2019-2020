import java.util.Scanner;
import java.lang.Math;

class Lesson_4_Activity_Two {
  public static void main(String[] args) {
    
    String X;
    Scanner scan = new Scanner(System.in);
    System.out.println("Hi there. What is your name?");
    
    X=scan.nextLine();
    System.out.println("Hi "+ X +". How old are you?");
    
    int Z=scan.nextInt();
    System.out.print(X+", you will be 100 in "+(100-Z)+ " years.");
    
  }
}
