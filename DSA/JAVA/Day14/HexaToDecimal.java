
public class HexaToDecimal {
    public static void main(String[] args) {
        System.out.println(hexaToDecimal("1C3"));
    }

    public static int hexaToDecimal(String h){
        
        int n = h.length();
        int num = 0;
        int power = 1;
        for(int i = n-1;i>=0;i--){
            char ch = h.charAt(i);
            int digit = 0;
            if(ch >= '0' && ch <= '9'){
                digit = ch -'0';
            }else{
                digit = (ch -'A')+10;
            }


            num += digit * power;

            power*=16;
        }

        return num;
        
    }
}
