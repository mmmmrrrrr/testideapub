public class ArrayTest01 {
    public static void main(String[] args) {
        int[] array={33,5,22,44,33};
        int num=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>num){
                num=array[i];
            }
        }
        System.out.println(num);
    }
}
