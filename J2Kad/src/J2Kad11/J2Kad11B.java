package J2Kad11;/*
	�ۑ薼�FJ2Kad11C�u���b�p�[�N���X�v
	�쐬���F2022/11/07
	�쐬�ҁF�c�����Y
*/
import java.util.HashMap;

public class J2Kad11B {
    public static void main(String[] args) {
        HashMap<String,Integer> HB = new HashMap<>();
        HB.put( "�n���o�[�K�[" , 150 );
        HB.put("�`�[�Y�o�[�K�[",180);
        HB.put("�r�b�O�}�b�N",410);

        // �f�[�^�̊i�[
        System.out.println("ECC �o�[�K�[�ւ悤�����I");
        System.out.println("���j���[��\�����܂��I");

        for ( var Key : HB.keySet()){
            System.out.println(Key/* ��ꎑ��*/  + " : " + HB.get(Key)/* ��񎑗�*/ + "�~");
        }
    }
}
