package J2Kad10;

import java.util.Scanner;

public class UserPlayer extends BasePlayer {
    private Scanner in = new Scanner(System.in);
    public UserPlayer() { super("���Ȃ�"); }
    public int selectHand() {
        // �������邱��
        System.out.print("���������܂����H�i0�F�O�[�A1�F�`���L�A2�F�p�[�A-1�F�I���j�� ");
        int Choose = in.nextInt();
        return Choose;
    }
}
