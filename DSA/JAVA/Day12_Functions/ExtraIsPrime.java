public class ExtraIsPrime {
    public static void main(String[] args) {
        boolean result = isPrime(57);

        System.out.println(result);
    }

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i =2;i<=Math.sqrt(num);i++){
            if(num %i == 0){
                return false;
            }
        }

        return true;
    }
}
