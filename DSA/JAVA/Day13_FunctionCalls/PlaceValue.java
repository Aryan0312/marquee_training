
public class PlaceValue {
    public static void main(String[] args) {
        System.out.println(placeValue(12345, 2));
    }
    public static int placeValue(int n,int target){
        int sum = 0;
        int multiple = 1;
        while(n >0){
            if(target == n%10){
                return (n%10)*multiple;
            }
            multiple = multiple*10;
            n/=10;
        }
        return -1;
    }
}
