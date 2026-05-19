

public class armstrong {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(10));
    }

    public static boolean armstrongNumber(int n ){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum+= lastDigit*lastDigit*lastDigit;
            n = n/10;
        }

        if(sum == n){
            return true;
        }

        return false;
    }
}
