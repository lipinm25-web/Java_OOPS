import java.util.*;

public class Rearrange {
    public static void main(String[] args) {
        int[] a = {3,-2,5,-1,6,-4};

        int left = 0;
        int right = a.length - 1;

        while(left <= right){
            if(a[left] < 0){
                left++;
            } else if(a[right] > 0){
                right--;
            } else{
                int t = a[left];
                a[left] = a[right];
                a[right] = t;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}