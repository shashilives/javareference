package spring;

import designpatterns.builder.Employee;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController("/")
@Log4j2
public class AnotherSpringBootApp {

    @Autowired
    Employee employee;

    static ApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(AnotherSpringBootApp.class, args);
        ProfileInjection profileInjection = ctx.getBean(ProfileInjection.class);
        log.info(profileInjection.getTest());
        log.info("inside resetarted");
    }

    @GetMapping("/")
    public String someGEt() {
        return "HI";
    }

    @GetMapping("/shutdown")
    @ResponseStatus(HttpStatus.OK)
    public void shutdown() {
        SpringApplication.exit(ctx);
    }

    @GetMapping("/another")
    public String anotherGet() {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            //employeeList.add(new Employee(1l,"shashi"));
        }

        return "Another Get";
    }


}
