import java.util.Random;

public class ArrayTest03 {
    public static void main(String[] args) {
        int temp;
        int[] array=new int[10];
        Random rd=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=rd.nextInt(100)+1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        for (int i = 0; i < array.length/2; i++) {
            temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
