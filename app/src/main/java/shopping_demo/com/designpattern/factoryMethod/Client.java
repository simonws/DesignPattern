package shopping_demo.com.designpattern.factoryMethod;

class Client {  
    public static void main(String args[]) {  
    	Factory factory;  
    	factory = new ConcreteFactory();   
    	Product product;  
    	product = factory.factoryMethod();  
    }  
}
