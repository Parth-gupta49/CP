package hackerRankEvent.quesWeirdArray;

import java.util.Arrays;

/*5. Weird Array (Intermediate)
Weird Array is a new form of an array where the index 0 starts at the exact mid of the array if it has
an odd number of elements, left to mid the index grows in a negative integer, and right to mid the
index grows in a positive integer. If there is an even number of elements there is no index 0, the mid
two elements will have index -1, 1 , See the following example
Array: 10 20 30 40 50
Index: -2 -1 0 1 2
Array: 10 20 30 40
Index: -2 -1 1 2
You are given an array of n elements, get the sum of elements at the -k, k index of the sorted
version of the weird array.
*/
public class WeirdArray {
    public static void main(String[] args) {
        int[] arr = {-5 ,1, 8, 10, -2, -5,8, 3, 1, 99};
        Arrays.sort(arr);
        int len = arr.length;
        int n = 4;
        int sum;
        if (len%2!=0){
            int zeroth = len/2;
            sum = arr[zeroth+n] + arr[zeroth-n];
        }
        else{
            int first = len/2;
            sum = arr[first-n] + arr[first+n-1];
        }
        System.out.println(sum);
    }
}
