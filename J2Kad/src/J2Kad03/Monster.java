package J2Kad03;

public class Monster {
    private String name;
    private int hp;

     Monster(){
         setData("�܂��Ȃ���",1);
    }

    public Monster(String n,int h){
        setData(n,h);
    }

    public void setData(String n, int h) {
        name = n;
        hp = h;
    }
    public void showData() {
        System.out.println("�ڂ��̖��O��" + name + "�AHP��" + hp + "����I");
    }

    public void walk() {
        if (hp <= 0) {
            System.out.println("����ĕ����Ȃ���`");
            return;
        }
        System.out.println("�Ă��Ă��E�E�E");
        hp--;
    }
    public void sleep() {
        System.out.println("���������E�E�E");
        hp++;
    }

    public void setName(String name){
        if(name == "�Q���Q��"){
            System.out.println("�Q���Q���Ȃ�Ė��O�͂��₾~");
        }
    }
    public void setHp(int hp){
         if(hp < 0){
             System.out.println("���߂�HP�A1�͂��傤����!");
             this.hp = 1;
         }
    }
}
