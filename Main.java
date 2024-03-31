public class Main {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee("John Doe", 1234, 60000.0);
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();
        
        // Create an instance of DevOpsEngineer
        DevopsEngineer devOpsEngineer = new DevopsEngineer("Jane Smith", 5678, 70000.0, 5000.0);
        System.out.println("\nDevOps Engineer Details:");
        devOpsEngineer.displayEmployeeDetails();
    }
}
