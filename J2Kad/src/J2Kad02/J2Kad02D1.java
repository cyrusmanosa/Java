package J2Kad02;

public class J2Kad02D1 {
    public static void main(String[] args) {
        Pika pikachiu;
        pikachiu = new Pika();
        pikachiu.name = "�s�J�`���E"; // ���O��ݒ�
        pikachiu.hp = 20; // �U���͂�ݒ�

        System.out.println(" ");
        System.out.println(pikachiu.name + "�����ꂽ�I");

        pikachiu.showInfo();// ��{����\��
        System.out.println(pikachiu.name + "���U�������܂��I");
        pikachiu.walk();
        pikachiu.walk();
        pikachiu.walk();
        pikachiu.showInfo();
        System.out.println(pikachiu.name + "�𖰂点�܂��I");
        pikachiu.sleep();
        pikachiu.sleep();
        pikachiu.sleep();
        pikachiu.showInfo();
    }
}
