package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
    private Exam exam;

    public InlineExamConsole() {}

    public InlineExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.printf("Total: %d | AVG: %f", this.exam.total(), this.exam.avg());
    }

    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }

}
