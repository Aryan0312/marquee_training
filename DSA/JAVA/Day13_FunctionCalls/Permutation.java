
public class Permutation {
    public static void main(String[] args) {
        System.out.println(permutation(5, 2));
    }

    public static int permutation(int n,int r){
        int ncr = 1;
        for(int i=1;i<=r;i++){
            ncr *= n--;
        }
        return ncr;
    }
}
