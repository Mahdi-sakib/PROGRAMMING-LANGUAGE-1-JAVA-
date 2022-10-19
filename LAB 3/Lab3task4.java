import java.util.Scanner;
public class Lab3task4    {
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please provide the radius");
    double input1=sc.nextDouble();
    System.out.println("Circumference: " + (2*3.1416*input1));
    System.out.println("Area: " + (3.1416*input1*input1));
  }
}