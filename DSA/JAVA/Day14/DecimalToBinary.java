public class DecimalToBinary{
    public static void main(String[] args) {
        System.out.println(decimalToBinary(41));
    }

    public static String decimalToBinary(int d){

        // to convert decimal to binary you have to keep dividing by 2 and then record the remainders , those remainders will give you binary of that number

        StringBuilder str = new StringBuilder(); //.length(), charat,append,insert(position,chartoadd),toString

        int ans = 0;
        int place = 1;
        while(d > 0){
            int rem = d%2;
            ans = ans + rem*place;
            str.insert(0,rem);

            place *= 10;
            d/=2;
        }
        System.out.println(ans);

        return str.toString();
    }
}