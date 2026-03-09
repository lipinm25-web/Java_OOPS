public class RotatedSearch {

    static int search(int[] a,int key){
        int l=0,r=a.length-1;

        while(l<=r){
            int m=(l+r)/2;

            if(a[m]==key) return m;

            if(a[l]<=a[m]){
                if(key>=a[l] && key<a[m])
                    r=m-1;
                else
                    l=m+1;
            }
            else{
                if(key>a[m] && key<=a[r])
                    l=m+1;
                else
                    r=m-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a={6,7,8,1,2,3,4};

        System.out.println(search(a,3));
    }
}