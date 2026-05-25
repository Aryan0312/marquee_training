// write a program with two parameters start and end , return the sum of all even numbers
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfEvenNumbers(10, 1000));
    }

    public static int sumOfEvenNumbers(int start, int end){
        int sum = 0;
        for(int i = start;i<= end;i++){
            if(i%2 == 0){
                sum+= i;
            }

        }
        return sum;
    }

   
}
