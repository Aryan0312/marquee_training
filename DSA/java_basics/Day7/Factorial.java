

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;

        int i =1;
        while(i <= 20){
            fact*=i;
            i++;
        }
        

        System.out.println(fact);
    }
}
