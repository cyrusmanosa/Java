package J2Kad11;

import java.util.ArrayList;
public class J2Kad11C {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // �f�[�^�̊i�[
        System.out.println("�f�[�^���i�[���܂��I");
        for ( int i = 0 ; i < 5; i++){
            int data = (int)(Math.random()*100);
            System.out.println("add:" + data);
            list.add(Integer.valueOf(data));
        }
        System.out.println();
        // �f�[�^�̕\��
        System.out.println("�f�[�^��\�����܂��I");
        for (var data : list ){
            System.out.println("get: " + data);
        }
        // var ���_�^
    }
}
