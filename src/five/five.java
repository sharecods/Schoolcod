package five;

class n2 {
    private int num=100;
    public int getNum() {return num;}
    public synchronized void punum(int pu) {
        for(int i = 0; i < 100; i++) {
            int m=this.getNum();
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }this.num=m+pu;System.out.println("num:"+this.num);
        }
    }
    public synchronized void usenum(int mi) {
        for(int i=0; i<100; i++) {
            int m=this.getNum();
            try {Thread.sleep(0);
            } catch (InterruptedException e) {e.printStackTrace();
            }this.num=m-mi;System.out.println("num:"+this.num);
        }
    }
}
class C extends Thread {
    public void run() {five.mynum.punum(100);System.out.println("punum(100):"+five.mynum.getNum());}}
class D extends Thread {
    public void run() {five.mynum.usenum(100);System.out.println("usenum(100):"+five.mynum.getNum());}}
public class five {
    public static n2 mynum=new n2();
    public static void main(String[] args) {System.out.println("num:"+mynum.getNum());C c=new C();D d=new D();c.start();d.start();}}
