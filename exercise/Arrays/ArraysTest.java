import java.util.Arrays;

public class ArraysTest{
    public static void main(String[] args){
        // 将数组转换为字符串
        String s = Arrays.toString(new int[]{1,2,3,4});
        System.out.println(s);
        
        // 将数组元素排序
        int[] arr = {34,22,54,11,33,76};
        Arrays.sort(arr);
        /*for (int i: arr){
            System.out.print(i);
        }*/
        
        // 二分法查找
        System.out.println(Arrays.binarySearch(arr, 33));
        System.out.println(Arrays.binarySearch(arr, 1, 4, 33));
    
    }
    
    
}
