/* Hollow normal triangle
  
 Input 5
 
    *     
   * *    
  *   *   
 *     *  
********* 

*/

import java.util.Scanner;

class Lab7P20{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter the height of the triangle");
    int h = obj.nextInt();
    
    for(int row=1; row<=h; row++){
      for(int col=1; col<=(2*h-1); col++){
        if(row==h || row+col==h+1 || col-row==h-1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
      }
    }
  System.out.println();
  }
 }
}