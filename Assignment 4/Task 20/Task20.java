import java.util.Scanner;
public class Task20{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        while(n>0){
            System.out.println(n%10);
            n=n/10;
        }
    }
}