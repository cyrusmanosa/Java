package J2Kad02;

import java.util.*;
public class J2Kad02A {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Monster pikachiu;
        pikachiu = new Monster();

        Monster Iwanko;
        Iwanko = new Monster();

        pikachiu.setData("�s�J�`���E", (int)(Math.random()*20 + 10));
        System.out.println(pikachiu.name + "�����ꂽ�I");
        pikachiu.showData();

        Iwanko.setData("�C�����R", (int)(Math.random()*20 + 10));
        System.out.println(Iwanko.name + "�����ꂽ�I");
        Iwanko.showData();

        while(true) {
            System.out.print("�ǂ̃����X�^�[���g���܂����H�i1�F�s�J�`���E�A2�F�C�����R�A-1�F��߂�j�� ");
            int FC = in.nextInt();

            if (FC == 1) {
                useMonster(pikachiu);
            } else if (FC == 2) {
                useMonster(Iwanko);
            } else {
                break;
            }
        }
    }
    public static void useMonster(Monster m){
        m.showData();
        while(true) {
            System.out.print("1�F�U������A2�F����A-1�F��߂�> ");
            int SC = in.nextInt();
            if (SC == 1) {
                m.walk();
                m.showData();
            } else if (SC == 2) {
                m.sleep();
                m.showData();
            }else{
                break;
            }
        }
    }
}
