

/*长方形面向对象练习*/
class Cuboid{

    private double long_side = 1.0;
    private double height_side = 1.0;
    private double wide_side = 1.0;

    public Cuboid(){}

    public Cuboid(double long_side, double height_side, double wide_side){
        this.long_side = long_side;
        this.height_side = height_side;
        this.wide_side = wide_side;
    }
    /*面积*/
    public double Area(){
        return this.long_side * this.wide_side * 2 +
                this.long_side * this.height_side * 2 +
                    this.height_side * this.wide_side * 2;
    }

    /*体积*/
    public double Volume(){
        return this.long_side * this.wide_side * this.height_side;
    }
}

class Args{

    public Args(int... ints){
        for (int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }
    }

    public void print(String... strings){
        System.out.println(strings[0]);
    }
}


public class OOPApp {
    public static void main(String[] args){
        Args args1 = new Args(1,2,3,4);


    }
}
