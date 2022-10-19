import java.util.Scanner;
public class Task13{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        int c=1,sum=0;
        for( c=1;c<=n;c+=1){
            if(c%2==0){
            }
            else{
                sum=sum+c;
            }
        }
        System.out.println(sum);
    }
}