
public class ReplaceZeroWithFive {
    public static void main(String[] args) {
        System.out.println(replaceZeroWithFive(1006780));
    }

    public static int replaceZeroWithFive(int n){

        int digitCount = (int)(Math.log10(n)+1);
        int number = 0;

        for(int i =0;i<digitCount;i++){
       
            int rem = ((n%10 == 0) ? 5: n%10);
       
            number += Math.pow(10, i) * rem;
       
            n/=10;
        }

        return number;
    }
}
