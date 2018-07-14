public class IntegerDemo{
    public static void main(String[] args){
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2); // false
        System.out.println(i1.equals(i2)); // true
        
        Integer i3 = 127;
        Integer i4 = 127; // 127 不超出byte的取值范围，直接从常量池的byte数组中取出，因为元素都位于同一个数组，所以地址值相等。
        System.out.println(i3 == i4);
        
        Integer i5 = 128;
        Integer i6 = 128; // 128超出byte的取值范围，创建新的对象
        System.out.println(i5 == i6);
    }
}
