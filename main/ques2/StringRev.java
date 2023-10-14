package ques2;
//4.41
/*2. Write a function that takes a string as input and returns the reverse of that
        string. For example, if the input is "Hello, World!", the function should
        return "!dlroW ,olleH”.*/
import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String reverse = reverse(name);
        System.out.println(reverse);
    }
    /*static String reverse(String str){
        int n = str.length();
        String reverse="";
        for (int i = n-1; i >=0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }*/
    static String reverse(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length()-1; i>=0 ; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
