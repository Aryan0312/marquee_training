public class ShortestDistance{
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,3,2};
        shortestDistance(arr);

        System.out.println(shortestDistance(arr));
    }

    public static int shortestDistance(int[] arr){
        int n = arr.length;
        int evenCount =0;
        int minDistance = Integer.MAX_VALUE;
        int prev = -1;
        for(int i =0;i<n;i++){
            if(arr[i] % 2 == 0){
                if(prev == -1){
                    prev = i;

                }else{
                    minDistance = Math.min(minDistance, i - prev);
                    prev = i;
                }

                evenCount++;
            }
        }

        return (evenCount < 2) ? -1: minDistance;

    }
}