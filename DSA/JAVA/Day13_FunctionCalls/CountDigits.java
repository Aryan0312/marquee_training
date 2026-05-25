
public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(10));
    }

    public static int countDigits(int n){
        int count =0;
        while(n >0){
            count++;
            n/=10;
        }

        return count;
    }
}
