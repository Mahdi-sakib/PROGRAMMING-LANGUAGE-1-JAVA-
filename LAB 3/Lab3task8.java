import java.util.Scanner;
public class Lab3task8    {
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please provide a number");
    int input1=sc.nextInt();
    System.out.println("Please provide another number");
    int input2=sc.nextInt();
    if (input1>input2) {
      System.out.println("Result: " + (input1-input2));
    } 
    else {
      System.out.println("Result: " + (input2-input1));
    }
  }
}