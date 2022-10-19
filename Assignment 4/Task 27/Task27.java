public class Task27{
    public static void main(String[]args){
        int i;
        for(i=1;i<=1000;i++){
            int j=1,sum=0;
            for(j=1; j<=i;j++){
                if(i%j==0){
                    sum=sum+1;
                }
            }
            if(sum==2){
                System.out.println(i);
            }
        }
    }
}