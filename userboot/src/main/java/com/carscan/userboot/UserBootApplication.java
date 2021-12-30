package com.carscan.userboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication: this annotation used to enable 3 features
/*
   @EnableAutoConfiguration: Automatically configures our application based on its included jar files.
   @ComponentScan: with the help of this we can tell spring in which package our spring managed components lie (@Repository,@Service,@Controller)
   @Configuration: requires when we don't pass the annotated class explicitly,but specified in @ComponentScan
*/
@SpringBootApplication
public class UserBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserBootApplication.class, args);
    }

}
