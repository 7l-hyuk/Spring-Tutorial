package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component
public class InlineExamConsole implements ExamConsole {
    
    @Autowired(required = false)
    @Qualifier("exam2")
    private Exam exam;

    public InlineExamConsole() {}

    public InlineExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        if (exam == null)
            System.out.println("Total: 0 | AVG: 0.0");
        else
            System.out.printf("Total: %d | AVG: %f%n", this.exam.total(), this.exam.avg());
    }

    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }

}
