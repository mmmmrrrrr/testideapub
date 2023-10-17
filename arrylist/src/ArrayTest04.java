import java.util.Random;

public class ArrayTest04 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        Random rd=new Random();
        int flag=0;
        int temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            flag=rd.nextInt(array.length);
            temp=array[i];
            array[i]=array[flag];
            array[flag]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
