package contest;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 12121;
        /*String str = String.valueOf(num);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        if (str.contentEquals(stringBuilder))
            System.out.println("yes its is");
        else
            System.out.println("no");*/
//
        System.out.println(checkPalindrome(num));

    }
    static boolean checkPalindrome(int num){
        // 3 * 10 + 2 = 32 * 10 +
        int temp = num;
        int revNum = 0;
        while (temp>0){
            int rem = temp%10;
            revNum = revNum * 10 + rem;
            temp/=10;
        }
//        System.out.println(revNum);
        return revNum==num;

    }
}
