import java.util.Scanner;
public class Lab3task6    {
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please provide a number");
    int input1=sc.nextInt();
    System.out.println("Please provide another number");
    int input2=sc.nextInt();
    if (input1>input2) {
      System.out.println("first is greater");
  }else {
        System.out.println("second is greater");
      }
  }
}