import java.util.Scanner;
public class Task26{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        int sum=0,count;
        for(count=1; count<=n;count++){
            if(n%count==0){
                sum=sum+1;
            }
        }
        if(sum==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}