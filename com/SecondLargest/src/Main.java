public class Main {
    public static void main(String[] args) {
        int[] arr = {9,5,8,4,2,3,10,15};

        int slargest = 0;
        int largest = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }else if(arr[i] > slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }

        System.out.println(slargest);
    }
}