package secondLargest;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5,7,6,2,1,7,8,10,15,3};

        int tlargest = 0;
        int slargest = 0;
        int largest = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                tlargest = slargest;
                slargest = largest;
                largest = arr[i];
            }else if(arr[i] >slargest && arr[i] != largest){
                tlargest = slargest;
                slargest = arr[i];
            }else if(arr[i] > tlargest && arr[i] != slargest){
                tlargest = arr[i];
            }
        }
        System.out.println(tlargest+" "+slargest+" "+largest);
    }
}
