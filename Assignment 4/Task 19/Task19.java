import java.util.Scanner;
public class Task19{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the value of the power");
        int n=scan.nextInt();
        int c, prod=1;
        for(c=1; c<=n;c++){
            prod=prod*10;
        }
        System.out.println(prod);
    }
}