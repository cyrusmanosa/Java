/*
	�ۑ薼�FJ2Kad08D�u�d���̏����i���ۃN���X�Łj�v
	�쐬���F2022/10/24
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad08C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�d�����������Ď��ȏЉ���܂��I");

        while(true) {
            System.out.print("�N���������܂����H�i0�F���̗d���A1�F�ł̗d���A2�F���̗d���A-1�F��߂�j��");
            int n = in.nextInt();
            if (n < 0) break;

            IFairy fairy = null;

            switch(n) {
                case 0:
                    fairy = new Light();
                    break;
                case 1:
                    fairy = new Darkness();
                    break;
                case 2:
                    fairy = new Fire();
                    break;
            }
            fairy.intro();
            System.out.println();
        }
    }
}
