import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hack {
    public static void main(String[] args) {
//        order = [5,4,6] with 3 widgets avail
//        therefore none of the order can be fulfilled
//
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
//        list.add(6);
        System.out.println(filledOrders(list,40));

    }
    public static int filledOrders(ArrayList<Integer> order, int k) {
        int count = 0;
        int sum = 0;
        Collections.sort(order);
        // Write your code here
        for (Integer integer : order) {
            if (integer<=k && sum<=k) {
                sum+=integer;
                count++;
            }
            else
                break;
        }
        return count;
    }
}
