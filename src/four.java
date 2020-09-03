import java.util.Random;

interface D {
    public void a1();
    public void a2();
}
class F1 implements D {
    private int a;private int b;private int c;
    public F1(int a,int b,int c) {
        this.a=a;this.b=b;this.c=c;
    }public int getA() {
        return a;
    }public int getB() {
        return b;
    }public int getC() {
        return c;
    }public void a1() {
        System.out.println("a-1:"+a*2);
    }public void a2() {
        System.out.println("a-2:"+a*3);
    }
    @Override
    public String toString() {
        return "E{" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                '}';
    }
}
class F2 extends F1 {
    private float h;
    public F2(int a,int b,int c,float h) {
        super(a*2,b*3,c);this.h=h;
    }public void a1_1() {
        super.a1();
    }public void a2_2() {
        super.a2();
    }public void a1() {
        System.out.println("getA:"+getA()*2);
    }public void a2() {
        System.out.println("getA:"+getA()*3);
    }
    @Override
    public String toString() {
        return "F2{" +
                "a = " + getA() +
                ", b = " + getB() +
                ", c = " + getC() +
                "h = " + h +
                '}';
    }
}
public class four {
    public static void main(String[] args) {
        Random rand=new Random();final int to=10;final int ba=10;
        F1 f1 = new F1(rand.nextInt(to)+ba,rand.nextInt(to)+ba,rand.nextInt(to)+ba);
        System.out.println(f1);f1.a1();f1.a2();
        F2 f2 = new F2(rand.nextInt(to)+ba,rand.nextInt(to)+ba,rand.nextInt(to)+ba,rand.nextFloat());
        System.out.println(f2);
        f2.a1();f2.a2();f2.a1_1();f2.a2_2();
    }
}