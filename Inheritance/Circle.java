public class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}