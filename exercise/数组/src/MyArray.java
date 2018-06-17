import java.util.Arrays;

public class MyArray {

    static void Initialize(){
        /*动态初始化*/
        /*char[] intArray = new char[4];
        System.out.println(intArray);
        System.out.println("df"+'\u0000'+"sdasd");*/

        /*静态初始化*/
        /*int[] apple = new int[]{1,2,3};
        System.out.println(apple[0]);
        int[] banana = {4,5,6};
        System.out.println(banana[2]);*/

        /*int[] apple;
        apple = new int[]{1,2,3};
        System.out.println(apple[2]);
        int[] banana;
        banana = {4,5,6};*/



    }

    static void arraySwitch(int[] arr){
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            System.out.println("temp= "+temp);
            arr[i] = arr[arr.length - 1 - i];
            System.out.println("第"+i+"="+arr[i]);
            arr[arr.length - 1 - i] = temp;
            System.out.println("变换"+arr[arr.length - 1 - i]);
            System.out.println(Arrays.toString(arr));
        }
    }

    static void printArray(int[] arr){
        for(int item: arr){
            System.out.print(item+"  ");
        }
    }

    static void two_Dimensional(){
        /*二维数组*/
        int[][] apple = {{1,2},{3,4}};
        System.out.println(apple);
        System.out.println(apple[0][1]);
        int[] x, y[];
        x = new int[]{1,2,3};
        y = new int[][]{{4,5}};
        System.out.println(y[0][1]);

        System.out.println(apple[0]);
        System.out.println("------------------------");

        int[][] banana = new int[3][];
        banana[0] = new int[1];
        banana[1] = new int[2];
        banana[2] = new int[3];
        banana[0][0] = 1;
        System.out.println(banana[0][0]);
        banana[1][0] = 2;
        banana[1][1] = 3;
        System.out.println(banana[1][0]);
        System.out.println(banana[1][1]);

        banana[2][0] = 4;
        banana[2][1] = 5;
        banana[2][2] = 6;
        System.out.println(banana[2][0]);
        System.out.println(banana[2][1]);
        System.out.println(banana[2][2]);


    }



    public static void main(String[] args){
        // Initialize();
        //two_Dimensional();
        int[] a = {1,2};
        arraySwitch(a);
        System.out.println(a[0]);

    }
}
