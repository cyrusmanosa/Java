package J2Kad05;

public class SwimMonster extends Monster {

    SwimMonster(){
        System.out.println("SwimMonster �N���X�̃R���X�g���N�^���Ăяo����܂����I�v");
    }

    public void swim(){
        if (hp <= 0){
            System.out.println("���ĉj���Ȃ���?");
        }else{
            System.out.println(name + "���j����I�Ԃ��Ԃ����");
            hp--;
        }
    }

    public void walk(){
        System.out.println("���тꂾ�ƕ����Ȃ���?");
    }

    public void intro(){
        // �X�[�p�[�N���X�ł���Monster�N���X��intro()���Ă�
        super.intro();
        System.out.println("�j�������ӂ��I");
    }
}
