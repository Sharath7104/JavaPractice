package recursivearray;

public class PrintArrayRecursively {
    public static int recursive(int index,int[] arr){
        if(index == arr.length){
            return 0;
        }

        System.out.println(arr[index]);

        return recursive(index+1,arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7};

        recursive(0,arr);
    }
}
