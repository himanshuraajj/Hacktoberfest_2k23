import java.util.*;
public class Insersort{
    public static void main(String[] args) {
        int [] arr={1,2,6,7,3,4};
        insersort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insersort(int [] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j=i+1;j>0;j--){// Also known as online Sort as when the element arrives at that particular time only execution takes place.
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}