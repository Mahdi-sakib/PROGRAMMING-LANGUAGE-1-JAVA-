// hollow number reactangle

import java.util.Scanner;

class Lab7P15{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter the height of the rectangle");
    int h = obj.nextInt();
    System.out.println("Enter the width of the rectangle");
    int w = obj.nextInt();
    
    for(int row=1; row<=h; row++){
      for(int col=1; col<=w; col++){
        
        if(row==1 || row==h || col==1 || col==w) System.out.print(col);

        else System.out.print(" ");
        }
      System.out.println();
    }
  }
}