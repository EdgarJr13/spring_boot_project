package io.github.edgarjr13;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class VendasConfiguration {

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("RODANDO A CONFIG DE DEV!!");
        };
    }

}
