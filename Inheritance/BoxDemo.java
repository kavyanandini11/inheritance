class Box{
    int width, height, depth;
    Box(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }
    int getVolume(){
        return width * height * depth;
    }
}
public class BoxDemo {
    public static void main(String[] args){
        Box b = new Box(10,5,6);
        System.out.println("width: " +b.width);
        System.out.println("height: " +b.height);
        System.out.println("depth: " +b.depth);
        System.out.println("Volume: " +b.getVolume());
    }
}