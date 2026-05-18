package Day7;


public class Palindrome {
    public static void main(String[] args) {
        int rev = 0;
        int n = 99;
        int original = n;
        while(n >0){
            rev = rev*10 +n%10;
            n /= 10;
        }

        if(original == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");

        }
    }
}
