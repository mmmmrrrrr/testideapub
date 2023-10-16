import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a;
        int i=0;
        //a是被除数,b是除数
        while(true){
            if(c<b){break;}
            c=a-b;
            a=c;
            i++;
        }
        System.out.println("a/b="+i);
        System.out.println("a%b="+c);

    }
}
