import java.util.Arrays;

public class Concat {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        concat(arr);
    }
    static void concat(int[] nums){
//        int newLen = nums.length*2 - 1;
        int[] newArr = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {

            newArr[i] = nums[i];
            newArr[i+nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(newArr) + "len : " + newArr.length);
    }
}
