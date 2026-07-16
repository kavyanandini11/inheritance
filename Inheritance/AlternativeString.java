public class AlternativeString{
    public static void main(String[] args){
        String str1 = "kavya";
        String str2 = "reddy";
        String result = "";
        int min = Math.min(str1.length(), str2.length());
        for(int i = 0; i<min; i++){
            result = result + str1.charAt(i) + str2.charAt(i);
        }
        if(str1.length() > str2.length()){
            result = result + str1.substring(min);
        } else {
            result = result + str2.substring(min);
        }
        System.out.println(result);
    }
}