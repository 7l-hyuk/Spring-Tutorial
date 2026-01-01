package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
    private Exam exam;

    public GridExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.println("_______________________");
        System.out.printf("|TOTAL: %d|AVG: %f|%n",
            this.exam.total(),
            this.exam.avg()
        );
        System.out.println("_______________________");
    }
}
