/*
    �ۑ薼�FJ2Kad04B
    �쐬���F2022/10/06
    �쐬�ҁF�c�����Y
 */
import java.util.Scanner;

public class J2Kad04B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�s�N�~����T���܂��I");
        while(true) {
            Pikmin.showCount();

            System.out.print("�ǂ����܂����H�i0�F�T���A-1�F��߂�j�� ");
            int choose = in.nextInt();

            Pikmin[] pikmin = new Pikmin[3];
            if ( choose != 0){break;}

            int RD = (int)(Math.random()*4);
            if ( RD > 0) {
                for (int x = 0; x < RD; x++) {
                    pikmin[x] = new Pikmin();
                }
                System.out.println(RD + "�C�������I");
            }else{
                System.out.println("������Ȃ������I");
            }
            System.out.println(" ");
        }
    }
}
