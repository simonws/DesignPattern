package shopping_demo.com.designpattern.abstractFactoryMethod;

/**
 * Created by ws on 18-4-23.
 */

public class ConcreteFactoryB implements AbsFactory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
