import java.util.Arrays;

public class SubstractArrayNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sub(new int[]{1,2,3,4,5},new int[]{1,5,5})));
    }

    static int[] substract(int[] a,int[] b){

            
       
        int[] ans = new int[Math.max(a.length, b.length)];

        int  n = a.length, m = b.length;
        int i = n-1;
        int j = m-1;
        int k = ans.length-1;

        while (i >= 0 || j >= 0) {
            int sub = 0;
            if (i >= 0) {
                sub += a[i];
                i--;
            }

            if (j >= 0) {
                sub -= b[j];
                j--;
            }
            ans[k] = sub;
            k--;
        }

        return ans;
    }

    static int[] sub(int[] a , int[] b){
        int n = a.length;
        int m = b.length;

        int i = n-1;
        int j = m-1;
        int[] res = new int[Math.max(n,m)];
        

        int index = res.length -1;
  
        while(i>=0 && j >=0){
            if(a[i] >= b[j]){
                res[index--] = a[i--] - b[j--];
            }else{
                res[index--] = 10 + a[i--] - b[j--];
                a[i]--;
            }
        }

        while(j >= 0){
             res[index--] = a[i--];
        }

        while(i >= 0){
             res[index--] = a[i--];
        }

        
        if(res[0] == 0){
            
           int count =0;
           while(res[count] == 0){
                count++;
           }

           int[] ans = new int[res.length - count];
           for(int ansIndex = 0;ansIndex <ans.length;ansIndex++){
                res[ansIndex +count] = ans[ansIndex];
           }

           return ans;
        }
        return res;
    }
}
