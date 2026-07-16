import java.util.*;
public class MergeJoiner{
    public static void main(String[] args){
        StringJoiner sj1 = new StringJoiner("-");
        sj1.add("Hyd");
        sj1.add("Chennai");
        StringJoiner sj2 = new StringJoiner("-");
        sj1.add("Delhi");
        sj1.add("Mumbai");
        for(int i = 0;i<2;i++){
            sj1.merge(sj2);
        }
        for(int i = 0; i<2;i++){
            sj2.merge(sj1);
        }
        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(sj2);
        merge1.merge(sj1);
        StringJoiner merge2 = new StringJoiner("-");
        merge1.merge(sj1);
        merge1.merge(sj2);
        System.out.println(merge1);
        System.out.println(merge2);
    }
}