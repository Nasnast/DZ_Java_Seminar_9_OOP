package temp1;

import java.util.Comparator;

public class StreamComporator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        if (o1.getList().size() > o2.getList().size())
            return 1;
        if (o1.getList().size() < o2.getList().size())
            return -1;
        return 0;
        // return o1.getList().size() - o2.getList().size();

    }

}
