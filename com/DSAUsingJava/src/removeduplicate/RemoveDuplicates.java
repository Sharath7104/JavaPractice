package removeduplicate;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,4,8,5,4,7,8,9,5,9};

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1 && arr[i] == arr[i+1]){
                continue;
            }
            sb.append(arr[i] + " ");
        }
        System.out.println(sb.toString());
    }
}
