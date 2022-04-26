package behavioral.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * <h1>String列表</h1>
 *
 * @author wangjunhao
 **/
public class StringList implements Iterable<String>{
    private final List<String> data;

    public StringList(List<String> data) {
        this.data = data;
    }

    @Override
    public Iterator<String> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<String>{
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.size();
        }

        @Override
        public String next() {
            return data.get(index++);
        }

        @Override
        public String toString() {
            return "Itr{" +
                    "index=" + index +
                    '}';
        }
    }
}
