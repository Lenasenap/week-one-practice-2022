import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreHelperTest {
    static StoreHelper unitUnderTest;

    @BeforeAll
    static void setUp() {
        unitUnderTest = new StoreHelper();
    }

    @Test
    void openShop_VerifyThatShopIsPopulated() {
        // Test
        Shop shop = unitUnderTest.openShop();

        // Verify
        List<Grocery> inventory = shop.getInventory();
        assertFalse(inventory.isEmpty());
        assertEquals(3, inventory.size());

        List<Employee> employees = shop.getEmployeeList();
        assertFalse(employees.isEmpty());
        assertEquals(2, employees.size());

    }
}