package J2Kad06;

/*
	�ۑ薼�FJ2Kad?06D�u�X�[�p�[�N���X�̎Q�Ɓv
	�쐬���F2022/10/17
	�쐬�ҁF�c�����Y
*/
public class J2Kad06D {
    public static void main(String[] args) {
        // Monster
        Monster m0 = new Monster("�s�J�`���E");
        m0.intro();
        System.out.println();

        // FireMonster
        Monster m1 = new FireMonster("�q�g�J�Q");
        m1.intro();
        System.out.println();

        // RockMonster
        Monster m2 = new RockMonster("�J�u�g");
        m2.intro();
    }
}
