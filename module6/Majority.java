public class Majority {
    public static void main(String[] args) {
        int[] a = {2,2,1,1,1,2,2};

        int count = 0;
        int candidate = 0;

        for(int x : a){
            if(count == 0){
                candidate = x;
            }

            if(x == candidate){
                count++;
            } else {
                count--;
            }
        }

        System.out.println(candidate);
    }
}