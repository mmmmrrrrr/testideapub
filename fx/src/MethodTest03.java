public class MethodTest03 {
    public static void main(String[] args) {
        int[] arr={1,5,8,12,56,89,34,67};
        System.out.println(contains(arr,100));
    }

    public static boolean contains(int[] arr,int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
