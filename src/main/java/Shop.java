import java.util.List;

public class Shop {
    private List<Grocery> inventory;
    private List<Employee> employeeList;
    private List<Person> customerList;


    public Shop(List<Grocery> inventory, List<Employee> employeeList) {
        this.inventory = inventory;
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Grocery> getInventory() {
        return inventory;
    }

    public void setInventory(List<Grocery> inventory) {
        this.inventory = inventory;
    }
}
