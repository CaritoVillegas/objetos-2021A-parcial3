package uaslp.objetos.exams;

import java.util.List;

public class Group {

    private int size;
    private int capacity;
    private boolean Availability;

    public Group(int capacity){
        this.capacity = capacity;
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

    public double getAverage() {
        return;
    }


    public List<Student> getStudents() {

    }

    public void addStudent(Student lucia) {

    }
}
