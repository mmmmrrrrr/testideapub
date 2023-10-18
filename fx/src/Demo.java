import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int num[]={1,2,3};
        System.out.println("change前"+num[1]);
        change(num);
        System.out.println("change后"+num[1]);
    }


    public static void change(int a[]) {
        a[1]=200;
    }

}
