public class Orange extends Fruit{
    Orange(){
        super("Orange","Sour",6);
    }
    void eat(){
        System.out.println("Eating " +name +"and it tastes "+taste);
    }
}