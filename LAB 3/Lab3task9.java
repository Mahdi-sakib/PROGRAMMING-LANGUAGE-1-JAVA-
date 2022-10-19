import java.util.Scanner;
public class Lab3task9    {
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please provide a number");
    int input1=sc.nextInt();
    if (input1%2==0) {
      System.out.println("The number is even");
    } 
    else {
      System.out.println("The number is odd");
    }
  }
}