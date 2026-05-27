import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {

        System.out.println(binarySearch(new int[] {1,2,3,4,5,6,7}, 7));
        
    }

    public static int binarySearch(int[] arr, int target){
        int n = arr.length;
        int low =0;
        int high = n -1;
        Arrays.sort(arr);
        while(low <= high){
            int mid = low+(high-low)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }

        return -1;

    }
}
