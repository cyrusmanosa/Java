package J2Kad01;/*
    �ۑ薼�FJ2Kad01.J2Kad01S�u�������IECC��s�֍s�����I�I�v
    �쐬���F2022/09/26
    �쐬�ҁF�c�����Y
 */
import java.util.*;
public class J2Kad01S {
    static int money = 0;
    static Scanner sc = new Scanner(System.in);
    static final int Mypassword = 1234;
    public static void main(String[] args) {
        System.out.println("�������I��s�֍s�����I�I");
        System.out.println("�M���Ǝ��т�ECC ��s�ւ悤�����I");
        gotoECCBank();
    }

    public static void gotoECCBank() {
        showAccount();
        System.out.print("�ǂ����܂����i1�F�a����A2�F�����o���A-1�F�A��j�� ");
        int input = sc.nextInt();
        if (input == 1) {
            deposit();
        }else if (input == 2){
            withdraw();
        }else if (input <= -1 || input > 2){
            System.out.println("���肪�Ƃ��������܂����I");
        }
    }

    public static void showAccount() {
        System.out.println(" ");
        System.out.println("�������`�F�̂ё�");
        System.out.println("�����ԍ��F1234567");
        System.out.println("�a���c���F" + money);
    }

    public static void deposit()  {
        System.out.print("������a���܂����H��");
        int income = sc.nextInt();
        money += income;
        gotoECCBank();
    }

    public static void withdraw()  {
        System.out.print("�Ïؔԍ�����͂��Ă���������");
        int password = sc.nextInt();
        if (password != Mypassword){
            System.out.println("�ԍ����Ⴂ�܂��I");
            gotoECCBank();
        }
        System.out.print("������Ђ������܂����H�@");
        int output = sc.nextInt();
        if (output > money){
            System.out.println("�c���s���ł��I");
        }else{
            money -=output;
        }
        gotoECCBank();
    }
}
