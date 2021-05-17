package uaslp.objetos.exams;

import java.util.List;

public class Group {

    private List<Student> students;
    private int capacity;
    private double average;

    public Group(int capacity){
        this.capacity = capacity;
        students = new List<Student>();
    }

    private Object list[];
    public Group(Integer size) {this.list = new Object[size];
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean getAvailability() {
        if(capacity > size)
            return false;
        else
            return true;
    }



    public List<Student> getStudents() {

    }

    public void addStudent(Student lucia) {
        students.add(Student);
    }

    public double getAverage() {

    }
}
