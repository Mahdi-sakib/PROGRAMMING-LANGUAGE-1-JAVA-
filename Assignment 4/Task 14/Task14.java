import java.util.Scanner;
public class Task14{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter quantity");
        int q=scan.nextInt();
        double c=1,prod=1;
        for( c=1;c<=q;c+=1){
            System.out.println("Enter a number");
            double n=scan.nextDouble();
            prod=prod*n;
        }
        System.out.println(prod);
    }
}