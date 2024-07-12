package org.example.spring6di.bootstrap;

import lombok.RequiredArgsConstructor;
import org.example.spring6di.entities.Beer;
import org.example.spring6di.repositories.BeerRepository;
import org.example.spring6di.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BootStrapData implements CommandLineRunner {

    private final BeerRepository beerRepository;
    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("hello world");

        beerRepository.saveAll(List.of(Beer.builder().build(), Beer.builder().build(), Beer.builder().build()));

    }
}
