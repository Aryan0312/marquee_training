public class PrematureReturn{
    public static void main(String[] args) {
        System.out.println(evenOrOdd(6));
    }

    public static boolean evenOrOdd(int n){
        if(n%2 ==0){
            return true;
        }

        return false;
    }
}

