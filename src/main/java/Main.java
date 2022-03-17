
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
        * Öppna affären det första som händer
         */
        StoreHelper storeHelper = new StoreHelper();
        Shop shop = storeHelper.openShop();

        /**
         * Skriv ut vilka varor som finns och vilka som jobbar
         */
        System.out.println("Vi som jobbar här idag heter:");
        for (Employee p : shop.getEmployeeList()) {
            System.out.println(p.getName() + " och jag jobbar som: " + p.getProfession());
        }


        System.out.println("Idag har vi det här i affären:");
        System.out.println("----------------------------");

        for (Grocery g : shop.getInventory()) {
            System.out.println(g.getType().getLabel());
            System.out.println("Antal: " + g.getQuantity());
            System.out.println("-------------------------------");
        }

        /**
         * Scanner för att hämta in input.
         */
        System.out.println("Skriv in vad du skulle vilja handla:");
        Scanner scanner = new Scanner(System.in);
        String itemToShop = scanner.nextLine();

        boolean itemCanBePurchased = true;
        boolean needsToCheckAge = true;
        Grocery currentGrocery = new Grocery();

        /**
         * Bekräfta och kolla efter varan
         * Om det är åldergräns på den - fråga om ålder
         * Om det finns flera olika typer av varan; fråga vilken sort.
         */

        for (Grocery grocery : shop.getInventory()) {
            itemCanBePurchased = grocery.getType().getLabel().equalsIgnoreCase(itemToShop)
                    && grocery.getQuantity() > 0;
            currentGrocery = grocery;

            needsToCheckAge = grocery.getAgeLimit() != 100;
        }

        if (itemCanBePurchased && !needsToCheckAge) {
            int currentQuantity = currentGrocery.getQuantity();
            System.out.println("Varan finns, hur många vill du ha?");
            int howManyItems = scanner.nextInt();
            if (howManyItems <= currentQuantity) {
                currentGrocery.setQuantity(currentQuantity - howManyItems);
            }
            System.out.println("Nu finns det "
                    + currentGrocery.getQuantity()
                    + " "
                    + currentGrocery.getType().getLabel()
                    + " kvar.");
        } else  {
            System.out.println("Den här varan har åldersgräns, hur gammal är du?");
            int age = scanner.nextInt();
            if (age < currentGrocery.getAgeLimit()) {
                System.out.println("Aj aj aj, tyvärr så får du inte köpa den. Åldersgränsen liggger på "
                        + currentGrocery.getAgeLimit());
            } else {
                int currentQuantity = currentGrocery.getQuantity();
                System.out.println("Toppen, hur många vill du ha?");
                int howManyItems = scanner.nextInt();
                if (howManyItems <= currentQuantity) {
                    currentGrocery.setQuantity(currentQuantity - howManyItems);
                }
                System.out.println("Nu finns det "
                        + currentGrocery.getQuantity()
                        + " "
                        + currentGrocery.getType().getLabel()
                        + " kvar.");
            }
        }
    }
}
