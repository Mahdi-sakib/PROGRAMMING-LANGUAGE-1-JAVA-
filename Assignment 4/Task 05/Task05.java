import java.util.Scanner;
public class Task05{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        double c=1,sum=0;
        for( c=1;c<=n;c+=1){
            sum=sum+(c*c*c);
        }
        System.out.println(Math.pow(sum,1/3.0));
    }
}