package shopping_demo.com.designpattern.factoryMethod;

class ConcreteFactory implements Factory {  
    public Product factoryMethod() {  
        return new ConcreteProductA();  
    }  
}
