package contest;

public class Prime {
    public static void main(String[] args) {
//        int num = 101;
//        System.out.println(checkPrime(num));

        primeInBetween(35,40);
    }
    static boolean checkPrime(int num){
        int sqRoot = (int)Math.sqrt(num);
        for (int i = 2; i <= sqRoot; i++) {
            if (num%i==0)
                return false;
        }
        return true;
    }
    static void primeInBetween(int start,int end){
        int flag;
        for (int i = start+ 1; i < end; i++) {
            flag = 0;
            int sqRoot = (int)Math.sqrt(i);
            for (int j = 2; j <= sqRoot; j++) {
                if (i%j==0){
                    flag = 1;
                    break;
                }
            }
            if (flag==0)
                System.out.println(i);
        }
    }
    //    start = 10 end = 20
//    We need to find how many prime numbers are there in between
//    11 13 17 19
//    for(i = 2;i<end;i++)
//    if(start%2==0)
//        print start++
}
