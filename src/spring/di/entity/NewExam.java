package spring.di.entity;

public class NewExam implements Exam {
    private int kor;
    private int eng;
    private int math;
    private int comp;

    @Override
    public int total() {
        return this.kor + this.eng + this.math + this.comp;
    }

    @Override
    public float avg() {
        return this.total() / 4.0f;
    }
    
}
