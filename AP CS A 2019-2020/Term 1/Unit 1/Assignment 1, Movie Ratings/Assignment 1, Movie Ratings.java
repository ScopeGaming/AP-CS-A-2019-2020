import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter ratings from the movie review website.");
    Double X = scan.nextDouble();
    Double Y = scan.nextDouble();
    Double Z = scan.nextDouble();
    
    System.out.println("Please enter ratings from the focus group.");
    Double XX = scan.nextDouble();
    Double YY = scan.nextDouble();
    
    System.out.println("Please enter the average movie critic rating.");
    Double XXX = scan.nextDouble();
    
    Double A = ( ( X + Y + Z ) / 3);
    System.out.println("Average website rating:" + A);
    
    Double B = ( ( XX + YY ) / 2);
    System.out.println("Average focus group rating:" + B);
    
    Double C = ( (XXX) );
    System.out.println("Average movie critic rating:" + C);
    
    Double D =( ( A + B + C) /3);
    System.out.println("Overall movie rating:" + D);
    
  }
  
}