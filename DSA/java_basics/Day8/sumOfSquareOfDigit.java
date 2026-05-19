
public class sumOfSquareOfDigit {
    public static void main(String[] args) {
        int sum = 0;
        int n = 12131;
        while(n>0){
            int lastDigit = n%10;
            sum+= lastDigit*lastDigit;

            n = n/10;
        }

        System.out.println(sum);

    }
}
