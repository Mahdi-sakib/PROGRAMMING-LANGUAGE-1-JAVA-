import java.util.Scanner;
public class Task07{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("How many numbers?");
    int quan=sc.nextInt();
    System.out.println("Enter the first number");
      int n1=sc.nextInt();
    int i=1, max=n1, min=n1;
    double sum=n1;
    while(i<quan){
      System.out.println("Please enter next number");
      int num=sc.nextInt();
      if(num>max){
        max=num;
      }
      else if(num<min){
        min=num;
      }
      sum=sum+num;
      i=i+1;
    }
    double avg=sum/quan;
    System.out.println("The maximum number is: "+max);
    System.out.println("The minimum number is: "+min);
    System.out.println("The average of the numbers is: "+avg);
    sc.close();
  }
}