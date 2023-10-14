package ques4;

public class fibo1 {
    public static void main(String[] args) {
        System.out.println(fibo(14521));
    }
    static int fibo(int n){
        if (n<2)
            return n;
        int a = 0;
        int b = 1;
        int count = 2;
        while (count<=n){
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
        return b;
    }
}
