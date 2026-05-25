
public class ExtraStringVowel {
    public static void main(String[] args) {
        System.out.println(containsVowel("aryan"));
    }

    static boolean containsVowel(String s){
        VowelOrNot v = new VowelOrNot();
        for(int i =0;i<s.length();i++){
            if(v.isVowel(s.charAt(i))){
                return true;
            }
        }

        return false;
    }
}
