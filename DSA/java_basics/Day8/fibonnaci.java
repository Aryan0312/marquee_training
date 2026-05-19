public class fibonnaci {
    public static void main(String[] args) {
        fibonnaciSeries(5);
    }

    static void fibonnaciSeries(int n){
        // print all the numbers in fibonnaci series until index n;
        int prev = 0;
        int current = 1;
        System.out.println(prev+" ");
        System.out.println(current+" ");
        for(int i =2;i<n;i++){
            int temp = prev+current;
            prev = current;
            current = temp;

            System.out.println(current);

        }

    }
}
