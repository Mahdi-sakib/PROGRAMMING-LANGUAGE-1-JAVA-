import java.util.Scanner;
public class Task05{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int i=1;
    while(i<=20){
      System.out.println("Please enter 20 numbers");
      int num=sc.nextInt();
      if(num%2==0){
        System.out.println("even");
      }
      else{
        System.out.println("odd");
      }
      i=i+1;
    }
    sc.close();
  }
}