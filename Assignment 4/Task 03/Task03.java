import java.util.Scanner;
public class Task03{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        double n=scan.nextDouble();
        double count=1,max=n,sum=n;
        for( count=1;count<20;count+=1){
            System.out.println("Enter a number");
            double num=scan.nextDouble();
            if (num>max){
                max=num;
            }
            sum=sum+num;
        }
        double avg=sum/20;
        System.out.println("Average="+avg);
        System.out.println("Maximum="+max);
    }
}