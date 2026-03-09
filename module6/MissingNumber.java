public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1,2,4,5};
        int n = 5;

        int sum = n*(n+1)/2;
        int s = 0;

        for(int x : a){
            s += x;
        }

        System.out.println(sum - s);
    }
}