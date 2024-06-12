package DataStructures.Arrays;

//https://leetcode.com/problems/design-hashset/description/

import java.util.ArrayList;
import java.util.List;

class MyHashSet {
    List<Integer> arr;
    public MyHashSet() {
        arr = new ArrayList<>();
    }

    public void add(int key) {
        if(null != arr.get(key)) return;
        arr.add(key);
    }

    public void remove(int key) {
        if(null == arr.get(key)) return;
        arr.remove(key);
    }

    public boolean contains(int key) {
        return false;
    }
}

public class _705 {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // return False, (already removed)
    }
}
