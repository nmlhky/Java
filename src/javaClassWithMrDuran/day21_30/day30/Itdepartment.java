package javaClassWithMrDuran.day21_30.day30;

public class Itdepartment extends Department {
    String skillSet;

    public Itdepartment(String employeeName, int employeeId, String position, int salary, String skillSet) {
        super(employeeName, employeeId, position, salary);
        this.skillSet = skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    @Override
    public String toString() {
        return "Itdepartment{" +
                "skillSet='" + skillSet + '\'' +
                '}';
    }
}
