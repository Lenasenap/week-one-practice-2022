
import java.util.ArrayList;
import java.util.List;

public class StoreHelper {

    public Shop openShop() {
        return new Shop(populateGroceries(), populateEmployees());
    }

    private List<Grocery> populateGroceries() {
        Grocery snuff = new Snuff(38, 10);
        Grocery energyDrink = new EnergyDrink(20, 10);
        Grocery milk = new Milk(15, 20);
        return new ArrayList<>(List.of(snuff, energyDrink, milk));
    }

    private List<Employee> populateEmployees() {
        Employee cashier = new Employee(33, 9832479, "Lena", "Kassörska");
        Employee cleaner = new Employee(20, 893274, "Jyri", "Städare");
        return new ArrayList<>(List.of(cashier, cleaner));
    }
}
