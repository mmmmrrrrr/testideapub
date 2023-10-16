import java.util.ArrayList;
import java.util.Scanner;

public class whiletest {
    public static void main(String[] args) {
        int OriginNum,futurenum=0;
        Scanner sc=new Scanner(System.in);
        OriginNum=sc.nextInt();
        int x=OriginNum;
        int y;
        int i=0;
        while(x!=0){
            y=x%10;
            x=x/10;
            futurenum=futurenum*10+y;
            i++;
        }
//        while(i>0){
//            futurenum= futurenum+(int) ((FutureNum.get(i-1))*(Math.pow(10.0,FutureNum.size()-i)));
//            i--;
//        }
        System.out.println(futurenum);
    }
}
