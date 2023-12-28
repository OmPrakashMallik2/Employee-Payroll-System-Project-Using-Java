public class PartTimeEmployee extends Employee{

    private int hoursWork;
    private double hourRate;

    public PartTimeEmployee(int id, String name, int hoursWork, double hourRate) {
        super(id, name);
        this.hoursWork = hoursWork;
        this.hourRate = hourRate;
    }

    @Override
    double calculateSalary() {
        return hourRate * hoursWork;
    }
}
