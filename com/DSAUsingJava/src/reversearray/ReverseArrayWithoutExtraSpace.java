package reversearray;

import java.util.Arrays;

public class ReverseArrayWithoutExtraSpace {
    public static void main(String[] args) {

        int[] arr = {1,2,5,4,7};

        int i=0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
