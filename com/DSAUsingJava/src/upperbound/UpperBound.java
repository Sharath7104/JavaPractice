package upperbound;

public class UpperBound {
    public static void main(String[] args) {
        int n = 10;
        int k = 7;

        int arr[] = {0, 2, 4, 4, 5, 5, 7, 7, 9, 10};
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low<=high){
            int mid = low + (int)Math.floor((high-low)/2);

            if(arr[mid] > k){
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        System.out.println(ans);
    }
}
