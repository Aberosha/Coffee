
import java.util.*;

public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        Espresso e1 = new Espresso("Espresso", 1.5) {
            @Override
            public double getPrice() {
                return 0;
            }

            Cappucino c1 = new Cappucino("Cappucino", 2.5){
                @Override
                public double getPrice() {
                    return 0;
                }

                Latte l1 = new Latte("Latte", 3.5){
                    @Override
                    public double getPrice() {
                        return 0;
                }
        };



        //shop.addToMenu(e1);
        //shop.addToMenu(c1);
        //shop.addToMenu(l1);

        List<String> coffeeTypes = Arrays.asList("Espresso", "Cappuccino", "Latte");

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            Customer customer = new Customer("Client" + (i+1), coffeeTypes);
            System.out.println("Customer orders: " + customer.getOrder());
            shop.serveCustomer(customer);

        }

        System.out.println("You earn: $" + shop.getBalance());
    }
}