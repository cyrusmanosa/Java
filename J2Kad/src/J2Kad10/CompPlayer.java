package J2Kad10;

public class CompPlayer extends BasePlayer {
    public CompPlayer() { super("�R���s���[�^"); }
    public int selectHand() {
        // �������邱��
        int R = (int)(Math.random()*3);
        return R;          // �_�~�[
    }
}
