package J2Kad05;/*
	�ۑ薼�FJ2Kad05S�u�ŋ��IMasterPLayer�I�I�v
	�쐬���F2022/10/13
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad05S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // �����̕\��
        System.out.println("20����΂����݂Ɏ���Ă����܂��B��x�Ɏ���΂̐���1-3�ł��B");
        System.out.println("�Ō��1����������������ł��B");
        System.out.println();

        // �����ݒ�
        int	stone = 20;			// �΂̐�
        // user create
        UserPlayer Uplayer = new UserPlayer();
        Uplayer.intro();

//        BasePlayer Bplayer = new BasePlayer();
//        Bplayer.intro();

        ComPlayer Cplayer = new ComPlayer();
        Cplayer.intro();

        int take;				// ���΂̐�
        while(true) {
            // ���Ȃ��̎��
            showStone(stone);
            System.out.println(Uplayer.name + "�̔Ԃł��B");
            System.out.print("�����܂����H�i1-3�j��");
            take = in.nextInt();
            System.out.println(take + "���܂����I");
            stone -= take;
            if (stone <= 0) {
                System.out.println(Cplayer.name + "�̕����ł��I");
                break;								// while���𔲂���
            }
            System.out.println();

            // CPU�̎��
            showStone(stone);
            System.out.println(Cplayer.name + "�̔Ԃł��B");
            take = (int)(Math.random() * 3) + 1;
            System.out.println(take + "���܂����I");
            stone -= take;
            if (stone <= 0) {
                System.out.println(Cplayer.name + "�̕����ł��I");
                break;								// while���𔲂���
            }
            System.out.println();
        }
        in.close();
    }
    public static void showStone(int stone) {
        System.out.print("�c��" + stone + "�F");
        while(stone > 0) {
            System.out.print("��");
            stone--;
        }
        System.out.println();
    }
}
