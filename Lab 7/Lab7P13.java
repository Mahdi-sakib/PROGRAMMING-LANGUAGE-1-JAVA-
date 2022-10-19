/* number diamond
 
 Input 4
  
   1    
  123   
 12345  
1234567 
 12345  
  123   
   1  
*/

import java.util.Scanner;

class Lab7P13{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int h = obj.nextInt();
    
    for(int row=1; row<=h; row++){
      for(int col=1,num=0; col<=(2*h-1); col++){
        
        if((row+col>h) && (col-row<h)){
          System.out.print(++num);
        }
        else{
          System.out.print(" ");
      }
    }
  System.out.println();
  }
    for(int row=1; row<h; row++){
      for(int col=1,num=0; col<=(2*h-1); col++){
        
        if((row+col<=(2*h-1)) && (col-row>=1)){
          System.out.print(++num);
        }
        else{
          System.out.print(" ");
      }
    }
  System.out.println();
  }
 }
}