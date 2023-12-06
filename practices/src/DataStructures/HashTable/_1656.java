package DataStructures.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1656 {
    static class OrderedStream {
        private int capacity;
        private int currentPointer;
        private Map<Integer, String> map;

        public OrderedStream(int n) {
            this.capacity = n;
            this.currentPointer = 0;
            this.map = new HashMap<>();
        }

        public List<String> insert(int idKey, String value) {
            map.put(idKey, value);
            List<String> arrays = new ArrayList<>();
            return null;
        }
    }

    public static void main(String[] args) {

    }
}
