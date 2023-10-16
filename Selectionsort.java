import java.util.Arrays;

public class Selectionsort{
    public static void main(String[] args) {
        int [] arr={4,3,7,6,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int [] nums){
        for(int i=0;i<nums.length;i++){
            int last = nums.length - i-1;
            int maxindex =getMaxIndex(nums,0,last);
            swap(nums, maxindex, last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;// This method is for index not max element.
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}