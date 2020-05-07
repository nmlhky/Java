package javaClassWithMrDuran.day21_30.day26;

public class Employee {
    int id, salary;
    String name,department,contractType;

    public Employee(){
        this.id = 0;
        this.salary = 1000000;
        this.name = "No Name";
        this.department = "Unknow Department";
        this.contractType = "Unknow";
    }
    public Employee(int id, int salary,String name ,String department,String contractType){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.department =department;
        this.contractType = contractType;
    }

    public int weeklyPayment (){
        return this.salary / 52 ;
    }

    public int biWeekly (){
        return this.salary / 52 * 2;
    }
    void employeeInfo() {
        System.out.println("Your ID is " + id);
        System.out.println("Your name is " + name);
        System.out.println("Your Department is " + department);
        System.out.println("Your salary is " + salary);
        System.out.println("Your contract type is " + contractType);
    }

}
