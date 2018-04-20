package shopping_demo.com.designpattern.AdapterClass;

public class Adapter extends Adaptee implements Target {

    @Override
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }

}
