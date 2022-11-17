package J2Kad10;

public class Janken {

    enum Hand {
        GU("�O�[", "�`���L�ɏ����āA�p�[�ɕ����܂��I"),
        CHOKI("�`���L", "�p�[�����āA�O�[�ɕ����܂��I"),
        PA("�p�[", "�O�[�ɏ����āA�`���L�ɕ����܂��I");
        public String name;
        public String feature;

        Hand(String name, String feature) {
            this.name = name;
            this.feature = feature;
        }
    }

    // ���������A�h���[��enum�Œ�`
    enum Result {
        WIN("���Ȃ��̏����ł��I"),
        LOSE("���Ȃ��̕����ł��I"),
        DRAW("���������ł��I");
        public String msg;
        Result(String msg){this.msg = msg;}
    }
    public static Result[][] resultTbl = {
            {Result.DRAW,Result.WIN,Result.LOSE},
            {Result.LOSE,Result.DRAW,Result.WIN},
            {Result.WIN,Result.LOSE,Result.DRAW}
    };
}
