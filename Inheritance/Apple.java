public class Apple extends Fruit{
    Apple(){
        super("Apple","Sweet", 8);
    }
    void eat(){
        System.out.println("Eating " +name +"and it tastes " +taste);
    }
}