package pl.wiktor.testjsonresponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class TestJsonResponseApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJsonResponseApplication.class, args);
    }

}
