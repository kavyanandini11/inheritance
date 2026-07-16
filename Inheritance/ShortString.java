 public class ShortString{
    public static void main(String[] args){
        String str1 = "hello";
        String str2 =  "hi";
        if(str1.length() < str2.length()){
            System.out.println(str1+str2+str1);
        } else {
            System.out.println(str2+str1+str2);
        }
    }
 }