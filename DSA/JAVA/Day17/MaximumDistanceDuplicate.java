import java.util.HashMap;
import java.util.Map;
public class MaximumDistanceDuplicate {
    public static void main(String[] args) {
         int[] arr = {2,3,3,3,3,2};

        System.out.println(maximumDistanceDuplicate(arr));
        System.out.println(maximumDistanceDuplicateMap(arr));
    }

    // using brute
    public static int maximumDistanceDuplicate(int[] arr){
        int maxLength = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    int length = j-i;
                    maxLength = Math.max(length, maxLength);
                }

            }
        }

        return maxLength;
    }

    // using hashmap
    public static int maximumDistanceDuplicateMap(int[] arr){
        Map<Integer ,Integer> mpp = new HashMap<>();
        int maxLength = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(mpp.containsKey(arr[i])){
                int length = i- mpp.get(arr[i]);
                maxLength = Math.max(length, maxLength);
            }else{
                mpp.put(arr[i], i);
            }
            
        }

        return maxLength;
    }
}
