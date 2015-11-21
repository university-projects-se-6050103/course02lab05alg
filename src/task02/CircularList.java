package task02;

import java.util.ArrayList;

public class CircularList<E> extends ArrayList<E> {
    private static final long serialVersionUID = 1L;

    @Override
    public E get(int index) {
        index = getIndex(index);
        return super.get(index);
    }

    @Override
    public E remove(int index) {
        index = getIndex(index);
        return super.remove(index);
    }

    private int getIndex(int index) {
        if (index == -1) {
            index = size() - 1;
        } else if (index == size()) {
            index = 0;
        } else if (index > size()) {
            index = index % size();
        }
        return index;
    }
}