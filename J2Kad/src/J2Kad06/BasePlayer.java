package J2Kad06;

public class BasePlayer {
    protected String name;
    public BasePlayer() {
        name = "Base";
    }

    public void intro() { System.out.println("���O�F" + this.name + "�E�E�E" + myStrategy()); }
    public String toString() { return name; }
    public int takeStone(int stone) { return 1 + (int)(Math.random() * 3); }
    protected String myStrategy() { return "���΂̐��𗐐��Ō��߂܂��B"; }
}
