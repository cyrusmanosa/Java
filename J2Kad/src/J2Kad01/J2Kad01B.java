package J2Kad01;/*
    �ۑ薼�FJ2Kad01.J2Kad01B�u���C�`���E����I�v
    �쐬���F2022/09/26
    �쐬�ҁF���Ər
 */
import java.util.*;
public class J2Kad01B {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        J2Kad01C.name ="�s�J�`���E";
        J2Kad01C.hp = 20;
        J2Kad01C.showData();
        System.out.println(J2Kad01C.name + "���i�������I�I");
        J2Kad01C.name ="���C�`���E";
        J2Kad01C.hp = 40;
        J2Kad01C.showData();

        System.out.print("�ǂ����܂����H�i1�F�U������A2�F����A-1�F�I���j�� ");
        int x = in.nextInt();

        while(x != -1){
            if ( x == 1){
                J2Kad01C.walk();
            }else if (x == 2){
                J2Kad01C.sleep();
            }
            J2Kad01C.showData();
            System.out.print("�ǂ����܂����H�i1�F�U������A2�F����A-1�F�I���j�� ");
            x = in.nextInt();

        }
    }
}
