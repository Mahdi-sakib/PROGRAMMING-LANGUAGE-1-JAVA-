/* normal then reverse triangle

 Input 5
 
    1     
   121    
  12321   
 1234321  
123454321
 
*/

import java.util.Scanner;

class Lab7P25{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter the height of the triangle");
    int h = obj.nextInt();
    
    for(int row=1; row<=h; row++){
      for(int col=1, num=0; col<=(2*h-1); col++){
        
        if(row+col>h && col-row<h){
          if(col<=h)
            System.out.print(++num);//Left Half of the Triangle
          else
            System.out.print(--num);//Right Half of the Triangle 
        }
         
        else{
          System.out.print(" ");
        }
    }
  System.out.println();
  }
 }
}