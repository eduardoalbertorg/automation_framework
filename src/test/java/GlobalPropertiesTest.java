import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalPropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("data.properties");
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("url"));
    }
}
