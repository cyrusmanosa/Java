package J2Kad07;/*
	�ۑ薼�FJ2Kad07A�uECC�R�[�q�[�ĂсI�v
	�쐬���F2022/10/20
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad07S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ECC�R�[�q�[�ւ悤�����I");
        System.out.println("��O�s�o�̃��V�s�ō�邩��A����������I�I");
        System.out.println();

        while (true) {
            System.out.print("�������́H�i0�F�R�[�q�[�A1�G�g���A2�F�R�R�A�A3�F�䂸���A-1�F�X���o��j�� ");
            int	n = in.nextInt();
            if (n < 0) break;
            switch (n) {
                default:
                case 0:
                    Coffee C = new Coffee();
                    C.execute();
                    break;
                case 1:
                    Tea T = new Tea();
                    T.execute();
                    break;
                case 2:
                    Cocoa CO = new Cocoa();
                    CO.execute();
                    break;
                case 3:
                    Yuzu Y = new Yuzu();
                    Y.execute();
                    break;
            }

            System.out.println("���҂������܂����I���������ǂ����I");
            System.out.println();
        }

        System.out.println("���肪�Ƃ��������܂����I");
    }
}
