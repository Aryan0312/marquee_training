
public class Ghar {
    public static void main(String[] args) {
        int p = 13,s=5;
        int starAtPRow = (p-s)/2; 

        // for roof of ghar
         for(int i =1;i<=p;i++){
            int spaces = p-i;
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                
                if(i == p && j > starAtPRow && j< (starAtPRow+s)+1){
                    System.out.print("  ");
                    continue;
                }
                
                if(i == 1||i==p||j==1||j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                    
                }

            }
            System.out.println();
        }

        
        
        // for walls of ghar
        for(int i = 1;i<=s;i++){
            int spaces = starAtPRow;
            for(int j =1;j<=starAtPRow;j++){
                System.out.print("  ");
            }
            for(int j = 1;j<=s;j++){
                if(j ==1||j==s||i==s){
                    System.out.print("* ");
                }else{

                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
