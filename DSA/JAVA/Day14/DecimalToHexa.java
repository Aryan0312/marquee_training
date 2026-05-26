
public class DecimalToHexa {

    public static void main(String[] args) {
        System.out.println(decimalToHexa(9999));
    }

    public static String decimalToHexa(int d){
        char[] arr = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        StringBuilder str = new StringBuilder();
        
        while(d >0){
            int rem = d%16;


            str.insert(0,arr[rem]);

            d/=16;
        }

        return "0x"+str.toString();
    }
    
}
