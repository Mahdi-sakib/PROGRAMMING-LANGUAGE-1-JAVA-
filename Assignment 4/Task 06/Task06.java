import java.util.Scanner;
public class Task06{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        double n=scan.nextDouble();
        double c=1,sum=0,pos=1;
        for( c=1;c<=n;c+=1){
            if(pos%2==0){
                sum=sum-(c*c);
            }
            else{
                sum=sum+(c*c);
            }
            pos=pos+1;
        }
        System.out.println(sum);
    }
}