public class Task11{
  public static void main(String[]args){
    int num=40;
    while(num<=50){
      int i=1, count=0;
      while(i<=num){
        if(num%i==0){
          count=count+1;
        }
        i=i+1;
      }
      if(count==2){
        System.out.println(num);
      }
     num=num+1;
    }
  }
}