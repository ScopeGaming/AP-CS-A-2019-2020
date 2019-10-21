import java.util.Scanner;

class Lesson_12_Activity_Four {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What is the temperature?");
    
    double temp = scan.nextDouble();
    
    if(temp>102)
    {
      System.out.println("WARNING");
    }
    if(temp<99)
    {System.out.println("WARNING");
  
    }
  
  }
  
}