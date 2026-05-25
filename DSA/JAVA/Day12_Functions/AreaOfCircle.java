
public class AreaOfCircle {
    public static void main(String[] args) {
        tableOfN(5);
        float result = areaOfCircle(5);

        System.out.println(result);
    }

    static void tableOfN(int n){
        for(int i =1;i<=10;i++){
            System.out.printf("%d x %d = %d",n,i,n*i);
            System.out.println();
        }
    }

    static float areaOfCircle(int r){
        float pi = 3.141592f;

        return pi*r*r;
    }
}


// calculate area of a circle take in int and give out float 