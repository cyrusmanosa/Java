package J2Kad10;/*
	�ۑ薼�FJ2Kad10C�u�񋓌^?�v
	�쐬���F2022/10/31
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad10C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("����񂯂�����܂��I");
        // ��̏Љ�
        System.out.println("�O�[" + "�F\t" + "�`���L�ɏ����āA�p�[�ɕ����܂��I");
        System.out.println("�`���L" + "�F\t" + "�p�[�����āA�O�[�ɕ����܂��I");
        System.out.println("�p�[" + "�F\t" + "�O�[�ɏ����āA�`���L�ɕ����܂��I");
        System.out.println();

        while(true) {
            // ��̑I��
            System.out.print("���������܂����H�i0�F�O�[�A1�F�`���L�A2�F�p�[�A-1�F�I���j��");
            int user = in.nextInt();
            if (user < 0) break;
            int comp = (int)(Math.random() * 3);
            // ��̕\��
            String[] strHands = {"�O�[", "�`���L", "�p�["};
            System.out.println("���Ȃ���" + strHands[user] + "���o�����I");
            System.out.println("�R���s���[�^��" + strHands[comp] + "���o�����I");

            // ���ʕ\���i�쐬���邱�Ɓj
            // ����񂯂�N���X���쐬�����ʂ�\��
            switch (Janken.resultTbl[user][comp]){
                case WIN:
                    System.out.println("����");
                    break;
                case LOSE:
                    System.out.println("����");
                    break;
                case DRAW:
                    System.out.println("��������");
                    break;
                default:
            }
            System.out.println();
        }
    }
}
