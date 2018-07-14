public class SelectSort{
    public static void main(String[] args){
        int[] arr = {23,22, 34, 12, 56, 31, 45, 22};
        selectPaixu(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
    
    static void selectPaixu(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i; j < arr.length - 1; j++){
                if (arr[i] > arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
