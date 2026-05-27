public class AnyBaseToDecimal{
    public static void main(String[] args) {
        System.out.println(anyBaseToDecimal("140FU", 16));
    }

    // when going to decimal you remember power
    public static int anyBaseToDecimal(String number, int currentBase){
        int decimal = 0;
        int power = 1;

        int n = number.length();

        for(int i = n-1;i>=0;i--){
            char ch = number.charAt(i);
            int digit;
            if(ch >= '0' && ch <= '9'){
                digit = ch - '0';
            }else if(ch >= 'A' && ch<='F'){
                digit = (ch - 'A') +10;
            }else{
                System.out.println("invalid character");
                return -1;
            }
            decimal+=(digit * power);
            power *= currentBase;
        }

        return decimal;
    }
}