package com.dodo;

import com.dodo.entity.Employee;
import com.dodo.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.swing.plaf.PanelUI;
import java.time.LocalDate;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class Application {
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void appStart() {
        if (employeeRepository.count().block() == 100) {
        IntStream.range(0, 100)
                .mapToObj(this::generate).filter(Objects::nonNull)
                .map(employeeRepository::save)
                .collect(Collectors.toList())
                .forEach(item ->item.subscribe(System.out::println));
    }
    }

    private Employee generate(int i) {
        return Employee.builder()
                .name("Name"+ i)
                .lastname("Lastname"+i)
                .birthday(LocalDate.now())
                .build();
    }
}
