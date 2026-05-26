
public class OctalToDecimal {
    public static void main(String[] args) {
        System.out.println(octalToDecimal("12"));
    }

    public static int octalToDecimal(String o){
        int n = o.length();
        int num = 0;
        for(int i = n-1;i>=0;i--){
            num += Math.pow(8,n-i-1) * (o.charAt(i) - '0');

        }

        return num;
    }
}
