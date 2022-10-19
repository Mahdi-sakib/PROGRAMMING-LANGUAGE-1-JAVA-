import java.util.Scanner;
public class Task10{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    int i=1, divC=0;
    while(i<=num){
      if(num%i==0){
        divC=divC+1;
      }
      i=i+1;
    }
    if(divC==2){
      System.out.println("The number is prime");
    }
    else{
      System.out.println("The number is not prime");
    }
    sc.close();
  }
}