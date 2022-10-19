import java.util.Scanner;
public class Task12{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        double c=1,sum=0,numc=0;
        for( c=1;c<=10;c+=1){
            System.out.println("Enter a number");
            double n=scan.nextDouble();
            if(n%4==0){
                sum=sum+n;
                numc=numc+1;
            }
        }
        double avg=sum/numc;
        
        System.out.println(sum);
        System.out.println(avg);
    }
}