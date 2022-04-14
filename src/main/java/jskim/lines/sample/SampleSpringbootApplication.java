package jskim.lines.sample;

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
        return "Hello World";
    }
}
