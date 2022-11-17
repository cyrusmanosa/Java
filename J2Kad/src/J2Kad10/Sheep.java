package J2Kad10;

public class Sheep {
    private static String[] nameData = {
            "�s�^�S���X",
            "�A���L���f�X",
            "�G���X�g�e�l�X",
            "���[�N���b�h",
            "�t�B�{�i�b�`",
            "�f�J���g",
            "�t�F���}�[",
            "�p�X�J��",
            "�I�C���[",
            "���v���X",
            "�t�[���G",
            "�K�E�X",
            "�h�E�����K��",
            "�u�[��",
            "���[�}��",
            "�|�A���J��",
            "���b�Z��",
            "�j���[�g��",
            "�e�C���[",

            "�P�v���[",
            "�K�����I",
            "�{�C��",
            "�t�b�N",
            "�z�C�w���X",
            "�x���k�C",
            "���O�����W��",
            "�t�@���f�[",
            "�W���[��",
            "�t�[�R�[",
            "�X�g�[�N�X",
            "�}�N�X�E�F��",
            "�}�b�n",
            "�����g�Q��",
            "�L�����[",
            "���U�t�H�[�h",
            "�A�C���V���^�C��",
    };
    private static int rest = nameData.length;
    private String name;

    public Sheep() {
        int n = (int)(Math.random() * rest);
        name = nameData[n];
        rest--;
        nameData[n] = nameData[rest];
        nameData[rest] = name;
        if (rest == 0) rest = nameData.length;

        System.out.println(name + "������Ă����I");
    }

    public void intro() {
        System.out.println("�u�킽����" + name + "�A��낵�����F?�I�v");
    }
}
