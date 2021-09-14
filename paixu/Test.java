package paixu;

abstract  class Shape {
    abstract protected void draw();
    static int a = 10;
    public void func() {
        System.out.println("func");
    }
}
class Rect extends Shape {
    public void draw(){
        System.out.println("func");
    };
    public void func() {
        System.out.println("funcc");
    }

}

public class Test {
    public static void main(String[] args) {
        System.out.println(Shape.a);
        Shape shape = new Rect();
        shape.func();
    }
}
