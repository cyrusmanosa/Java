package J2Kad02;

public class Account {
    public String name;
    public int accountNumber;
    public int money;
    public int secretNumber;

    public void setData(String n,int a, int m, int s){
        name = n;
        accountNumber = a;
        money = m;
        secretNumber = s;
    }

    public void showData(){
        System.out.println(" ");
        System.out.println("口座名義: " + name);
        System.out.println("口座番号: " + accountNumber);
        System.out.println("預金残高: ￥" + money + "円");
    }
}
