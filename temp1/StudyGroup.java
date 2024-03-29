package temp1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private String nameGroup;

    public StudyGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    List<Student> listOfStudent = new ArrayList<Student>();

    public void setList(List listStudents) {
        this.listOfStudent = listStudents;
    }

    public List<Student> getList() {
        return listOfStudent;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(listOfStudent);
    }

    @Override
    public String toString() {
        return String.format("%s", nameGroup);
    }
}
