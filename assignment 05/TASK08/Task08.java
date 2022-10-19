import java.util.Scanner;

  public class Task08
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       System.out.print("your nbumber");
       int m=sc.nextInt();
       int n[]=new int[m];
       int c;
       for(c=0;c<m;c++)
       {
         System.out.println("number");
         n[c]=sc.nextInt();
       }
       boolean flag=true;
       int i,temp;
       while(flag)
       {
         flag=false;
       for(i=0;i<n.length-1;i++)
       {
         
         if(n[i]>n[i+1])
         {
           temp=n[i];
           n[i]=n[i+1];
           n[i+1]=temp;
           flag=true;
         }
       }
       }
       int pos1,pos2,medium;
       if(m%2==0)
       {
         pos1=m/2-1;
         pos2=m/2;
         medium=(n[pos1]+n[pos2])/2;
       }
       else
       {
         pos2=m/2;
         medium=n[pos2];
       }
       System.out.println(medium);
    }
  }
  