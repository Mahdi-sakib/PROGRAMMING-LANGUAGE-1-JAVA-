import java.util.Scanner;
public class Task15{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        double c=1,sum=0;
        for( c=1;c<=20;c+=1){
            System.out.println("Enter a number");
            double n=scan.nextDouble();
            sum=sum+n;
            System.out.println(sum);
        }
    }
}