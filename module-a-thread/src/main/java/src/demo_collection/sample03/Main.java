package src.demo_collection.sample03;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Main {
    public static void main(String[] args) {
        final List<Integer> list = new CopyOnWriteArrayList<Integer>();
        new WriterThread(list).start();
        new ReaderThread(list).start();
    }
}
