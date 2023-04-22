package maximumoccurance;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurance {
    public static void main(String[] args) {
        int[] arr = {1,4,7,4,5,2,1,4,5,6,8,7};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        int index = 0;
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> c : map.entrySet()) {
            if (c.getValue() > max) {
                max = c.getValue();
                index = c.getKey();
            }
        }
        System.out.println(index);

    }
}
