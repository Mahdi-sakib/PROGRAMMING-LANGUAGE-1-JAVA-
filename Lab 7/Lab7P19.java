/*
    5 
   45 
  3 5 
 2  5 
12345 

*/

import java.util.Scanner;

class Lab7P19{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter the height of the triangle");
    int n = obj.nextInt();
    
    for(int row=1; row<=n; row++){
      for(int col=1; col<=n; col++){
        if(row==n || col==n || col+row==n+1){
          System.out.print(col);
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}