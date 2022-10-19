public class Task05
{
  public static void main(String args[])
  {
    int n[]={30,20,10,40};
    int c,d,pos=0,temp;
    int max=n[1];
    for(c=2;c<n.length;c++)
    {
      if(n[c]>max)
        max=n[c];
    }
    for(d=0;d<n.length;d++)
    {
      if(max==n[d])
      {
        pos=pos+d;
      }
    }
    temp=n[0];
    n[1]=n[pos];
    n[pos]=temp;
    System.out.println("the largest number between second to the last number is "+max);
    
  }
}