//12345....n

import java.util.Scanner;

class Lab7P1{
  public static void main(String[] args){
    
    Scanner obj = new Scanner(System.in);
    int n;
    
    System.out.println("Enter the value of n");
    n = obj.nextInt();
    
    for(int i=1; i<=n; i++){
      System.out.print(i);
    }
  System.out.println();
  }
}