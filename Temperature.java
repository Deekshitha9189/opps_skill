//convert temperature from fahrenheit to centigrade
package oops_skill;
import java.util.Scanner;
public class Temperature {
   public static void main(String[] args) {
  //float farh;
  Scanner sc= new Scanner(System.in);
System.out.println("enter f value");
 float farh=sc.nextFloat();
  float C = (farh - 32) * 5/9;
  System.out.println("after conversion" +C);
  
}
}