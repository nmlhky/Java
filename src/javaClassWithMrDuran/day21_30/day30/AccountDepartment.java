package javaClassWithMrDuran.day21_30.day30;

public class AccountDepartment extends Department{
    private int yearOfExperince;

    public AccountDepartment(String employeeName, int employeeId, String position, int salary, int yearOfExperince) {
        super(employeeName, employeeId, position, salary);
        this.yearOfExperince = yearOfExperince;
    }

    public void setYearOfExperince(int yearOfExperince) {
        this.yearOfExperince = yearOfExperince;
    }
}
