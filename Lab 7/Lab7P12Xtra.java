/* inverse diamond

Input 5

**** **** 
***   *** 
**     ** 
*       * 
*       * 
**     ** 
***   *** 
**** ****

*/

import java.util.Scanner;

class Lab7P12Xtra{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int h = obj.nextInt();
    
    for(int row=1; row<=h-1; row++){       //Printing till (h-1)th row
      for(int col=1; col<=(2*h-1); col++){
        
        if((row+col>h) && (col-row<h)){
          System.out.print(" ");
        }
        else{
          System.out.print("*");
      }
    }
  System.out.println();
  }
    
    for(int row=1; row<h; row++){
      for(int col=1; col<=(2*h-1); col++){
        
        if((row+col<=(2*h-1)) && (col-row>=1)){
          System.out.print(" ");
        }
        else{
          System.out.print("*");
      }
    }
  System.out.println();
  }
 }
}