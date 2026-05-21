

public class ShortCircuit {
    public static void main(String[] args) {
        int a = 10;

        // if(a<5 && ++a > 10){
        //     System.out.println("inside");
        // }
        // System.out.println(a);

        // int x = 10;

        // // if( x <5 | ++x >20){
        // //     System.out.println("inside");
        // // }

        // // System.out.println(x);

        // if(x>20 & ++x < 20 && ++x >30){
        //     System.out.println("inside");
        // }
        // System.out.println(x);

        // BigDecimal d = 0.1;

        // System.out.println(d == 0.3);
        // System.out.println((double)0.1);
        // System.out.println(0.2);
        // System.out.println(d);

        int x = 3;
         x = x++ + ++x + x++ + (--x);
        
        System.out.println(x);
    }
    static int age(){
            return 18;
        }
}
