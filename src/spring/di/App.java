package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("spring/di/setting.xml");
        
        ExamConsole console = context.getBean(ExamConsole.class);
        // ExamConsole console = (ExamConsole) context.getBean("examConsole");
        console.print();
    }
}
