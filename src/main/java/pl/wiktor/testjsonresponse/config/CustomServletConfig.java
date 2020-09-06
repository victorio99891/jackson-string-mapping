package pl.wiktor.testjsonresponse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.wiktor.testjsonresponse.custom.servlet.CustomServlet;

import javax.servlet.Servlet;

@Configuration
public class CustomServletConfig {
    @Bean
    public Servlet test() {
        return new CustomServlet();
    }
}
