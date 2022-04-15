package jskim.lines.sample;

import jskim.lines.sample.controller.Week;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SampleSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleSpringbootApplication.class, args);
    }

}

@RestController
class SampleController {

    @GetMapping("/helloworld")
    public String helloworld() {
        Week we = Week.MONDAY;
        String str = Week.MONDAY.toString();
        System.out.println("str = " + str); //MONDAY
        System.out.println("we = " + we); //MONDAY ENUM왜쓰는거지...??
        return "Hello World";
    }

    @GetMapping("/lotto")
    public String lotto(){
        return "lotto되느냐";
    }

}
