public class Loops {

    public static void main(String[] args) {
        
        System.out.println(mySqrt(81));
        System.out.println(sumOfDigits(20));
    }   
    
    public static int mySqrt(int x){
        for(int i = 1;i<=x/i;i++){
            if(i*i == x){
                return i;
            }
        }
        return -1;
    }

    public static int sumOfDigits(int n){
        int sum =0;
        while(n>0){
            int lDigit = n%10;
            sum+= lDigit;
            n = n/10;
        }

        return sum;
    }
}
