/* hollow number diamond
 
 Input 5
 
    1     
   1 3    
  1   5   
 1     7  
1       9 
 1     7  
  1   5   
   1 3    
    1 

*/

import java.util.Scanner;

class Lab7P23{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int h = obj.nextInt();
    boolean t=false;
    
    for(int row=1; row<=h; row++){
      for(int col=1, num=1; col<=(2*h-1); col++){
        
        if(row+col==h+1 || col-row==h-1){
          System.out.print(num);
          t=true;
        }
        else{
          System.out.print(" ");
          }
        if(t) num++;
     }
       System.out.println();
       t=false;
    }
    
    for(int row=1; row<h; row++){
      for(int col=1, num=1; col<=(2*h-1); col++){
        
        if(row+col==(2*h-1) || col-row==1){
          System.out.print(num);
          t=true;
        }
        else{
          System.out.print(" ");
          }
        if(t) num++;
      }
     System.out.println();
     t=false;
    }
 }
}