import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int target = 9;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<a.length;i++){
            int diff = target - a[i];

            if(map.containsKey(diff)){
                System.out.println(map.get(diff) + " " + i);
                return;
            }

            map.put(a[i], i);
        }
    }
}