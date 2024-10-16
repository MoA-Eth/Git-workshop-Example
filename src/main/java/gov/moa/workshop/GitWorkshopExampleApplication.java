package gov.moa.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitWorkshopExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitWorkshopExampleApplication.class, args);
    }

    private void HelloAlive () {
        System.out.println("Hello World!");
    }

    public static void methodTwo(){
       System.out.println("Hello");

    }


}
