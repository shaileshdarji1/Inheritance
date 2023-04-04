public class JavaDeveloper extends Developer {
    private String javaFramework;
    private final static float OVERTIMEPRICE = 150;

    JavaDeveloper(int empId, String ename, float salary, String role, int overTimeHour, String javaFramework) {
        super(empId, ename, salary, role, overTimeHour);
        this.javaFramework = javaFramework;
    }

    public void display() {
        super.display();
        System.out.println("Java Framework:" + this.javaFramework);
    }

    @Override
    public void overTime() {
        System.out.println("Over Time Salary:" + overTimeHour * OVERTIMEPRICE);

    }
}
