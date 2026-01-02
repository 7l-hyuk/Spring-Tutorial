package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
    private Exam exam;

    public InlineExamConsole() {}

    @Autowired
    public InlineExamConsole(@Qualifier("exam2") Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.printf("Total: %d | AVG: %f%n", this.exam.total(), this.exam.avg());
    }

    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }

}
