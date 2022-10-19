import java.util.Scanner;
public class Task06
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n[]={50, 30, 20, 10, 40};
    System.out.println("nth number ?");
    int nth=sc.nextInt();
    
    
    boolean flag=true;
    int temp,c,j;
    while(flag)
    {
      flag=false;
      for(c=0;c<n.length-1;c++)
      {
        
        
        if(n[c]<n[c+1])
        {
          temp=n[c];
          n[c]=n[c+1];
          n[c+1]=temp;
          flag=true;
        }
      }
    }
    if(nth<=n.length)
    {
    System.out.println("nth greater number is "+n[nth-1]);
  }
    else
    {
      System.err.println("out of range");
    }
  }
}
    