
public class ABCPattern {
    public static void main(String[] args) {
        abc(27);
    }

    static void abc(int n ){
        for(int i =0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}
