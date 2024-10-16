package gov.moa.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitWorkshopExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitWorkshopExampleApplication.class, args);
    }
    private void helloMOA () {
    System.out.println("Hello MOA");
}
  private void SecurityChech () {
    System.out.println("SecurityChech");
}
}
