/*
	�ۑ薼�FJ2Kad08A�u�}�`��`�悵�悤�I�v
	�쐬���F2022/10/24
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad08A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Canvas	c = new Canvas(40, 25);

        while(true) {
            System.out.print("����`�悵�܂����H�i0�F�O�p�`�A1�F�����`�A2�F�~�A3�F�����A4:�����`�A-1�F�I���j��");
            int	n = in.nextInt();
            if (n < 0) break;

            IShape shape;

            // ���ȗ������邱��
            switch(n) {
                default:
                case 0:
                    shape = new Triangle(1, 22, 18, 9);
                    break;
                case 1:
                    shape = new Rectangle(12, 3, 20, 14);
                    break;
                case 2:
                    shape = new Circle(29, 9, 8);
                    break;
                case 3:
                    shape = new Eraser();
                    break;
                case 4:
                    shape = new Square(1,1,16);
                    break;
            }
            shape.draw(c);

            c.show();
        }
    }
}
