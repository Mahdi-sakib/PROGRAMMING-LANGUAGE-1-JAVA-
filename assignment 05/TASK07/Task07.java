public class Task07
{
  public static void main(String[]args)
  {
    int p[]={50, 30, 20, 10, 40};
    int temp,maxlocation;
    for(int i=0;i<p.length-1;i++)
    {
      maxlocation=i;
      for(int j=i+1;j<p.length;j++)
      {
      if(p[j]>p[maxlocation])
      {
      maxlocation=j;
      }
}
 temp=p[i];
 p[i]=p[maxlocation];
 p[maxlocation]=temp;
    }
      for(int d=0;d<p.length;d++)
  {
    System.out.print(p[d]+" ");
  }
}
}