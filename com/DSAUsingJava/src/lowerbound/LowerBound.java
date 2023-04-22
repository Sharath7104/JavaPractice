package lowerbound;

public class LowerBound {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;

        int[] arr = {1,1,2,2,5};
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low <= high){
            int mid = low + (int) Math.floor((high -1)/2);

            if(arr[mid] == k){
                ans = mid;
                high = mid -1;
            }else if (arr[mid] > k){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
