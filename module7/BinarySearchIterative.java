public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,11};
        int key = 7;

        int l = 0;
        int r = a.length - 1;

        while(l <= r){
            int m = (l + r) / 2;

            if(a[m] == key){
                System.out.println(m);
                return;
            }

            if(a[m] < key){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }

        System.out.println(-1);
    }
}