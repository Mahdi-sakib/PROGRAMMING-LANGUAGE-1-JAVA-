import java.util.Scanner;
public class Task23{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=scan.nextInt();
        int sum,n=n1;
        for(sum=0; n1>0;sum=sum+1){
            n1=n1/10;
        }
        
        int c=1,prod=1;
        for(c=1; c<sum;c++){
            prod=prod*10;
            
        }
        while(prod>0){
            int i=n/prod;
            if (i==0){
                System.out.println("zero");
            }
            else
                if(i==1){
                System.out.println("one");
            }
            else
                if(i==2){
                System.out.println("two");
            }
            else
                if(i==3){
                System.out.println("three");
            }
            else
                if(i==4){
                System.out.println("four");
            }
            else
                if(i==5){
                System.out.println("five");
            }
            else
                if(i==6){
                System.out.println("six");
            }
            else
                if(i==7){
                System.out.println("seven");
            }
            else
                if(i==8){
                System.out.println("eight");
            }
            else
                if(i==9){
                System.out.println("nine");
            }
            n=n%prod;
            prod=prod/10;
        }
    }
}