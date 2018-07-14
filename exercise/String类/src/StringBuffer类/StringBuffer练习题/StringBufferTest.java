public class StringBufferTest{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,7,8,9,10};
        System.out.println(test(arr));
    }
    
    static String test(int[] arr){
        StringBuffer sb = new StringBuffer();
        sb.append('[');
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                sb.append(arr[i]).append(']');
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
        
    }
}
