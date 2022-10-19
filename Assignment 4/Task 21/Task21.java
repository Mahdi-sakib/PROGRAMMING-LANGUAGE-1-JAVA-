import java.util.Scanner;
public class Task21{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=scan.nextInt();
        int sum,n=n1;
        for(sum=0; n1>0;sum=sum+1){
            n1=n1/10;
        }
        int c=1,prod=1;
        for(c=1; c<sum;c++){
            prod=prod*10;
        }
        while(prod>0){
            System.out.println(n/prod);
            n=n%prod;
            prod=prod/10;
        }
    }
}