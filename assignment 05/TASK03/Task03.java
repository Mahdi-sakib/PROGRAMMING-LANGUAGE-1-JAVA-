public class Task03
{
  public static void main(String args[])
  {
    int n[]={10, 30, 20, 50, 40};
    int c,d,pos=0;
    int max=n[3];
    for(c=1;c<n.length;c++)
    {
      if(n[c]>max)
        max=n[c];
    }
    for(d=0;d<n.length;d++)
    {
      if(max==n[d])
      {
        pos=d;
      }
    }
    System.out.println("largest number is "+max);
    System.out.println("largest number were found at location "+pos);
  }
}