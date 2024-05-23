package list;

import java.util.LinkedList;

public class GBLinkedList<T> {


    private Node<T> current;
    private int size = 0;

    public GBLinkedList(Node<T> current) {
        this.current = null;
        current.setPrevious(null);
        current.setNext(null);
        current.setValue(null);
    }

    public void addLast(T elem) {

    }


//
//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder("[");
//        for (int i = 0; i < size; i++) {
//            builder.append(values[i]).append(", ");
//        }
//        if (builder.length() == 1) return "[]";
//        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
//        builder.append("]");
//        return builder.toString();
//    }
}
