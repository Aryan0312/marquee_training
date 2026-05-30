public class ElementsLessThanK {
    public static void main(String[] args) {
         int[] arr = {2,3,3,3,3,2};

        System.out.println(elementsLessThanK(arr,3));
    }

    public static int elementsLessThanK(int[] arr,int k ){
        int n = arr.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] < k){
                count++;
            }
        }

        return count;
    }
}
