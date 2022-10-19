//left sided number triangle

import java.util.Scanner;

class Lab7P6{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter the height of the triangle");
    int n = obj.nextInt();
    
    for(int row=1; row<=n; row++){
      for(int col=1; col<=row; col++){
        System.out.print(col);
      }
      System.out.println();
    }
  }
}