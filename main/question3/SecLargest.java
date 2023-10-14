package question3;

import java.util.Scanner;

public class SecLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
        int[] arr = {92};
        /*for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }*/
       secondLargest(arr);

    }
    static void secondLargest(int[] arr){
        int max = arr[0];
        int secMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                secMax = max;
                max = arr[i];
            } else if (arr[i]<max && arr[i]>secMax) {
                secMax = arr[i];
            }

        }
        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i]>secMax && arr[i]<max){
                secMax = arr[i];
            }
        }*/
        System.out.println("second : "+secMax);
        System.out.println("max : "+max);
    }

}