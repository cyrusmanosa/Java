package J2Kad05;

/*
	�ۑ薼�FJ2Kad05B�u�Ύ��Q�[���̏����v
	�쐬���F2022/10/13
	�쐬�ҁF�c�����Y
*/
public class J2Kad05B {
    public static void main(String[] args) {
        System.out.println("�Ύ��Q�[���̏��������܂��I");
        System.out.println();

        // BasePlayer�̐���
        BasePlayer m = new BasePlayer();
        m.intro();

        System.out.println();

        // UserPlayer�̐���
        UserPlayer n = new UserPlayer();
        n.intro();

        System.out.println();

        // BasePlayer VS UserPlayer
        System.out.println(m.toString(m.name)  + "��" + n.name + "���킢�܂��I");

    }
}
