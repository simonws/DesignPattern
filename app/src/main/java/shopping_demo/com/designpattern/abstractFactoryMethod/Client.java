package shopping_demo.com.designpattern.abstractFactoryMethod;

class Client {  
    public static void main(String args[]) {  
    	AbsFactory factory;
    	factory = new ConcreteFactoryA();
    	Product product;  
    	product = factory.factoryMethod();  
    }  
}
