/*
	�ۑ薼�FJ2Kad07D�uRPG�L�����N�^�[�v
	�쐬���F2022/10/20
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad07B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("�W���u��I��ł��������i0�F��m�A1�F���@�g���A2�F�����N�A3�F�����A-1�F�I���j�� ");
            int job = in.nextInt();
            if (job < 0) break;

            switch(job) {
                default:
                case 0: // Fighter
                    Fighter f = new Fighter();
                    f.attack();
                    f.defend();
                    f.useItem();
                    break;
                case 1: // Mage
                    Mage m = new Mage();
                    m.attack();
                    m.defend();
                    m.useItem();
                    break;
                case 2:
                    Monk n = new Monk();
                    n.attack();
                    n.defend();
                    n.useItem();
                    break;
                case 3:
                    Thief T = new Thief();
                    T.callAllMethod();
                    T.steal();
            }

            System.out.println();
        }
    }
}