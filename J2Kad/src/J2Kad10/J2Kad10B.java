package J2Kad10;/*
	�ۑ薼�FJ2Kad10C�u�񋓌^?�v
	�쐬���F2022/10/31
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad10B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("����񂯂�����܂��I");
//      ��̏Љ�

        Janken.Hand[] hands = Janken.Hand.values();
//      System.out.println(hands[0].name + hands[0].feature);
        for(Janken.Hand h : hands){
            System.out.println(h.name + ":" + h.feature);
        }

        while(true) {
            // ��̑I��
            System.out.print("���������܂���?(0:�O�[�A1:�`���L�A2:�p�[�A-1:�I���j��");
            int user = in.nextInt();
            if (user < 0) break;
            int comp = (int)(Math.random() * 3);
//            enum �̃f�[�^��z��Ŏ擾�uJanken.Hand.values()�v
//            ��̕\��
//            String[] strHands = {"�O�[", "�`���L", "�p�["};
//            System.out.println("���Ȃ���" + strHands[user] + "���o�����I");
//            System.out.println("�R���s���[�^��" + strHands[comp] + "���o�����I");

            System.out.println("���Ȃ���" + hands[user].name + "���o�����I" );
            System.out.println("�R���s���[�^��" + hands[comp].name + "���o�����I");
//            ���ʕ\���i�쐬���邱�Ɓj
//            ����񂯂�N���X���쐬�����ʂ�\��
            System.out.println(Janken.resultTbl[user][comp].msg);
//            switch (Janken.resultTbl[user][comp]){
//                case WIN:
//                    System.out.println("����");
//                    break;
//                case LOSE:
//                    System.out.println("����");
//                    break;
//                case DRAW:
//                    System.out.println("��������");
//                    break;
//                default:
//            }
            System.out.println();
        }
    }
}
