package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class App {
    public static void main(String[] args) {
        Exam exam = new NewExam();
        // ExamConsole examConsole = new InlineExamConsole(exam);
        ExamConsole examConsole = new GridExamConsole(exam);
        examConsole.print();
    }
}
