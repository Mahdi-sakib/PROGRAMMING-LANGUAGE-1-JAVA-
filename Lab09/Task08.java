import java.util.Scanner;
public class Task08{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    int i=1, divC=0;
    while(i<=num){
      if(num%i==0){
        System.out.println(i);
      divC=divC+1;
      }
      i=i+1;
    }
    System.out.println("Total divisors: "+divC);
    sc.close();
  }
}