import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        // Your algorithm goes here.
        int [] myArray;
        int[]b={0,1,2,3,4,5,6,7,8,9,10};
        int index1=0,index2=0;
        index1=1;
        myArray=new int[10];
        int[]c=b;
        b=myArray;
        while(index1<10){
        myArray[index1]+=myArray[index2%10]+2;
        index2=1;
        while(index2<index1){
        myArray[index1]=b[index2%7]-index1;
        index2=(index2++)+1+myArray[c[index2]];
        }
        }
        System.out.println(myArray[c[index1]]);
        index1=(++index1)+1;
        
        
        
        

    }
}
