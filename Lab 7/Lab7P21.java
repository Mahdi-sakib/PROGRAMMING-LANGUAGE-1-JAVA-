/* hollow number triangle
 
  Input 5
 
    1     
   1 3    
  1   5   
 1     7  
123456789 

*/

import java.util.Scanner;

class Lab7P21{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter the height of the triangle");
    int h = obj.nextInt();
    
    boolean t = false;
    
    for(int row=1; row<=h; row++){
      for(int col=1, num=1; col<=(2*h-1); col++){
        
        if(row==h || row+col==h+1 || col-row==h-1){
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