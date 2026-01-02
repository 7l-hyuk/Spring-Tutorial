package spring.aop.entity;


public class NewExam implements Exam {
    private int kor;
    private int eng;
    private int math;
    private int comp;

    public NewExam() {
        this(0, 0, 0, 0);
    }

    public NewExam(int kor, int eng, int math, int comp) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.comp = comp;
    }

    @Override
    public int total() {
        int result = this.kor + this.eng + this.math + this.comp;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public float avg() {
        float result = this.total() / 4.0f;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String toString() {
        return "NewExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", comp=" + comp + "]";
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
