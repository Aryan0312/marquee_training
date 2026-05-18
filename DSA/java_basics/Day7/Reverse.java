package Day7;

public class Reverse {
    public static void main(String[] args) {
        int reverse = 0;
        int n = 8976;
        
       
        while(n>0){
            reverse =  reverse*10 + n%10;
            n = n /10;
       }

        System.out.println(reverse);

    }
}
