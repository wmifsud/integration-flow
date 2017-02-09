package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * @author waylon on 31/01/2017.
 */
@SpringBootApplication
@ImportResource("hello/integration.xml")
public class Application
{

    public static void main(String[] args) throws Exception
    {
        ConfigurableApplicationContext ctx = new SpringApplication(Application.class).run(args);
        System.out.println("Hit Enter to terminate");
        int read = System.in.read();
        System.out.println(read);
        ctx.close();
    }
}