package J2Kad10;

/*
	�ۑ薼�FJ2Kad10D�uECC�����A�ĂсI�v
	�쐬���F2022/10/31
	�쐬�ҁF�c�����Y
*/
public class J2Kad10D {
    public static void main(String[] args) {
        // �Z�l�̕�W
        System.out.println("ECC�����̏Z�l���W���܂��I");
        Sheep[] nagaya = new Sheep[5];

        for(int i = 0; i< nagaya.length;i++)
            nagaya[i] = new Sheep();

        System.out.println();
        // �Z�l�̎��ȏЉ�
        System.out.println("ECC�����̏Z�l�����ȏЉ�܂��I");
        // �g��for���ŁAfor�i�ϐ��@�F�@�z��j
        for(Sheep s : nagaya)
            s.intro();
    }
}
