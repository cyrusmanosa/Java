package J2Kad04;

public class Student {
    private final String name;
    private final String course;

    Student(String name, String course){
        this.name = name;
        this.course = course;
        System.out.println(this.name + "������Ă����I");
    }

    public void showData(){
        System.out.println("���O: " + this.name + "�R�[�X: " + this.course);
    }
}
