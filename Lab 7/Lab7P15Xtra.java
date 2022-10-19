import java.util.Scanner;

class Lab7P15Xtra{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter a side of the square");
    int h = obj.nextInt(), temph, tempw;
    
    temph = tempw = h;
    
    for(int row=1; row<=h; row++){
      for(int col=1; col<=h; col++){
        
        if(col==h && row<h && row>1)
          System.out.print(--temph);
        if(row==1)
          System.out.print(col);
        else if(col==1)
          System.out.print(row);
        else if(row==h)
          System.out.print(--tempw);
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}