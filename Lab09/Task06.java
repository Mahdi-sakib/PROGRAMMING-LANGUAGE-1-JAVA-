import java.util.Scanner;
public class Task06{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("How many numbers?");
    int quan=sc.nextInt();
    int i=1;
    while(i<=quan){
      System.out.println("Please enter a number");
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