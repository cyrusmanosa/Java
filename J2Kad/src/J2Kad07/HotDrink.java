package J2Kad07;

public abstract class HotDrink {
    public void execute(){
        boilWater();
        makeDrink();
        pourInCup();
        addHoney();
    }
    public void boilWater(){System.out.println("�����𕦂����܂����I");}
    public abstract void makeDrink();
    public void addHoney(){};
    public void pourInCup() { System.out.println("�J�b�v�ɒ����܂����I"); }
}
