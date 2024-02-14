public class Question_6 {
//    given a string, check palindrome or not
    public static void main(String[] args) {
        String str = "adcba";
        System.out.println("ans : "+palindrome(str,0,4));
    }
    static boolean palindrome(String str, int i, int j){
        if(i>j){
            return true;
        }
        if(str.charAt(i)==str.charAt(j)){
            if(palindrome(str,i+1,j-1)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
