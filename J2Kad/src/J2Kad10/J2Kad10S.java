package J2Kad10;

/*
	�ۑ薼�FJ2Kad10S�u����񂯂�i�N���X�Łj�v
	�쐬���F2022/10/31
	�쐬�ҁF�c�����Y
*/
public class J2Kad10S {
    public static void main(String[] args) {
        System.out.println("����񂯂�����܂��I");
        BasePlayer p0 = new UserPlayer();
        BasePlayer p1 = new CompPlayer();

        while(true) {
            // ��̑I��
            Hand h0 = p0.createHand();
            if (h0 == null) break;
            Hand h1 = p1.createHand();
            if (h1 == null) break;
            // ��̕\��
            System.out.println(p0 + "��" + h0 + "���o�����I");
            System.out.println(p1 + "��" + h1 + "���o�����I");

            // ���ʕ\���i�쐬���邱�Ɓj


            System.out.println();
        }
    }
}
