package shopping_demo.com.designpattern.stragry;

public class TaxiStrategy implements AbstractStrategy {
    @Override
    public int calculatePrice(int km) {
        return km * 2;
    }
}
