package J2Kad08;/*
	�ۑ薼�FJ2Kad08B�u�����X�[�p�[ECC3���X�v
	�쐬���F2022/10/24
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad08B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("��������Ⴂ�I�����X�[�p�[ECC3���X�ł��I�I");
        System.out.println("���W�҂��s����X�^�b�N�`���Ƒ҂��s��`������I�ׂ܂��I");
        System.out.print("�ǂ���ɂ��܂����H�i0�F�X�^�b�N�A����ȊO�F�҂��s��j��");
        int n = in.nextInt();

        IContainer line;
        if (n == 0)
        { line = new Stack(5); }
        else
        { line = new Queue(5); }

        while(true) {
            // �f�[�^�̕\��
            if (!line.empty()) {
                System.out.println("���݂̃��W�҂��s��ł��I");
                for (int i = 0; i < line.size(); i++){ System.out.println(i + "�F" + line.getData(i));}
                System.out.println();
            }

            // �R�}���h�I��
            System.out.print("�������܂����H�i0�F�q���Ăэ��ށA1�F���W��łA-1�F�X�������ށj��");
            int cmd = in.nextInt();
            if (cmd < 0) break;

            switch (cmd) {
                case 0:
                    for (int i = 1 + (int)(Math.random() * 3); i > 0; i--) {
                        Monster	m = new Monster();
                        System.out.print(m + "������Ă����I");
                        if (line.full()) { System.out.println("�����X�ɓ���Ȃ��I�c�O�I�I"); }
                        else {
                            System.out.println();
                            line.push(m);
                        }
                    }
                    break;

                case 1:
                    if (line.empty()) {
                        System.out.println("���q���񂪂��Ȃ��I�I");
                    }
                    else {
                        Monster m = line.pop();
                        System.out.println(m + "�͋A���Ă������I�I");
                    }
                    break;
            }
            System.out.println();
        }
        System.out.println();
    }
}
