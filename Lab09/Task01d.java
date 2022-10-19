public class Task01d{
  public static void main(String[]args){
    int i=18, j=63, p=1;
    while(i<=j){
      if(p%2==1){
        System.out.println(i);
      }
      else{
        System.out.println(-i);
      }
      i=i+9;
      p=p+1;
    }
  }
}