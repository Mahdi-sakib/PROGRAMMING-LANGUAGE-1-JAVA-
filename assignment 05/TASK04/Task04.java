public class Task04
{
  public static void main(String args[])
  {
    int n[]={10, 30, 20, 50, 40};
    int c,d,pos=0,temp;
    int max=n[1];
    for(c=1;c<n.length;c++)
    {
      if(n[c]>max)
        max=n[c];
    }
    for(d=1;d<n.length;d++)
    {
      if(max==n[d])
      {
        pos=pos+d;
      }
    }
    temp=n[1];
    n[1]=n[pos];
    n[pos]=temp;
    for(int j=1;j<n.length;j++)
    {
      System.out.print(" "+n[j]);
    }
  }
}