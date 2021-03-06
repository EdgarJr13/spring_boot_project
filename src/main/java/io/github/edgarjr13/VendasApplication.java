package io.github.edgarjr13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan(
//        basePackages = {
//            "io.github.edgarj13.repository",
//            "io.github.edgarjr13.service"
//        }
//)
@RestController
public class VendasApplication {

    //utilizanto interpolação para chamar Strings do application.properties
    @Value("${application.name}")
    private String applicationName;

    private Animal animal;

    @Bean(name = "executarAnimal")
    public CommandLineRunner executar() {
        return args -> {
            this.animal.fazerBarulho();
        };
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
