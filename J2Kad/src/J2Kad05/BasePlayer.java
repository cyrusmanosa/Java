package J2Kad05;

public class BasePlayer {

    protected String name;
    private int BPstone;


    BasePlayer(){
        name = "CPU";
    }
    public void intro(){
        System.out.println("���O�F" + name + "�E�E�E���΂̐��𗐐��Ō��߂܂��B");
    }
    public String toString(String name){
        return name;
    }
    public int takeStone(int stone){
        BPstone = (int)(Math.random()*3+1);
        return BPstone;
    }

}
