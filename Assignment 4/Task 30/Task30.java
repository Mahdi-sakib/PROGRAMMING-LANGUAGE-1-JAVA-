import java.util.Scanner;
public class Task30{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int n1=scan.nextInt();
        System.out.println("Enter the lower limit");
        int n2=scan.nextInt();
        int prime=0,perf=0;
        for(n1=n1; n1<=n2;n1++){
            int j=1,sum=0,count=0;
            for(j=1;j<=n1;j++){
                if(n1%j==0){
                    sum=sum+j;
                    count=count+1;
                }
            }
            if(count==2){
                prime=prime+1;
            }
            else
                if((sum-n1)==n1){
                perf=perf+1;
            }
        }
        System.out.println("Total prime numbers are "+prime);
        System.out.println("Total perfect numbers are "+perf);
    }
}