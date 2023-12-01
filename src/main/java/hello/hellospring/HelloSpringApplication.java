package hello.hellospring;


import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableBatchProcessing
public class HelloSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
//        ApplicationContext ac =
//                String[] allBeansName = ac.getBeanDefinitionNames();
//        for (String beanName : allBeansName) {
//            System.out.println(beanName);
//        }
    }
}
