class A{
    public A () {
        System.out.println("A");
    }
}
class B{
    private void B(){
        System.out.println("PB");
    }
    public void B1() {
        System.out.println("B1");
    }
    protected void B2 () {
        System.out.println("B2");
    }
    public String B3 () {
        System.out.println("B3");
        String b3="B3str";
        return b3;
    }
    public int B4 () {
        System.out.println("B4");
        int b4=4;
        return b4;
    }
}
class C{
    int c1,c2,c3;
    public void setC1(int c1) {
        this.c1 = c1;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public void setC3(int c3) {
        this.c3 = c3;
    }

    public int getC1() {
        return c1;
    }

    public int getC2() {
        return c2;
    }

    public int getC3() {
        return c3;
    }

    @Override
    public String toString() {
        return "C{" +
                "c1=" + c1 +
                ", c2=" + c2 +
                ", c3=" + c3 +
                '}';
    }
}


public class threeday {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        String str1="";
        int in1=0;
        b.B1();b.B2();str1=b.B3();in1=b.B4();
        System.out.println(str1);
        System.out.println(in1);
        C c=new C();
        c.setC1(1);c.setC2(2);c.setC3(3);
        System.out.println(c.getC1());
        System.out.println(c.getC2());
        System.out.println(c.getC3());
        System.out.println(c);
    }
}