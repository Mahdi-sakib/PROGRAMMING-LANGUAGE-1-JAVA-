import java.util.Scanner;
public class Task01{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of your favourite car");
        String car=scan.nextLine();
        System.out.println("Enter a number");
        int num=scan.nextInt();
        int count;
        for( count=1;count<=num;count+=1){
            System.out.println(car);
        }
    }
}