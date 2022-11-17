package J2Kad06;/*
	�ۑ薼�FJ2Kad06S�u�Ύ��Q�[�������I�v
	�쐬���F2022/10/17
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad06S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // �����̕\��
        System.out.println("20����΂����݂Ɏ���Ă����܂��B��x�Ɏ���΂̐���1-3�ł��B");
        System.out.println("�Ō��1����������������ł��B");
        System.out.println();

        // �����ݒ�
        int	stone = 20;			// �΂̐�
        BasePlayer[] P = {
                new BasePlayer(),
                new UserPlayer(),
                new CompPlayer(),
                new MasterPlayer()
        };

        System.out.print("����I��ł��������i0�FBase�A1�FUser�A2�FComp�A3�FMaster�j�� ");
        int FP = in.nextInt();
        P[FP].intro();
        System.out.print("����I��ł��������i0�FBase�A1�FUser�A2�FComp�A3�FMaster�j�� ");
        int SP = in.nextInt();

        P[SP].intro();

        System.out.println();

        int take;

        while(true) {
            // ���̎��
            showStone(stone);
            System.out.println("���F" + P[FP] + "�̔Ԃł��B");
            take = P[FP].takeStone(stone);
            System.out.println(take + "���܂����I");
            stone -= take;
            if (stone <= 0) {
                System.out.println(P[FP] + "�̕����ł��I");
                break;
            }
            System.out.println();

            // ���̎��
            showStone(stone);
            System.out.println("���F" + P[SP] + "�̔Ԃł��B");
            take = P[SP].takeStone(stone);
            System.out.println(take + "���܂����I");
            stone -= take;
            if (stone <= 0) {
                System.out.println(P[SP] + "�̕����ł��I");
                break;
            }
            System.out.println();
        }
    }
    public static void showStone(int stone) {
        System.out.print("�c��" + stone + "�F");
        while( stone > 0 ) {
            System.out.print("��");
            stone--;
        }
        System.out.println();
    }
}
