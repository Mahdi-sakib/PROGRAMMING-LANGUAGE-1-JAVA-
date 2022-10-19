import java.util.Scanner;
public class Task29{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        int sum=0,c;
        for(c=1; c<n;c++){
            if(n%c==0){
                sum=sum+c;
            }
        }
        if(sum==n){
            System.out.println("The number is a perfect number");
        }
    }
}