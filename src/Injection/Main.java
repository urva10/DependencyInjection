package Injection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the UserService bean from the context
        UserService userService = context.getBean(UserService.class);

        // Use the UserService
        // ...
    }
}
