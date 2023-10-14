package ques2;

public class StringRev2 {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        /*
        * a b
        * temp = a
        * a = b
        * b = temp
        * a = arr[i] b = arr[len-1-i]
        * temp = arr[i]
        * arr[i] = arr[len-1-i]
        * arr[len-1-i] = temp
        *
        * */
        strRev(arr);
    }
    static void strRev(char[] s){
        int len = s.length;
        for (int i = 0; i < len/2; i++) {
            char temp;
            temp = s[i];
            s[i] = s[len-1-i];
            s[len-1-i] = temp;
        }
        System.out.println(s);
    }
}
