package J2Kad08;

public class OldAircon {
    protected final int OFF = 0;
    protected final int COOL = 1;
    protected final int HEAT = 2;
    protected final int BLOW = 3;
    private final String[] strKnob = {"��","��[", "�g�[", "����"};
    private int knob;                   // �܂݁i�؁A��[�A�g�[�A�����j
    public OldAircon() { knob = OFF;}
    public int getKnob() { return knob; }

    public void showData() {
        System.out.println("��������[" + strKnob[knob] + "]�ł��B");
    }

    public void turnRight() {
        if (knob == strKnob.length - 1) {
            System.out.println("����ȏ�܂݂��񂷂��Ƃ͂ł��܂���I");
        } else {
            knob++;
            System.out.println("�܂݂��E�ɉ񂵂��I");
        }
    }

    public void turnLeft() {
        if (knob == 0) {
            System.out.println("����ȏ�܂݂��񂷂��Ƃ͂ł��܂���I");
        } else {
            knob--;
            System.out.println("�܂݂����ɉ񂵂��I");
        }
    }
}
