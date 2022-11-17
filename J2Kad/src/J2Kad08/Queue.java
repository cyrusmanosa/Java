package J2Kad08;

public class Queue implements IContainer{
    private Monster[] container;
    private int start;          // �擪�|�W�V����
    private int used;          // �f�[�^��

    public Queue(int size) {
        container = new Monster[size];
        start = 0;
        used = 0;
        System.out.println("�҂��s������܂����I");
    }
    public void push(Monster data) {
        container[(start + used) % container.length] = data;
        used++;
    }
    public Monster pop() {
        Monster m = container[start];
        start = (start + 1) % container.length;
        used--;
        return m;
    }
    public Monster getData(int i) { return container[(start + i) % container.length]; }
    public int size() { return used; }
    public boolean empty() { return (used <= 0); }
    public boolean full() { return (used >= container.length); }
}
