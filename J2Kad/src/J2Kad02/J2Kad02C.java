package J2Kad02;

public class J2Kad02C {
    public static void main(String[] args) {
        Monster Diaruga;
        Diaruga = new Monster();
        Monster Koikingu;
        Koikingu = new Monster();

        Diaruga.setData("�f�B�A���K",1000);
        System.out.println(Diaruga.name + "�����ꂽ�I");
        Diaruga.showData();

        Koikingu.setData("�R�C�L���O",1);
        System.out.println(Koikingu.name + "�����ꂽ�I");
        Koikingu.showData();

        System.out.println(Diaruga.name + "���U�������܂��I");
        Diaruga.walk();
        Diaruga.walk();
        Diaruga.walk();
        Diaruga.showData();

        System.out.println(Koikingu.name + "���U�������܂��I");
        Koikingu.walk();
        Koikingu.walk();
        Koikingu.walk();
        Koikingu.showData();

    }
}
