public class RepeatLastN{
    public static void main(String[] args){
        String str = "wipro";
        int n = 3;
        String Last = str.substring(str.length()-n);
        for(int i=0;i<str.length();i++){
            System.out.print(Last);
        }
    }
}