import java.util.Scanner;
public class Task18{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        int sum=0;
        for(sum=0; n>0;sum++){
            n=n/10;
        }
        System.out.println("There are "+sum+" digits");
    }
}