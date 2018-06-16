public class DataTypeConversion {
    public static void main(String[] args){
        // new DataTypeConversionForce().DataTypeConversionForce_1();
        // new DataTypeConversionForce().DataTypeConversionForce_2();
        // new DataTypeConversionForce().CharDataTypeAndInt();
        // new DataTypeConversionForce().StringDataTypeLinkAny();
        new DataTypeConversionForce().CharTest();
    }
}

class DataTypeConversionForce{
    /*强制转换*/
    void DataTypeConversionForce_1(){
        int i = 128;
        byte b = 10;
        // 前面加上 (byte) 强制转换为byte类型
        byte result = (byte)(i + b);
        System.out.println(result);
        /*结果是-118.
        * 但是明明运算出来的二进制是10001010(138)的啊
        * 这里10001010是(-118)的补码
        * 将补码转回原码就是-118了*/
    }

    void DataTypeConversionForce_2(){
        /*数据类型强制转换中的变量相加和常量相加*/
        byte b1 = 3;
        byte b2 = 4;
        /*报错，1、因为3和4是int类型，运算结果也是int。将int数据赋值给byte类型会损失精度
        * 2、 b1和b2是两个变量，变量储存的值是变化得，编译时无法判断里面具体得值，相加可能会超出byte范围*/
        // byte b3 = b1 + b2;

        /*常量相加*/
        byte b4 = 3 + 4;
        /*不报错，因为java编译器有常量优化机制
        * 编译时，已知常量3和4,且不再改变，运算得出的结果如果判断超过byte
        * 范围，且未进行强制转换，则报错
        * 否则赋值*/
    }

    void CharDataTypeAndInt(){
        char c = 'c'; // 'c'字符在ASCII码表中是99
        int i = 1;
        System.out.println(c+i);
        // 输出100
        System.out.println((char)(c+i));
        // 输出'd'字符，100对应
        System.out.println('a'+'c');//输出196,char一旦参与数学运算都将转换为int

    }

    void StringDataTypeLinkAny(){
        /*任何类型数据用 + 和字符串连接(强调连接而不是运算)都产生新的字符串*/
        System.out.println("hello"+2); // 输出 hello2
        System.out.println("hello" + 'c'); //输出 helloc
        System.out.println("hello"+true); // 输出 hellotrue
        System.out.println(2 + 'c' + "hello");// 输出 101hello
        System.out.println("hello" + 2 + 'c');// 输出 hello2c
        System.out.println("5 + 5 = " + 5+5);// 输出 5 + 5 = 55
        System.out.println("5 + 5 = " + (5+5));// 输出 5 + 5 = 10,优先级
    }

    void CharTest(){
        char c1 = 97;
        char c2 = 98;
        System.out.println(c1);//输出a
        System.out.println(c2);//输出b
        /*为什么输出ab? 因为char的取值范围是0～65535, 97和98不超出
        * 范围，所以编译器将其当作ASCII码处理*/
    }
}
