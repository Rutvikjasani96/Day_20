public class Question_2 {
//    factorial number
    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println("ans : "+ans);
    }
    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return factorial(n-1) * n;
    }
}
