package J2Kad06;

import java.util.Scanner;

public class UserPlayer extends BasePlayer {
    private Scanner in = new Scanner(System.in);

    @Override
    public void intro() {
        System.out.print("���Ȃ��̖��O����͂��Ă���������");
        name = in.next();
        super.intro();
    }
    public int takeStone(int stone) {
        System.out.print("�����܂����H�i1-3�j��");
        return in.nextInt();
    }
    protected String myStrategy() { return "���Ȃ������삷��v���C���[�ł��B"; }
}
