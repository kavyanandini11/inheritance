import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {

        String address = "Hyd";

        String result = Optional.ofNullable(address).orElse("India");

        System.out.println(result);
    }
}