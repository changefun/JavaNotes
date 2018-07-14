public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {12,43,56,67,90,120,121,135};
        System.out.println(bsearch(arr, 90));
    }
    
    static int bsearch(int[] arr, int target){
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;
        while(arr[mid] != target){
            if(target > arr[mid]){
                min = mid + 1;
            }else if(target < arr[mid]){
                max = mid - 1;
            }
            mid = (min + max) / 2;
            if (min > max){
                return -1;
            }
        }
        return mid;
    }
}
