package porridge.pro1;

import java.util.ArrayList;
import java.util.List;

public class demo1 {
    public static double allmoney;
    public static void main(String[] args) {
        List<Employee> depart1= new ArrayList<>();
        depart1.add(new Employee("唐僧",'男',10000,5000,"null"));
        depart1.add(new Employee("孙悟空",'男',9000,4000,"顶撞组长唐僧"));
        depart1.add(new Employee("猪八戒",'男',8000,3000,"好吃懒作"));
        depart1.add(new Employee("沙悟净",'男',7000,3000,"null"));

        List<Employee> depart2= new ArrayList<>();
        depart1.add(new Employee("张三",'男',10000,5000,"null"));
        depart1.add(new Employee("李四",'男',10000,5000,"null"));
        depart1.add(new Employee("王五",'男',10000,5000,"null"));
        depart1.add(new Employee("周六",'男',10000,5000,"null"));
        depart1.add(new Employee("孙七",'男',10000,5000,"null"));

        //查询部门1最高工资，并封装为Goodemp对象
        Goodemp one =depart1
                .stream()//创建list集合数据类型对应的stream流
                .max((e1,e2) -> Double.compare(e1.getBonus()+e1.getSalery(),e2.getBonus()+e2.getSalery()))//利用max方法获取流里最大值对象
                .map(e -> (new Goodemp(e.getName(),e.getSalery()+e.getBonus())))
                .get();
                //利用get方法返回流对象，结束stream流操作
        //System.out.println(one);
        System.out.println("查询最高工资后，封装对象为："+one);
        //查询部门2最高工资
        Employee two = depart2
                .stream()
                .max((e1,e2) -> Double.compare(e1.getBonus()+e1.getSalery(),e2.getBonus()+e2.getSalery()))
                .get();
        System.out.println("部门2最高工资："+two);
        //统计部门1的平均工资，并去掉其中的最高与最低工资
        depart1.stream()
                .sorted((e1,e2) -> Double.compare(e1.getBonus()+e1.getSalery(),e2.getBonus()+e2.getSalery()))//完成排序
                .skip(1)//对已完成排序的stream流删除两端值，即先skip第一个
                .limit(depart1.size()-2)//删除两端值，用limit进行限制，缩小范围，变相删除最后一个
                .forEach(e ->{
                    allmoney += e.getBonus()+e.getSalery();
                });
        System.out.println("depart1部门的平均工资为："+allmoney/(depart1.size() - 2));
        depart1.stream()
                .sorted((e1,e2) -> Double.compare(e1.getBonus()+e1.getSalery(),e2.getBonus()+e2.getSalery())).getClass();

    }
}
