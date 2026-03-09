public class PrefixSum {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10};
        int[] p = new int[a.length];

        p[0] = a[0];
        for(int i=1;i<a.length;i++){
            p[i] = p[i-1] + a[i];
        }

        int l = 1;
        int r = 3;

        int sum = l==0 ? p[r] : p[r] - p[l-1];
        System.out.println(sum);
    }
}