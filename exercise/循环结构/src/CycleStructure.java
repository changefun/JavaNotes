public class CycleStructure {


    static void ForCycle(){
        /*水仙花数
        * 三位数的个、十、百位的立方相加等于这个三位数
        * */
        int count = 0;
        for (int i = 100; i<=999; i++){
            int hundred = i / 100;
            int ten = (i % 100) / 10;
            int bits = (i % 100) % 10;
            if (i == (pow(hundred) + pow(ten) + pow(bits))){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("有"+ count + "个水鲜花数");
    }
    static int pow(int num){
        return num*num*num;
    }

    static void printlnStar(){
        int count = 7;
        /*for (int i = 1; i <= count; i++){
            for (int x = 1; x <= count-i; x++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= count; i++) {
            for (int x = 1; x < i; x++){ // 打印空格
                System.out.print(" ");
            }
            for (int j = count; j >= i; j--) { // 打印星星
                System.out.print("*");
            }

            System.out.println();
        }
        **********
         *********
          ********
           *******
            ******
             *****
              ****
               ***
                **
                 *
        */

        /*for (int i = 0; i < count - (count/2); i++){
            for (int s = 1; s <= (count / 2)-i; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
           *
          ***
         *****
        *******
        */


    }

    static void ControlCycle(){
        /*标号控制外循环*/
        outer: for (int i = 0; i < 3; i++){
            System.out.println("外循环"+i);
            inner: for (int j = 0; j < 2; j++){
                System.out.println("内循环"+j);
                continue outer;
            }
        }
        System.out.println("xxxxx");
        http://www.baidu.com
        for (int i = 0; i<3; i++){
            System.out.println("yyyyy");
            for (int j = 0; j < 3; j++){
                System.out.println("zzzzz");
                break http;
            }
        }
    }

    public static void main(String[] args){
        ControlCycle();
    }
}
