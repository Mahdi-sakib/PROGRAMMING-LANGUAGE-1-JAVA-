import java.util.Scanner;
public class Task28{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        int sum=0,c;
        for(c=1; c<=n;c++){
            if(n%c==0){
                sum=sum+c;
            }
        }
        System.out.println(sum);
    }
}