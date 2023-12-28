import java.util.ArrayList;

public class PayRollSystem {
    private ArrayList<Employee> employeeList;

    public PayRollSystem(){
        employeeList = new ArrayList<>();
    }

    void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    void removeEmployee(int id){
        Employee employeeToRemove = null;
        for (Employee emp : employeeList ){
            if(emp.getId() == id){
                employeeToRemove = emp;
                break;
            }
        }
        if (employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }

    void displayEmployees(){
        for (Employee emp : employeeList){
            System.out.println(emp);
        }
    }
}
