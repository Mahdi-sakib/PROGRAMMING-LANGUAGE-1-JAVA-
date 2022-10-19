/* diamond
 
 Input 4
 
   *    
  ***   
 *****  
******* 
 *****  
  ***   
   *
   
*/

import java.util.Scanner;

class Lab7P12{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int n = obj.nextInt();
    
    for(int row=1; row<=n; row++){
      for(int col=1; col<=(2*n-1); col++){
        
        if((row+col>n) && (col-row<n)){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
      }
    }
  System.out.println();
  }
    for(int row=1; row<n; row++){
      for(int col=1; col<=(2*n-1); col++){
        
        if((row+col<=(2*n-1)) && (col-row>=1)){
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