import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println(isSame((byte)10,(byte)20));
        System.out.println(isSame((short) 10,(short) 20));
    }


    public static Boolean isSame(int a,int b) {
        System.out.println("int");
        return a==b;
    }
    public static Boolean isSame(byte a,byte b) {
        System.out.println("byte");
        return a==b;
    }
    public static Boolean isSame(short a,short b) {
        System.out.println("short");
        return a==b;
    }
    public static Boolean isSame(long a,long b) {
        System.out.println("long");
        return a==b;
    }
}
