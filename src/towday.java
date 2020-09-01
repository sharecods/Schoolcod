import java.util.Scanner;

public class towday {
    public static void main(String[] args) {
        int number[] = new int[5];
        int enser[] = new int[5];
        char OX[] = new char[5];
        int sum[] = new int[5];
        int k = 0, get = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("문제");
        for(int i = 0; i < sum.length; i++)
        {
            sum[i] = 0;
        }
        for(int i = 0; i < number.length; i++)
        {
            System.out.print((i+1) + "번.");
            number[i] = sc.nextInt();
        }
        System.out.println("답안");
        for(int i = 0; i< enser.length; i++)
        {
            System.out.print((i+1) + "번.");
            enser[i] = sc.nextInt();
        }
        for(int i = 0; i< OX.length; i++)
        {
            if(number[i] == enser[i])
            {
                OX[i] = 'O';
                sum[k] += 5;
            }
            else
            {
                OX[i] = 'X';
            }
            if((i+1) % 20 == 0)
            {
                k++;
            }
        }
        System.out.println("\n\n\n");
        for(int j = 0; j < 3; j++) {
            if(j == 0)
            {
                System.out.println("내가 쓴것");
            }
            else if(j == 1)
            {
                System.out.println("답안");
            }
            else {
                System.out.println("정오표");
            }
            for (int i = 1; i <= OX.length; i++) {
                if(j == 0)
                {
                    System.out.printf("%2d:%d  ", i, number[i - 1]);
                }
                else if(j == 1)
                {
                    System.out.printf("%2d:%d  ", i, enser[i - 1]);
                }
                else {
                    System.out.printf("%2d:%c  ", i, OX[i - 1]);
                }
                if (i % 10 == 0) {
                    System.out.println();
                }
                if(i % 20 == 0)
                {
                    System.out.println();
                }
            }
            System.out.println();
        }
        k = 0;
        for(int i = 0; i < sum.length; i++) {
            System.out.println((k + 1) + "과목 합계 : " + sum[k] + "\n");
            k++;
        }
        for(int i = 0; i < k; i++)
        {
            get += sum[i];
        }
        System.out.println("합계 : " + sum[0]);
    }
}
