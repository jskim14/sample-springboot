package jskim.lines.sample;

import jskim.lines.sample.controller.Week;
import jskim.lines.sample.model.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class SampleSpringbootApplication {

    public static void main(String[] args) {

        String profiles = System.getenv("profiles");

        new SpringApplicationBuilder()
                .profiles(profiles)
                .parent(SampleSpringbootApplication.class)
                .web(WebApplicationType.SERVLET)
                .build()
                .run(args);

//        SpringApplication.run(SampleSpringbootApplication.class, args);
    }

}

