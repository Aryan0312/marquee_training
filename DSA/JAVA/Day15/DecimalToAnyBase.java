
public class DecimalToAnyBase {
    public static void main(String[] args) {
        System.out.println(decimalToAnyBase(190, 14));
    }

    public static String decimalToAnyBase(int decimal,int targetBase){
        if(decimal == 0){
            return "0";
        }
        String hexa = "0123456789ABCDEF";
        String result = "";

        while(decimal >0){
            int remainder = decimal % targetBase;
            result = hexa.charAt(remainder) +result;
            decimal/=targetBase;
        }

        return result;
    }
}
