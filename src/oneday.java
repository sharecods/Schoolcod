import java.util.Scanner;

public class oneday {
    public static void main(String[] args) {
        int a=0;
        double b=0;
        char ch='a';
        String str="";
        System.out.println(a);
        System.out.print(a);
        System.out.printf("%d",a);
        System.out.println(a+b);
        System.out.println(str+a);
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(a+k);
        if(a+k>5){
            System.out.println("a+k>5");
        } else if (a+k==5) {
            System.out.println("a+k=5");
        } else {
            System.out.println("a+k<5");
        }
        int box[] = new int[10];
        int box2[][]=new int[10][10];
        for(int i=0; i<10; i++)
        {
            box[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(box[i]);
        }
        for(int i=0;i<10;i++) {
            for (int j = 0; j < 10; j++) {
                box2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                System.out.println(box2[i][j]);
    }
}
