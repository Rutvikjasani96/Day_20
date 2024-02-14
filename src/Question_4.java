public class Question_4 {
//    print integer in increasing order
    public static void main(String[] args) {
        int n = 100;
        printInc(n);
    }
    static void printInc(int n){
        if(n==1){
            System.out.print("1 ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
}
