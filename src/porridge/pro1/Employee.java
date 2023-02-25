package porridge.pro1;

public class Employee {
    public String name;
    public char sex;
    public double salery;
    public double bonus;
    public String record;

    public Employee() {
    }

    public Employee(String name, char sex, double salery, double bonus, String record) {
        this.name = name;
        this.sex = sex;
        this.salery = salery;
        this.bonus = bonus;
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", salery=" + salery +
                ", bonus=" + bonus +
                ", record='" + record + '\'' +
                '}';
    }
}
