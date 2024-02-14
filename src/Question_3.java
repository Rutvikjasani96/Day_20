public class Question_3 {
//    fibonacci series
    public static void main(String[] args) {
        int n = 8;
        int ans = fib(n);
        System.out.println("ans : "+ans);
    }
    static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-2)+fib(n-1);
    }
}
