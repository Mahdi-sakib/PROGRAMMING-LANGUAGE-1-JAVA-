import java.util.Scanner;
public class Task09{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    int i=1, divC=0;
    while(i<num){
      if(num%i==0){
        divC=divC+i;
      }
      i=i+1;
    }
    if(divC==num){
      System.out.println("The number is perfect");
    }
    else{
      System.out.println("The number is not perfect");
    }
    sc.close();
  }
}