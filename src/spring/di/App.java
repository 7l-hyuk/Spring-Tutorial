package spring.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;
import spring.di.entity.Exam;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("spring/di/applicationContext.xml");
        
        ExamConsole console = context.getBean(ExamConsole.class);
        // ExamConsole console = (ExamConsole) context.getBean("examConsole");
        console.print();

        List<Exam> exams = (List<Exam>) context.getBean("exams");
        for (Exam e: exams)
            System.out.println(e);
    }
}
