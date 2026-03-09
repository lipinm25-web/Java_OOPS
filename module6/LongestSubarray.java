import java.util.*;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,1,1};
        int k = 3;

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;

        for(int i=0;i<a.length;i++){
            sum += a[i];

            if(sum == k){
                max = i + 1;
            }

            if(map.containsKey(sum - k)){
                max = Math.max(max, i - map.get(sum - k));
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }

        System.out.println(max);
    }
}