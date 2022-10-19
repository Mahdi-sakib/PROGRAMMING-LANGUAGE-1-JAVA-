public class Task01
{
  public static void main(String[] args)
  {
    int number[]={10,30,20,50,40};
    int counter;
    int max=number[0];
    int min=number[0];
    int sum=0;
    int average;
    for(counter=0;counter<number.length;counter++)
    {
      if(number[counter]>max)
      {
        max=number[counter];
      }
      else if(number[counter]<min)
        
      {
        min=number[counter];
      }
      sum=sum+number[counter];
    }
    average=sum/number.length;
    System.out.println("max is "+max);
    System.out.println("minimum number is "+min);
    System.out.println("average is "+average);
  }
}
    