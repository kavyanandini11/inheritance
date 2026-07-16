class Animal{
    void eat(){
        System.out.println("eating");
    }
    void sleep(){
        System.out.println("sleeping");
    }
}
    class Bird extends Animal{
        void eat(){
            System.out.println("eating seeds");
        }
        void sleep(){
            System.out.println("sleeping in nest");
        }
        void fly(){
            System.out.println("Flying in the sky");
        }
    }
    public class InheritanceTest{
        public static void main(String[] args){
            Bird b = new Bird();
            b.eat();
            b.sleep();
            b.fly();
        }
    }
    