package J2Kad10;

/*
	�ۑ薼�FJ2Kad10D�uECC�����A�ĂсI�v
	�쐬���F2022/10/31
	�쐬�ҁF�c�����Y
*/
public class J2Kad10A {
    public static void main(String[] args) {
        // �Z�l�̕�W
        System.out.println("���]��ECC�̏Z�l���W���܂��I");
        Sheep[][] maison = new Sheep[3][];
        //0 �t���A�ɂR�C���̔z����`
        for ( int i = 0; i < maison.length; i++) {
            maison[i] = new Sheep[maison.length - i];
            for (int j = 0; j < maison[i].length; j++){
                maison[i][j] = new Sheep();
            }
            System.out.println();
        }

        System.out.println("���]��ECC �̏Z�l�Ɏ��ȏЉ���܂��I");

        for ( Sheep[] s : maison){
            for( Sheep j : s) {
                j.intro();
            }
        System.out.println();
        }
    }
}
