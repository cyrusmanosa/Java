package J2Kad01;

/*
    �ۑ薼�FJ2Kad01.J2Kad01C�u�s�J�`���E����I�v
    �쐬���F2022/09/26
    �쐬�ҁF���Ər
 */
public class J2Kad01C {
    static String name;
    static int hp;
    public static void main(String[] args) {
        name = "�s�J�`���E";
        hp = 20;
        showData();
        walk();
        walk();
        walk();
        showData();
        sleep();
        sleep();
        sleep();
        showData();
    }

    public static void showData(){
        System.out.println("�ڂ��̖��O��" + name + "�IHP��" + hp + "����I");
    }

    public static void walk(){
        System.out.println("�Ă��Ă��E�E�E");
        hp--;
    }
    public static void sleep(){
        System.out.println("���������E�E�E");
        hp++;
    }
}
