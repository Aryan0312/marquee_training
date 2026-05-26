
public class DecimalToOctal {
    public static void main(String[] args) {
        System.out.println(decimalToOctal(9999));
    }

    public static String decimalToOctal(int n){
        StringBuilder str = new StringBuilder();

        while(n >0){
            int rem = n%8;
            str.insert(0,rem);
            

            n/=8;
        }

        return "0o"+str.toString();
    }
}
