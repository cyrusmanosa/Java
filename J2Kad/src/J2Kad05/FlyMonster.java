package J2Kad05;

public class FlyMonster extends Monster{
    //�@�R���X�g���N�^
    FlyMonster(){
        System.out.println("FlyMonster �N���X�̃R���X�g���N�^���Ăяo����܂����I");
    }

    //�ǉ��̃��\�b�h
    public void fly(){
        if (hp <= 0){
            System.out.println("���Ĕ�ׂȂ���?");
        }else{
            System.out.println(name + "����Ԃ�I�т�?��!!");
            hp--;
        }
    }
}
