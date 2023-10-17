import java.util.Random;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] array=new int[10];
        Random rd=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=rd.nextInt(100)+1;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        double avg=sum/array.length;
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<avg){
                count++;
            }
        }
        System.out.println(count);
    }
}
