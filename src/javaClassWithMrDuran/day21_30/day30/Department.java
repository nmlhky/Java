package javaClassWithMrDuran.day21_30.day30;

public class Department {
    protected String employeeName;
    protected int employeeId;
    protected String position;
    protected int salary;

    public Department(String employeeName, int employeeId, String position, int salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
    }


    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}