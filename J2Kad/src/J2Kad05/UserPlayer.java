package J2Kad05;

import java.util.Scanner;

public class UserPlayer extends BasePlayer{
    private Scanner in = new Scanner(System.in);
    private int UPstone;

    UserPlayer(){
        //System.out.println("UserPlayer �̃R���X�g���N�^���Ăяo����܂����I");
        System.out.print("���Ȃ��̖��O����͂��Ă��������� ");
        name = in.next();
        System.out.println();
    }
    public void intro(){
        System.out.println("���O�F" + name + "�E�E�E���Ȃ������삷��v���C���[�ł��B");
    }
    public int takeStone(int stone){
        UPstone = in.nextInt();
        return UPstone;
    }
}
