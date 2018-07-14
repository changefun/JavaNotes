public class MaoPao{
    public static void main(String[] args){
        int[] arr = {34,22,43,76,44,12,65};
        maopao(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
    
    static void maopao(int[] arr){
        /*
        原理：
            两个相邻的元素进行比较，小者则排在前面，大者则排在后面，第一轮比较选出数组中最大的那个元素即排在最后面，该元素就可以排除出下一轮比较。第二轮比较则选出整个数组中倒数第二大的元素，下一轮比较排除该元素。以此类推，最后呈现元素小到大排列。
        */
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]){
                    // 异或运算交换位置法
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                    
                    // 临时变量交换位置法
                }
            }
        }
        
    }
}
