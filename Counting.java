import java.util.Arrays;
public class Counting {
    static void countingsort(int arr[]){
        System.out.println(Arrays.toString(arr));
        int max_val=findMax(arr);
        int count[]=new int[max_val+1];
        for(int num:arr){
            count [num]+=1;
        }
        System.out.println(Arrays.toString(count));
        for(int i=1;i<=max_val;i++){
            count[i]+=count[i-1];
        }
        System.out.println(Arrays.toString(count));
        int output[]=new int[arr.length];
        
        for(int num:arr){
            output[count [num]-1]=num;
        }
        System.out.println(Arrays.toString(output));
    }
    
    static int findMax(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr={1,5,6,9,7,3,2};
        countingsort(arr);
    }
}
