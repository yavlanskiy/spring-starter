import com.dmdev.spring.database.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("application.xml")) {
            //var bean = context.getBean(ConnectionPool.class);
            var bean = context.getBean("connectionPool_1",ConnectionPool.class);
            bean.example();
        }


    }
}
