package J2Kad04;

/*
    �ۑ薼�FJ2Kad04C
    �쐬���F2022/10/06
    �쐬�ҁF�c�����Y
 */
public class J2Kad04C {
    public static void main(String[] args) {
        System.out.println("1");
        Sheep.countSheep();

        System.out.println("2");
        System.out.println("�r��2 �C�A��Ă��܂��I");
        Sheep.countSheep();

        System.out.println("3");
        Sheep.countSheep();

        System.out.println("4");
        System.out.println("�r��3 �C�i�z��Łj�A��Ă��܂��I");
        Sheep[] sheeps = new Sheep[3];

        Sheep.countSheep();

        System.out.println("5");
        sheeps[0] = new Sheep();
        sheeps[1] = new Sheep();
        sheeps[2] = new Sheep();
        Sheep.countSheep();

    }
}
