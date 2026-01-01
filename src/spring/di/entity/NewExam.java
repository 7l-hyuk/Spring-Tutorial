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

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }
}
