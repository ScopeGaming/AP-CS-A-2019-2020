import java.util.Scanner;
import java.lang.Math;
import java.io;

class Lesson_11_Activity_Four {   
  public static void main (String str[]) throws IOException { 
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter a Number:");
    int num = scan.nextInt();
    if ((num % 2 )== 0){
      System.out.println("Even");
    }
    else{System.out.println("Odd");
    }  
  }
}
