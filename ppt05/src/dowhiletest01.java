import java.util.Scanner;

public class dowhiletest01 {
    public static void main(String[] args) {
        int i=1;
//        do{
//            System.out.println("学生做");
//            i++;
//        }while(i<=100);
//        System.out.println(i);
//        i=1;
//        int count=0;
//        do{
//            count=count+i;
//            i++;
//        }while(i<=100);
//        System.out.println(count);
//        i=1;
//        int count=0;
//        do{
//            if((i%5==0) && (i%3!=0)){
////                System.out.println(i);
//                count++;
//            }
//            i++;
//
//        }while(i<=200);
//        System.out.println(count);
//        i=1;
        Scanner sc=new Scanner(System.in);
        char choice;
        do{
            System.out.println("老韩问:还钱吗?y/n");
            choice=sc.next().charAt(0);
        }while(choice =='n');
    }

}
