package Day7;

public class GCD {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int GCD = 1;
        
        for(int i = 2;i<=Math.min(num1,num2);i++){
            if(num1 % i == 0&& num2% i ==0){
                GCD = i;
            }
        }


        // using prime factorization

        System.out.println(GCD);

    }
}
