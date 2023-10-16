import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int i=1;
        boolean flag=true;
        for(i=2;i<Math.sqrt(x);i++){
            if(x%i==0)
            {System.out.println(x+"是合数");
                flag=false;
            break;}
        }
        if(flag==true){
            System.out.println(x+"是质数");
        }

    }
}
