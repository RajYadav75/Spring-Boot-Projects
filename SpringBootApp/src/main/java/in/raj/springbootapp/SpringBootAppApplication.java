package in.raj.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run =
                SpringApplication.run(SpringBootAppApplication.class, args);
//        System.out.println(run.getClass().getName());/*This is for check class name */
    }

    @GetMapping("/")
    public String welcome(){
        return "Welcome to Raj's Computer.";
    }
}