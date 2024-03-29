package temp1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    List<Student> listOfStudent = new ArrayList<Student>();

    public StudentGroupIterator(List<Student> listStudents) {
        this.listOfStudent = listStudents;
    }

    int index;

    @Override
    public boolean hasNext() {
        return index < listOfStudent.size();
    }

    @Override
    public Student next() {
        return listOfStudent.get(index++);
    }
}
