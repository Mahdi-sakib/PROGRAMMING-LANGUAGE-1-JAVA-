public class Task02
{
  public static void main(String args[])
  {
    int n[]={10,30,20,50,40};
    int c,sum=0,avg,count=0;
    for(c=0;c<n.length;c++)
    {
      sum=sum+n[c];
    }
    avg=sum/n.length;
    for(c=0;c<n.length;c++)
    {
      if(n[c]>avg)
      {
        count=count+1;
      }
    }
    System.out.println(count+" students are batter then the average");
     System.out.println("They are ");
     for(int k=0;k<n.length;k++)
     {
       if(n[k]>avg)
       {
         System.out.println(n[k]);
       }
  }
}
}

    