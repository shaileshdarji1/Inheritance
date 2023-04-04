public class Employee {
    private int empId;
    private String ename;
    private float salary;

    Employee(int empId, String ename, float salary) {
        this.empId = empId;
        this.ename = ename;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Id:" + this.empId);
        System.out.println("Employee Name:" + this.ename);
        System.out.println("Employee Salary:" + this.salary);
    }

}
