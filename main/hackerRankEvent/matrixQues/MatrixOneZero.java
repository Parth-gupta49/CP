package hackerRankEvent.matrixQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixOneZero {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = {
                {1,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
                /*{0,0,0},
                {1,0,0},
                {0,0,0}*/
                /*{0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {1,0,0,0,0,0,0}*/
        };
        ArrayList<Integer> presentIndex = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]==1){
//                     here i got the present index of 1
                    presentIndex.add(i);
                    presentIndex.add(j);
                }
            }
        }
        ArrayList<Integer> actualIndex = new ArrayList<>();
        actualIndex.add(n/2);
        actualIndex.add(n/2);
        int count = 0;
//        System.out.println(presentIndex.equals(actualIndex)+" "+presentIndex+"actual "+actualIndex);
        while ((presentIndex.get(0)!=actualIndex.get(0))|| (presentIndex.get(1)!=actualIndex.get(1))){
            if (presentIndex.get(0)!=actualIndex.get(0)){
                if (presentIndex.get(0)<actualIndex.get(0)) {
                    swap(arr, presentIndex.get(0), presentIndex.get(1), presentIndex.get(0) + 1, presentIndex.get(1));
                    presentIndex.set(0, presentIndex.get(0) + 1);
                }
                else{
                    swap(arr, presentIndex.get(0), presentIndex.get(1), presentIndex.get(0) - 1, presentIndex.get(1));
                    presentIndex.set(0, presentIndex.get(0) - 1);
                }
            }
            else {
                if (actualIndex.get(1)<presentIndex.get(1)){
                    swap(arr,presentIndex.get(0),presentIndex.get(1),presentIndex.get(0),presentIndex.get(1)-1);
                    presentIndex.set(1,presentIndex.get(1)-1);
                }
                else{
                    swap(arr,presentIndex.get(0),presentIndex.get(1),presentIndex.get(0),presentIndex.get(1)+1);
                    presentIndex.set(1,presentIndex.get(1)+1);
                }
            }
            count++;
        }
        System.out.println(count);

//        System.out.println(Arrays.toString(arr));
//        System.out.println("\nNew Array : \n");
//        for (int[] num : arr) {
//            System.out.println(Arrays.toString(num));
//        }
//        System.out.println(presentIndex.equals(actualIndex)+" "+presentIndex+"actual "+actualIndex);

    }
    static void swap(int[][] arr,int arr1Row,int arr1Col,int arr2Row,int arr2Col){
//        a = arr[arr1Row][arr1Col]
//        b = arr[arr2Row][arr2Col]
        int temp = arr[arr1Row][arr1Col];
        arr[arr1Row][arr1Col] = arr[arr2Row][arr2Col];
        arr[arr2Row][arr2Col] = temp;
    }
}
