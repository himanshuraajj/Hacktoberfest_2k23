import java.util.*;
public class Selection {
   public static void main(String[] args) {
     int [] arr={8,1,4,54,0,-1};
     SelectionSort(arr);
     System.out.println(Arrays.toString(arr));
      }
   static void SelectionSort(int [] arr){
    for(int i=0;i<arr.length;i++){
        int last = arr.length -i -1;
        int maxIndex =findMax(arr, 0, last);
        Swap(arr,maxIndex , last);
    }
   }
   static int findMax(int [] arr,int start,int end){
    int max = start;
    for(int i=start;i<=end;i++){
        if(arr[max] < arr[i]){
            max =i;
        }
    }
    return max;
    }
    static void Swap(int [] arr, int first ,int second){
        int temp=arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    } 
}
