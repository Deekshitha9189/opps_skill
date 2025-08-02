//even num or odd num
package oops_skill;
import java.util.Scanner;
public class Even_odd {
  public static void main(String args[]) {
    int num;
    
    Scanner sc= new Scanner(System.in);
    System.out.println("enter number");
    num=sc.nextInt();
    if(num%2==0) {
      System.out.println("Even number");
    }
    else {
      System.out.println("Odd number");
    }
    
  }

}