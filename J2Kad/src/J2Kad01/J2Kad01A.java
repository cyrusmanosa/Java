package J2Kad01;
/*
    �ۑ薼�FJ2Kad01.J2Kad01A�u2��ڂ̂������v
    �쐬���F2022/09/26
    �쐬�ҁF���Ər
 */
public class J2Kad01A {
    static int Hamburger = 200;
    static int donut = 120;
    static int coffee = 350;
    static int money = 1000;
    static String name = "�̂ё�";
    public static void main(String[] args) {
        System.out.println("2��ڂ̂������I ");
        System.out.println(name + "���n���o�[�K�[�ƃh�[�i�c�ƃR�[�q�[�𔃂��ɍs���܂��I");
        showMoney();
        gotoECCBurger();
        gotoECCDonut();
        gotoECCCoffee();
    }

    public static void showMoney(){
        System.out.println("��������" + money + "�~�ł��B");
    }

    public static void gotoECCBurger(){
        System.out.println("ECC�o�[�K�[�ɒ����܂���");
        System.out.println("�n���o�[�K�[" + Hamburger + "�~�𔃂��܂���");
        money -= Hamburger;
        showMoney();
    }

    public static void gotoECCDonut(){
        System.out.println("ECC�h�[�i�c�ɒ����܂���");
        System.out.println("�h�[�i�c" + donut + "�~�𔃂��܂���");
        money -= donut;
        showMoney();
    }

    public static void gotoECCCoffee(){
        System.out.println("ECC�R�[�q�[�ɒ����܂���");
        System.out.println("�R�[�q�[" + coffee + "�~�𔃂��܂���");
        money -= coffee;
        showMoney();
    }
}
