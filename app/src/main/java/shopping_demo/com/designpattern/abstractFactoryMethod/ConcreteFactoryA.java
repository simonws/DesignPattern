package shopping_demo.com.designpattern.abstractFactoryMethod;

class ConcreteFactoryA implements AbsFactory {
    public Product factoryMethod() {  
        return new ConcreteProductA();  
    }  
}
