package app.config;

import app.model.Animal;
import app.model.Timer;
import app.model.Dog;
import app.model.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name = "dog")
    public Animal getDog() {
        Animal animal = new Dog("Woofwooof");
        return animal;
    }

    @Bean(name = "cat")
    public Animal getCat() {
        Animal animal = new Cat("Murmurmur");
        return animal;
    }

    @Bean(name = "time")
    public Timer getTimer() {
        Timer timer = new Timer();
        return timer;
    }
}
