package J2Kad03;

/*
    �ۑ薼�FJ2Kad03B�u�A�N�Z�T�v
    �쐬���F2022/10/03
    �쐬�ҁF���Ər
 */
public class J2Kad03B {
    public static void main(String[] args) {
        Profile Doraemon;
        Doraemon = new Profile("�h��������",123.9,123.9);
        Profile Doramichan;
        Doramichan = new Profile("�h���~�����",100.0,91.0);

        System.out.println( Doraemon.getName() + "�̃v���t�B�[���ł�!");
        System.out.println("�g��:" + Doraemon.getHeight());
        System.out.println("�̏d:" + Doraemon.getWeight());

        System.out.println( Doramichan.getName() + "�̃v���t�B�[���ł�!");
        System.out.println("�g��:" + Doramichan.getHeight());
        System.out.println("�̏d:" + Doramichan.getWeight());

    }
}
