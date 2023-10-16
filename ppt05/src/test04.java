import java.util.Random;
import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        //随机数生成
        Random rd=new Random();
        int num= rd.nextInt(100)+1;
        System.out.println(num);
    }
}
