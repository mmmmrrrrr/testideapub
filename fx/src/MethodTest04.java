public class MethodTest04 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int from=3;
        int to=7;
        int[] newArr=copyOfRange(arr,from,to);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]+" ");
        }
    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] newArr=new int[to-from];
        int j=0;
        for (int i = from; i < to; i++) {
            newArr[j]=arr[i];
            j++;
        }
        return newArr;
    }
}
