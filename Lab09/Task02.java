public class Task02{
  public static void main(String[]args){
    int i=1, sum=0;
    while(i<=600){
      if(i%7==0&&i%9==0){
        sum=sum+i;
      }
      i=i+1;
    }
    System.out.println(sum);
  }
}