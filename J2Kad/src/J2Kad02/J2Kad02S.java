package J2Kad02;

import java.util.*;
public class J2Kad02S {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Account Nobita;
        Nobita = new Account();
        Nobita.setData("�̂ё�",8905678,100000,1234);
        Account Suneotto;
        Suneotto = new Account();
        Suneotto.setData("�X�l�v",8901234,999999,5678);
        System.out.println("�������I��s�֍s�����I�I");

        while (true) {
            System.out.print("�N���s���܂����H�i1�F�̂ё��A2�F�X�l�v�A-1�F�N�������Ȃ��j�� ");
            int People = in.nextInt();
            System.out.println("�M���Ǝ��т�ECC ��s�ւ悤�����I");

            if (People == 1) {
                gotoECCBank(Nobita);
            } else if (People == 2) {
                gotoECCBank(Suneotto);
            }else{
                break;
            }

        }
        in.close();
    }

    public static void gotoECCBank(Account account){
        account.showData();
        System.out.print("�ǂ����܂����H�i1�F�a����A2�F�����o���A-1�F�A��j�� ");
        int FC = in.nextInt();
        if (FC == 1){
            deposit(account);
        }else if ( FC == 2){
            withdraw(account);
        }else{
            System.out.println("���肪�Ƃ��������܂����I");
            System.out.println(" ");
        }

    }
    public static void deposit(Account account){
        System.out.print("������a���܂����H�� ");
        int SM = in.nextInt();
        account.money += SM;
        account.showData();
    }
    public static void withdraw(Account account){
        System.out.print("�Ïؔԍ�����͂��Ă��������� ");
        int password = in.nextInt();
        if (password != account.secretNumber){
            System.out.println("�ԍ����Ⴂ�܂��I");
        }else{
            System.out.print("����������o���܂����H�� ");
            int TM = in.nextInt();
            if ( TM > account.money){
                System.out.println("�c���s���ł��I");
            }else{
                account.money -= TM;
                gotoECCBank(account);
            }
        }
    }
}
