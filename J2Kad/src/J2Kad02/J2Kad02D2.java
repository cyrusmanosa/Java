package J2Kad02;

public class J2Kad02D2 {
    public static void main(String[] args) {
        Pika yadon;
        yadon = new Pika();
        yadon.name = "���h��"; // ���O��ݒ�
        yadon.hp = 30; // �U���͂�ݒ�

        System.out.println(" ");
        System.out.println(yadon.name + "�����ꂽ�I");

        yadon.showInfo();// ��{����\��
        System.out.println(yadon.name + "���U�������܂��I");
        yadon.walk();
        yadon.walk();
        yadon.walk();
        yadon.showInfo();
        System.out.println(yadon.name + "�𖰂点�܂��I");
        yadon.sleep();
        yadon.sleep();
        yadon.sleep();
        yadon.showInfo();
    }
}

