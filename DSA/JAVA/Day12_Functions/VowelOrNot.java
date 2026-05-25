public class VowelOrNot {
    public static void main(String[] args) {
        System.out.println(isVowel('a'));
    }

    static boolean isVowel(char c){
        return c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u';
    }
}
