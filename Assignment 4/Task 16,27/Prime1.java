import java.util.Scanner;
public class Prime1
{
    public static void main(String[]args)
    {
        int i;
        Scanner scan=new Scanner(System.in);
        System.out.println("Input lower limit");
        int s1=scan.nextInt();
        System.out.println("Input upper limit");
        int s2=scan.nextInt();
    
    for(i=s1;i<=s2;i=i+1){
       int sum=0,j;
        for(j=1;j<=i;j=j+1){
            if(i%j==0){
            sum=sum+1;
            }
            }
            if(sum==2){
                System.out.println(i);
            
            }
        
    }
    }
    }
