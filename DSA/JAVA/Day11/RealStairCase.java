
public class RealStairCase {
    public static void main(String[] args) {
        int n =8;
        int col = 2;
        for(int i =1;i<=n;i++){
            if(i > col){
                col = i+1;
            }
            for(int j = 1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
