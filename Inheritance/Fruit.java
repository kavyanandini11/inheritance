public class Fruit {
    String name;
    String taste;
    int size;
    public Fruit(String name, String taste, int size){
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
    void eat(){
        System.out.println("Eating"+name +"and it tastes"+taste);
    }
}