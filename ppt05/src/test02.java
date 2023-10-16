import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
//        int y= (int) Math.sqrt((double)x);
//        System.out.println(y);
        for(int i=1;i<x;i++){
            if(i*i>x){
                System.out.println(i-1);
                break;
            }
        }
    }
}
