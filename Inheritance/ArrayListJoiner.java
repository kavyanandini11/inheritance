import java.util.ArrayList;
import java.util.StringJoiner;

public class ArrayListJoiner{
    public static void main(String[] args){
        String a = "Ram";
        String b = "Ravi";
        String c = "Kiran";
        ArrayList<String> list = new ArrayList<String>();
        list.add(a);
        list.add(b);
        list.add(c);
    StringJoiner sj = new StringJoiner(",","{","}");
    list.forEach(name -> sj.add(name));
    System.out.println(sj.toString());
    }
}