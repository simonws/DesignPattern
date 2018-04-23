package shopping_demo.com.designpattern.abstractFactoryMethod;

class ConcreteProductA extends Product {  
     
	public ConcreteProductA(){
		System.out.println("创建了A");
	}
    public void methodDiff() {  
    	System.out.println("A的工作");  
    }  
}