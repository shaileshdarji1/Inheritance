public class Developer extends Employee {
    private String role;
    int overTimeHour;
    private final static float OVERTIMEPRICE = 100;

    Developer(int empId, String ename, float salary, String role, int overTimeHour) {
        super(empId, ename, salary);
        this.role = role;
        this.overTimeHour = overTimeHour;
    }

    public void display() {
        super.display();
        System.out.println("Role:" + this.role);
        System.out.println("Over Work Hour:" + this.overTimeHour);
    }

    public void overTime() {
        System.out.println("Over Time Salary:" + overTimeHour * OVERTIMEPRICE);
    }

}
