/*
	�ۑ薼�FJ2Kad06A�u�d���̏����v
	�쐬���F2022/10/17
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad06A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�d�����������Ď��ȏЉ���܂��I");

        Fairy[] m = new Fairy[3];
        m[0] = new Light();
        m[1] = new Darkness();
        m[2] = new Fire();

        while (true) {
            System.out.print("�N���������܂����H�i0�F���̗d���A1�F�ł̗d���A2�F���̗d���A-1�F��߂�j�� ");
            int choose = in.nextInt();
            if ( choose < 0 ){ break;}
            m[choose].intro();
            System.out.println();
        }
    }
}
