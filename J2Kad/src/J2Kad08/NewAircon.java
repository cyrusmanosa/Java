package J2Kad08;

public class NewAircon implements IAircon{
    int mode;
    boolean power;
    String[] modes = {"��[","�g�[","����"};

    NewAircon(){
        power = false;
        mode = 0;

    }

    public void showData(){
        if( power == true ){
            System.out.println("�d���FON�A�^�]���[�h:" + modes[mode]);
        }else{
            System.out.println("�d���FOFF");
        }
    }
    public void powerOnOff(){
        if( power == false ){
            power = true;
            System.out.println("�d�������܂����I");
        }else{
            power = false;
            System.out.println("�d����؂�܂����I");
        }
    }
    public void toCool(){
        if( power == true ){
            mode = 0;
            System.out.println("��[�ɐ؂芷���܂����I");
        }else{
            System.out.println("�d���������Ă��܂���I");
        }
    }
    public void toHeat(){
        if( power == true ){
            mode = 1;
            System.out.println("�g�[�ɐ؂芷���܂����I");
        }else{
            System.out.println("�d���������Ă��܂���I");
        }
    }
    public void toBlow(){
        if ( power == true ){
            mode = 2;
            System.out.println("�����ɐ؂芷���܂����I");
        }else{
            System.out.println("�d���������Ă��܂���I");
        }
    }
}
