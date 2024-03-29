package temp1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudyGroup> {
    List<StudyGroup> listOfStudyGroups = new ArrayList<StudyGroup>();

    public StreamIterator(List<StudyGroup> listGroups) {
        this.listOfStudyGroups = listGroups;
    }

    int index;

    @Override
    public boolean hasNext() {
        return index < listOfStudyGroups.size();
    }

    @Override
    public StudyGroup next() {
        if (hasNext()) {
            return listOfStudyGroups.get(index++);
        } else
            return null;
    }
}