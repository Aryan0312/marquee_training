
public class SecondLastCheck {
   public static void main(String[] args) {
        System.out.println(checkSecondLast(1980));
   }

   public static boolean checkSecondLast(int n){
        int count = 0;
        while(n>0){
            if(count > 2){
                break;
            }
            if((n%10)%2 == 0 && count ==1){
                return true;
            }
            
            count++;
            n/=10;
        }
        return false;
   }
}
