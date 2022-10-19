/* hollow left sided number triangle

1 
12 
1 3 
1  4 
12345 

*/

import java.util.Scanner;

class Lab7P17{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter the height of the triangle");
    int n = obj.nextInt();
    
    for(int row=1; row<=n; row++){
      for(int col=1; col<=row; col++){
        if(col==1 || row==n || col==row)
          System.out.print(col);
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}