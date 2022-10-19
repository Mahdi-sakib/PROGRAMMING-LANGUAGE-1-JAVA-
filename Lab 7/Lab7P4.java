//number rectangle

import java.util.Scanner;

class Lab7P4{
  public static void main(String[] args){
    
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter the number of rows");
    int h = obj.nextInt();
    System.out.println("Enter the number of column");
    int w = obj.nextInt();
    
    for(int row=1; row<=h; row++){
      for(int col=1; col<=w; col++){ 
      System.out.print(col);
      }
     System.out.println();
    }
  System.out.println();
  }
}