/* reverse number right triangle
   4 
  34 
 234 
1234  

*/
import java.util.Scanner;

class Lab7P11{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter the height of the triangle");
    int n = obj.nextInt();
    
    for(int row=1; row<=n; row++){
      for(int col=1; col<=n; col++){
        
        if(col+row>n){
          System.out.print(col);
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}