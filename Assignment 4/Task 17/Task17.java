public class Task17{
    public static void main(String[]args){
        int j=1,k=0,f=0;
        while(f<1600){
            System.out.println(f);
            f=j+k;
            j=k;
            k=f;
        }
    }
}