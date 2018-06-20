import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        GuessNum guessGame = new GuessNum();
        guessGame.start();
    }
}

class GuessNum{
    private int realnum;

    public GuessNum(){
        this.realnum = (int)(Math.random() * 100) + 1;
    }

    private void replay(){
        this.realnum = (int)(Math.random() * 100) + 1;
    }

    public void start(){
        while (true){
            System.out.print("请输入1~100内的数字: ");
            try {
                int inputNum = new Scanner(System.in).nextInt();
                System.out.println();
                if (inputNum > 100 || inputNum < 1){
                    System.out.println("你该输入1~100内的数字的....");
                    continue;
                }
                if (inputNum == this.realnum) {
                    System.out.println("恭喜！猜中数字：" + inputNum);
                    break;
                } else if (inputNum > this.realnum) {
                    System.out.println("大了！");
                } else {
                    System.out.println("小了！");
                }
            }catch (InputMismatchException error){
                System.out.println("你该输入数字的");
                continue;
            }

        }
        System.out.print("还玩不玩？y or n：");
        if(new Scanner(System.in).next().equals("y")){
            this.replay();
            this.start();
        }else {
            System.exit(0);
        }
    }
}
