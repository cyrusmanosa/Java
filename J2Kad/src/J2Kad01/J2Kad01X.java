package J2Kad01;/*
    �ۑ薼�FJ2Kad01.J2Kad01X�u�X�^�b�N�I�v
    �쐬���F2022/09/26
    �쐬�ҁF���Ər
 */
import java.util.*;
public class J2Kad01X {
    static Scanner sc = new Scanner(System.in);
    static int size;
    static int[] stack = new int[10];
    public static void main(String[] args) {
        System.out.println("�X�^�b�N��������܂��I");
        int choose = 0;
        while (choose != -1) {
            System.out.print("�ǂ����܂����H�i1�Fpush�A2�Fpop�A-1�F�I���j�� ");
            choose = sc.nextInt();
            if (choose == 1) {
                push();
            }else if (choose == 2){
                pop();
            } else {
                sc.close();
            }
        }
    }

    public static void push() {
        pushData();
    }

    public static void pop() {
        popData();
        size--;
        showData();
    }

    public static void showData(){
        System.out.print("stack�F");
        for (int x = 0; x < size; x++){
            System.out.print(stack[x] + " ");
        }
        System.out.println(" ");
    }

    public static void pushData(){
        int newsize = size + 3;
        for (; size < newsize; size++){
            int date = (int)(Math.random()*100);
            stack[size] = date;
        }
        showData();
    }

    public static void popData(){
        System.out.println(stack[size - 1] + "�����o���܂����I");
    }
}
