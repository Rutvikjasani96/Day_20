public class Question_1 {
//    sum of 1 to n
    public static void main(String[] args) {
        int n = 10;
        int ans = sum(n);
        System.out.println("ans : "+ans);
    }
    static int sum(int n){
        if(n==1){
            return n;
        }
        return n + sum(n-1);
    }
}
