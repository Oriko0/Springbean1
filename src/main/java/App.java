import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld dub =
                applicationContext.getBean("helloWorld", HelloWorld.class);
        HelloWorld elka =
                applicationContext.getBean("helloWorld", HelloWorld.class);
        Cat barsik =
                applicationContext.getBean("cat", Cat.class);
        Cat vasya =
                applicationContext.getBean("cat", Cat.class);
        System.out.println(dub == elka);

        System.out.println(barsik == vasya);
    }
}