package temp1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private int streamNamber;
    private List<StudyGroup> groupList;

    public int getStreamNamber() {
        return streamNamber;
    }

    public void setStreamNumber(int streamNamber) {
        this.streamNamber = streamNamber;
    }

    public Stream(int streamNamber, List<StudyGroup> groupList) {
        this.streamNamber = streamNamber;
        this.groupList = new ArrayList<StudyGroup>();
    }

    public void setList(List<StudyGroup> groupList) {
        this.groupList = groupList;
    }

    public List<StudyGroup> getList() {
        return groupList;
    }

    public void addStudyGroup(StudyGroup group) {
        groupList.add(group);

    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new StreamIterator(groupList);
    }

    @Override
    public String toString() {
        return "Поток № " + streamNamber + ":" + groupList;
    }
}