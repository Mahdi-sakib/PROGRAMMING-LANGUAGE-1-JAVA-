//right sided asterisk traingle

import java.util.Scanner;

class Lab7P7{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter the height of the triangle");
    int n = obj.nextInt();
    
    for(int row=1; row<=n; row++){
      for(int col=1; col<=n; col++){
        if(row+col>n){
          System.out.print("*");
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}