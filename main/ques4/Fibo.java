package ques4;
// 4.44
public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
    /*static int fibo(int num){
        if (num<2){
            return num;
        }
        return fibo(num-1)+fibo(num-2);
    }*/
    /*
    * fibonacci series
    * 0 1 1 2 3 5
    * a = 0 ||||  b = 1
    * a = b |||| b = sum of a and b
    * */
// 0 1 1 2 3 5 8 13 21 34
    /*
    *
    *
    *
    * int a = 0;
    * int b = 1;
    * int count = 2;
    *  while(count<n){
    *
    * }
    * */

    static int fibo(int n){
        int a = 1;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        if (n>=2)
            return b;
        return n;
    }
}
