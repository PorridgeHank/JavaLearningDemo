package porridge.pro1;

public class Goodemp {
    public String name;
    public double money;

    public Goodemp() {
    }

    public Goodemp(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Goodemp{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
