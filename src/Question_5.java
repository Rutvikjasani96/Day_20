public class Question_5 {
//    print integer in decreasing order
    public static void main(String[] args) {
        int n = 100;
        printDec(n);
    }
    static void printDec(int n){
        if(n==1){
            System.out.print("1");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
}
