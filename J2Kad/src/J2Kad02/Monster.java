package J2Kad02;

public class Monster {
    public String name;
    public int hp;

    public void setData(String n, int h){
        name = n;
        hp = h;
    }

    public void showData(){
        System.out.println("�ڂ��̖��O��" + name + "�IHP ��" + hp + "����I");
    }

    public void walk(){
        if (hp<=0){
            System.out.println("����ĕ����Ȃ���?");
        }else{
            System.out.println("�Ă��Ă��E�E�E");
            hp--;
        }
    }

    public void sleep(){
        System.out.println("���������E�E�E");
        hp++;
    }
}
