
public class Main {
    public static void main(String[] args) {
        System.out.println("Java Employee Payroll System Project");
        PayRollSystem payRollSystem = new PayRollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee(143, "Riya Sharma", 45000);
        FullTimeEmployee emp2 = new FullTimeEmployee(125, "Roohi Gupta", 64000);
        FullTimeEmployee emp3 = new FullTimeEmployee(321, "OP Mallik", 78000);
        PartTimeEmployee emp4 = new PartTimeEmployee(654, "Rahot Sharma", 8,200);
        PartTimeEmployee emp5 = new PartTimeEmployee(786, "Virat Kohli", 6,300);

        System.out.println("Initial Employees Details : ");
        payRollSystem.addEmployee(emp1);
        payRollSystem.addEmployee(emp2);
        payRollSystem.addEmployee(emp3);
        payRollSystem.addEmployee(emp4);
        payRollSystem.addEmployee(emp5);
        payRollSystem.displayEmployees();

        payRollSystem.removeEmployee(125);
        payRollSystem.removeEmployee(786);

        System.out.println("Final Employees Details : ");
        payRollSystem.displayEmployees();
    }
}