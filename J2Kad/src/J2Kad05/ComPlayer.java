package J2Kad05;

public class ComPlayer extends BasePlayer{
    ComPlayer(){
        name = "HAL";
        //System.out.println("CompPlayer �̃R���X�g���N�^���Ăяo����܂����I");
    }

    public void intro(){
        System.out.println("���O�F" + name + "�E�E�E���������ł��B");
    }

    public int takeStone(int stone){
        int x = (int) (Math.random()*3+1);
        switch (stone){
            case 1,2,3,4:
                return 1;
            case 6,7,8:
                return 5;
            default:
                return x;
        }
    }
}
