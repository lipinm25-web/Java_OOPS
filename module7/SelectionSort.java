import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {

        int[] a={64,25,12,22,11};

        for(int i=0;i<a.length-1;i++){

            int min=i;

            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min])
                    min=j;
            }

            int t=a[min];
            a[min]=a[i];
            a[i]=t;
        }

        System.out.println(Arrays.toString(a));
    }
}