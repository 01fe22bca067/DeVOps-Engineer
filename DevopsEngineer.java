public class DevopsEngineer extends Employee {
    private double bonus;

    public DevopsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: $" + bonus);
        double totalSalary = salary + bonus;
        System.out.println("Total Salary: $" + totalSalary);
    }
}