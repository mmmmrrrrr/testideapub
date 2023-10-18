import java.util.Random;

public class MethodTest02 {

    public static void main(String[] args) {
        int[] arr=new int[5];
        Random rd=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rd.nextInt(10)+1;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(getMax(arr));
    }
    public static int  getMax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i])max=arr[i];
        }
        return max;
    }
}
