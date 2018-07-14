public class SystemCopyArray{
    public static void main(String[] args){
        copyArray();
    
    }
    
    static void copyArray(){
        int[] src1 = {1,2,3,4,5,6};
        int[] dest1 = new int[8];
        System.arraycopy(src1, 0, dest1, 0, 6);
        for (int i: dest1){
            System.out.println(i);
        }
    }
}
