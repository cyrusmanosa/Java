package J2Kad11;

import java.util.Scanner;
public class A123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0より大きい整数を入力してください");
        int n = in.nextInt();
        switch (n % 5){
            case 0 :
                System.out.println("5で割り切れます");
                break;
            default:
                System.out.println("5で割り切れません");
                break;
        }
        in.close();
    }
}
