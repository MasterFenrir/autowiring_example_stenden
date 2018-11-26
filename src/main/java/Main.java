import beans.Message;
import config.ExampleConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String args[]) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ExampleConfig.class);
        Message messageObject = annotationConfigApplicationContext.getBean(Message.class);
        System.out.println(messageObject.getMessage());
    }

}
