package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;
import spring.di.entity.Exam;
import spring.di.entity.NewExam;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("spring/di/setting.xml");
        
        ExamConsole console = context.getBean(ExamConsole.class);
        // ExamConsole console = (ExamConsole) context.getBean("examConsole");
        console.print();

        List<Exam> exams = new ArrayList<>();
        exams.add(new NewExam(1, 1, 1, 1));

        for (Exam e: exams)
            System.out.println(e);
    }
}
