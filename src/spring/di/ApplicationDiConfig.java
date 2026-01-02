package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewExam;


@ComponentScan("spring.di.ui")
@Configuration
public class ApplicationDiConfig {
    @Bean
    public Exam exam2() {
        return new NewExam();
    }
}
