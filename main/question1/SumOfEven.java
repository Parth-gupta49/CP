package question1;
// 4.25
import java.util.Arrays;
import java.util.Scanner;

//1. Write a function that takes a list of numbers as input and returns the sum
//of all the even numbers in the list. If there are no even numbers in the list,
//return 0
public class SumOfEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfEven(arr));
    }
    static int sumOfEven(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0)
                sum+=arr[i];
        }
        return sum;
    }
}
