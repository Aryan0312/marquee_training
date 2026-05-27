
public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(linearSearchIndex(arr, 8));
        System.out.println(linearSearchTruth(arr, 2));
        System.out.println(returnFirstElement(arr));

    }

    public static int linearSearchIndex(int[] arr, int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearchTruth(int[] arr, int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
        }

    public static int returnFirstElement(int[] arr ){
        return arr.length < 1 ? -1:arr[0];
    }
}
