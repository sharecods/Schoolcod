import java.util.Random;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        int level = 0;
        NumberBaseBallGame NBB = new NumberBaseBallGame();
        level = NBB.LevelControll();
        NBB.FindNumber(NBB.LevelNumbering(level), level);
        System.out.println("축하합니다.");
    }
}
class NumberBaseBallGame {
    NumberBaseBallGame () {
        System.out.println("숫자 야구를 시작합니다.\n");
    }
    public int LevelControll () {
        int level = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("래벨을 설정해 주세요(1~9) : ");
            level = sc.nextInt();
            if(level < 10 &&  level > 0)
            {
                break;
            }
        }
        return level;
    }
    public int[] LevelNumbering (int level) {
        int number[] = new int[level];
        Random rand = new Random();
        for(int i = 0; i<level; i++)
        {
            number[i] = rand.nextInt(9) + 1;
            for(int j = 0; j < i; j++)
            {
                if(number[i] == number[j])
                {
                    i--;
                }
            }
        }
        return number;
    }
    public void FindNumber (int[] number, int level)
    {
        String num = "";
        int boll = 0;
        int strike = 0;
        boolean TF = true;
        Scanner sc = new Scanner(System.in);
        while (TF)
        {
            System.out.print("숫자를 입력해 주세요 : ");
            num = sc.next();
            if(num.length() != level)
            {
                continue;
            }
            for (int i = 0; i < level; i++)
            {
                if(Integer.valueOf(num.charAt(i)) == number[i] + 48)
                {
                    strike++;
                    if (strike == level)
                    {
                        TF  = false;
                    }
                }
                else
                {
                    for(int j = 0; j < level; j++)
                    {
                        if (Integer.valueOf(num.charAt(i)) == number[j] + 48)
                        {
                            boll++;
                        }
                    }
                }
            }
            System.out.println("스트라이크 : " + strike + "\n볼 : " + boll);
            strike = boll = 0;
        }
    }
}