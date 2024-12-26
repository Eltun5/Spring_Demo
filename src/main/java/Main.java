import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Properties;
import com.Spring_demo.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Properties properties = (Properties) context.getBean("yamlProperties");

        String message = properties.getProperty("custom.message");

        System.out.println("Message: " + message);
    }
}
