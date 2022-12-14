package J2Kad08;/*
	課題名：J2Kad08D「妖精の召喚（抽象クラス版）」
	作成日：2022/10/24
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad08D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("妖精を召喚して自己紹介させます！");

        while(true) {
            System.out.print("誰を召喚しますか？（0：光の妖精、1：闇の妖精、2：炎の妖精、-1：やめる）＞");
            int n = in.nextInt();
            if (n < 0) break;

            IFairy fairy;

            switch(n) {
                case 0:
                    fairy = new Light();
                    fairy.intro();
                    break;
                case 1:
                    fairy = new Darkness();
                    fairy.intro();
                    break;
                case 2:
                    fairy = new Fire();
                    fairy.intro();
                    break;
            }

            System.out.println();
        }
    }
}
