package J2Kad06;/*
	�ۑ薼�FJ2Kad06B�u�����X�^�[��T���I�v
	�쐬���F2022/10/17
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad06B {
    public static void main(String[] args) {
        Monster[] m = new Monster[3];
        m[0] = new Monster("�s�J�`���E");
        m[1] = new FireMonster("�q�g�J�Q");
        m[2] = new RockMonster("�J�u�g");

        Scanner in = new Scanner(System.in);
        System.out.println("�����X�^�[��T���܂��I");

        while(true) {
            System.out.print("�ǂ����܂����H�i0�F�T���A-1�F��߂�j��");
            int cmd = in.nextInt();
            if (cmd < 0) break;

            // Monster�̎��ȏЉ�
            int ran = (int)(Math.random()*3);
            m[ran].intro();

            System.out.println();
        }
    }
}
