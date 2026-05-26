
public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("101001"));
    }

    public static int binaryToDecimal(String b){
        int num = 0;
        int n = b.length();
        for(int i = n - 1 ;i>=0;i--){
            num += Math.pow(2,n-i-1) * (b.charAt(i) -'0');
        }

        return num;
    }
}
