package test0204;


class Employee{

    String name;
    int basePay;

    Employee(String name, int basePay){
        this.name = name;
        this.basePay = basePay;
    }

    public int getBasePay() {
        return basePay;
    }

    void printInfo(){
        System.out.println(name + "의 급여: "+getBasePay());
    }

} // Employee


class ContractEmployee extends Employee{
    int bonus = 0;

    ContractEmployee(String name,int basePay,int bonus){
        super(name,basePay);
        this.bonus = bonus;
    }

    @Override
    public int getBasePay(){
        return bonus + basePay;
    }

    @Override
    void printInfo(){
        System.out.println(name+ "의 계약직 급여: "+getBasePay());
    }


}




public class test02 {
    public static void main(String[] args) {

        Employee[] e1 = new Employee[2];

        e1[0] = new Employee("이순신",3100000);
        e1[1] = new ContractEmployee("홍길동",2000000,300000);

        e1[0].printInfo();
        e1[1].printInfo();

        System.out.println("전체 급여 합계 : "+(e1[0].getBasePay() + e1[1].getBasePay()));

    }
}
