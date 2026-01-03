package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;


public class Program {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/applicationContext.xml");
        Exam exam = (Exam) context.getBean("exam");

        System.out.printf("total is %d%n", exam.total());
        System.out.printf("avg is %f%n", exam.avg());
    }
}
