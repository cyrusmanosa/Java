package J2Kad10;/*
	課題名：J2Kad10C「列挙型?」
	作成日：2022/10/31
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad10B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("じゃんけんをします！");
//      手の紹介

        Janken.Hand[] hands = Janken.Hand.values();
//      System.out.println(hands[0].name + hands[0].feature);
        for(Janken.Hand h : hands){
            System.out.println(h.name + ":" + h.feature);
        }

        while(true) {
            // 手の選択
            System.out.print("何をだしますか?(0:グー、1:チョキ、2:パー、-1:終了）＞");
            int user = in.nextInt();
            if (user < 0) break;
            int comp = (int)(Math.random() * 3);
//            enum のデータを配列で取得「Janken.Hand.values()」
//            手の表示
//            String[] strHands = {"グー", "チョキ", "パー"};
//            System.out.println("あなたは" + strHands[user] + "を出した！");
//            System.out.println("コンピュータは" + strHands[comp] + "を出した！");

            System.out.println("あなたは" + hands[user].name + "お出した！" );
            System.out.println("コンピュータは" + hands[comp].name + "お出した！");
//            結果表示（作成すること）
//            じゃんけんクラスを作成し結果を表示
            System.out.println(Janken.resultTbl[user][comp].msg);
//            switch (Janken.resultTbl[user][comp]){
//                case WIN:
//                    System.out.println("勝ち");
//                    break;
//                case LOSE:
//                    System.out.println("負け");
//                    break;
//                case DRAW:
//                    System.out.println("引き分け");
//                    break;
//                default:
//            }
            System.out.println();
        }
    }
}
