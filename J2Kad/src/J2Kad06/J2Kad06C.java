package J2Kad06;

/*
	�ۑ薼�FJ2Kad?06D�u�X�[�p�[�N���X�̎Q�Ɓv
	�쐬���F2022/10/17
	�쐬�ҁF�c�����Y
*/
public class J2Kad06C {
    public static void main(String[] args) {
        Monster[] m = new Monster[3];
        m[0] = new Monster("�s�J�`���E");
        m[1] = new FireMonster("�q�g�J�Q");
        m[2] = new RockMonster("�J�u�g");

        for(int x = 0; x < 3; x++){
            m[x].intro();
            System.out.println();
        }
    }
}
