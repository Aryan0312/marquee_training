import java.util.*;
public class CelsiusToFarheniet {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        while(true){
            double celsius = sc.nextDouble();

            double F = celsiusToFarheniet(celsius);
            
            System.out.print("C: "+celsius+" ");
            System.out.println("F: "+F+" ");
        }
    }
    
    static double celsiusToFarheniet(double c){
        return (c*9/5)+32;
    }
}
