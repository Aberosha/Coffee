import java.util.*;

public class CoffeeShop {
    private List<Coffee> menu = new ArrayList<>();
    private double balance = 0.0;

    public void addToMenu(Coffee coffee) {
        menu.add(coffee);
    }

    public void serveCustomer(Customer customer) {
        for (Coffee coffee : menu) {
            if (customer.wants(coffee)) {
                balance += coffee.getPrice();
                System.out.println("Sold: " + coffee.getType() + " to  " + customer.getName());
                return;
            }
        }
        System.out.println("Клиент " + customer.getName() + " не нашёл любимый кофе: " + customer.getOrder());
    }

    public double getBalance() {
        return balance;
    }

    public void showMenu() {
        for (Coffee coffee : menu) {
            System.out.println(coffee.getType() + " - $" + coffee.getPrice());
        }
    }
}