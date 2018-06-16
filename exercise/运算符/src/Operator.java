public class Operator {
    public static void main(String[] args){
        //new ArithmeticOperatorTest().Demo();
        // new ArithmeticOperatorTest().Selfaddtion();
        //new ArithmeticOperatorTest().Selfaddtion2();
        new ArithmeticOperatorTest().BitMoveOperator();
    }
}

class ArithmeticOperatorTest{

    void Demo(){
        /* % 模运算符，取余*/
        /* % 运算结果的正负根据左边值正负*/

        /*当左边值的绝对值小于右边绝对值时，结果为左边*/
        System.out.println(-3 % 5);//输出 -3
        System.out.println(-3 % -5);//输出 -3

        /*当左边的绝对值等于右边或右边的倍数时，结果是0*/
        System.out.println(-9 % 3);// 输出 0
        System.out.println(-9 % -3);// 输出 0
        System.out.println(-3 % -3);// 输出 0

        /*当左边绝对值大于右边绝对值时，结果为余数*/
        System.out.println(-4 % 3);// 输出 -1
        System.out.println(4 % 3);// 输出 1
        System.out.println(4 % -3);// 输出 1

        /*任何正整数 %2 ，结果不是0就是1,可用作切换条件*/
        System.out.println(4 % 2);// 输出 0
        System.out.println(5 % 2);// 输出 1
        System.out.println(6 % 2);// 输出 0
        /*可用于判断奇偶数*/
    }

    void Selfaddtion(){
        int a = 1;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);

        int x = 1;
        int y = (x++)+(++x)+(x*10);
        System.out.println(y);
        System.out.println(x);
    }

    void Selfaddtion2(){
        byte b = 10;
        b++;// 这等价于 b = (byte)(b + 1) JVM自动强制转换，所以这句不报错
        //b = b + 1;// JVM会先将b(byte)变量提升为int然后再参与运算，结果为int，无法赋值给byte类型，需要手动强制转换
        System.out.println(b);
    }

    void LogicOperator(){
        /*int a = 5;
        if (a > 2 && a < 10){
            System.out.println(a);
        }*/
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(4 ^ 6);
        System.out.println(4 & 6);
        System.out.println(4 | 6);
    }

    void BitOperator(){
        System.out.println(4|-7);
    }

    void BitMoveOperator(){
        System.out.println(12 >>> 2);
    }
}
