import java.util.*;

public class EvenIndex {
    public static void main(String[] args) {
        int[] a = {3,6,12,1,5,8};

        int even = 0;
        int odd = 1;

        while(even < a.length && odd < a.length){
            if(a[even] % 2 == 0){
                even += 2;
            } else if(a[odd] % 2 == 1){
                odd += 2;
            } else{
                int t = a[even];
                a[even] = a[odd];
                a[odd] = t;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}