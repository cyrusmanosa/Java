package J2Kad08;/*
	�ۑ薼�FJ2Kad08X�u�����G�A�R���iAdapter�p�^�[���j�v
	�쐬���F2022/10/24
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad08X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�V�^�G�A�R���Ɠ�������ŋ����G�A�R���𓮂����܂��I");

//        �u�����G�A�R���𑀍삷��N���X�v���ł�����A���̃R�����g���͂����ē���m�F���邱��
        IAircon ac = new OldAirconAdapter();
        while(true) {
            ac.showData();
            System.out.print("�ǂ����܂����H�i0�F�d��ON/OFF�A1�F��[�A2�F�g�[�A3�F�����A-1�F�I���j��");
            int cmd = in.nextInt();
            if (cmd < 0) break;
            switch(cmd) {
                case 0: ac.powerOnOff();    break;
                case 1: ac.toCool();        break;
                case 2: ac.toHeat();        break;
                case 3: ac.toBlow();        break;
            }
            System.out.println();
        }
    }
}
