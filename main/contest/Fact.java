package contest;

public class Fact {
    public static void main(String[] args) {
        int num = 50;
        System.out.println(fact(num));
    }
    /*static int fact(int num){
        if (num<1)
            return 0;
        if (num==1)
            return 1;
        return num * fact(num-1);
    }*/
    static int fact(int num){
        int fac = 1;
        for (int i = 2; i <= num; i++) {
            fac*=i;
        }
        return fac;
    }
}
