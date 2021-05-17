package uaslp.objetos.exams;

public class Student {
    private String name;
    private int code;
    private int p1,p2,p3;
    private int score;
    private double avarage;

    public Student(String name, int code){
        this.name=name;
        this.code=code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int p, int score) {
        if(p==1) p1=score;
        if(p==2) p2=score;
        if(p==3) p3=score;
    }

    public double getAverage() {
        return (p1+p2+p3)/3;
    }
}
