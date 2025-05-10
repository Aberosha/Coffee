import java.util.Random;
import java.util.List;

public class Customer {
    private String name;
    private String order;

    public Customer(String name, List <String> coffeeTypes){
        this.name=name;
        Random rand = new Random();
        this.order = coffeeTypes.get(rand.nextInt(coffeeTypes.size()));
    }

    public boolean wants(Coffee coffee) {
        return
                order.equals(coffee.getClass());
    }
    public String
    getOrder() {
        return order;
    }

    public String getType(){
        return getType();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
