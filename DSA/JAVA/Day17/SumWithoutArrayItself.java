public class SumWithoutArrayItself{
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,3,2};
        sumWithoutArrayItself(arr);
    }
    
    public static void sumWithoutArrayItself(int[] arr){
        int n = arr.length;
        int arrSum = 0;
        
        for(int i =0;i<n;i++){
            arrSum+= arr[i];
        }
        
        for(int i =0;i<n;i++){
            arr[i] = arrSum - arr[i];
            System.out.println(arr[i]);
        }

    }
}