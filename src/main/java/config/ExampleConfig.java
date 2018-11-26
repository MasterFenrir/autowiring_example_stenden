package config;

import beans.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Message.class)
public class ExampleConfig {

    @Bean
    public String messageString() {
        return "I was autowired differently!";
    }
}
