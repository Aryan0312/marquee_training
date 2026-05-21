public class perfectSquare {
    public static void main(String[] args) {
        printPerfectSquare(20,80);
        
    }

    static void printPerfectSquare(int low, int high){

    
        // for(int i =20;i<=80;i++){
        //     System.out.println("iteration: "+i);
        //     int root = (int)Math.sqrt(i);
        //     if(root*root == i){
        //         System.out.println(i);
        //     }

        // }

        int i = (int)Math.sqrt(low);

        while(i*i <= high){
            System.out.println("iteration: "+i);
            if(i*i < low){
                i++;
                continue;
            }
            System.out.println(i*i+" ");
            i++;
        }
    }
}
