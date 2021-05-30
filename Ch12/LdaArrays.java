import java.util.Arrays;
import java.util.List;

public class LdaArrays {

    public static void main(String[] args) {

        List features = Arrays.asList("Chinese", "English", "Math", "Science");
        features.forEach(n -> System.out.println(n));

    }
}
