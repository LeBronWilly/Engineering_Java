import java.util.Arrays;
import java.util.List;

public class arrays {

    public static void main(String[] args) {

        List features = Arrays.asList("Chinese", "English", "Math", "Science");
        for (Object feature : features) {
            System.out.println(feature);
        }
    }
}
