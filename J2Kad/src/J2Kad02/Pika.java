package J2Kad02;

public class Pika {
    String name = "���ݒ�";    // �L������
    int hp = 1;            // �U����
    // ���\�b�h
    public void showInfo(){
        // ����\��
        System.out.println("�ڂ��̖��O��" + name + "�I HP��" + hp + "����I");
    }
    public void walk(){
        System.out.println("�Ă��Ă��E�E�E");
        hp--;
    }
    public void sleep(){
        System.out.println("���������E�E�E");
        hp++;
    }
}
