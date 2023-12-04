package Algorithm.LineSweep;

//Design a collection that support those operators:
//        add To range(x y, val) n lan -> increase all the elements in the range [x, y] value `val`.
//        getIndex(i) → return value at index i

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExtraPractice00 {
    static class Collection {
        private int[] array;
        private int index;
        private int[] sweepLineAdd;
        private int[] sweepLineMultiply;


        public Collection(int capacity) {
            this.index = -1;
            this.array = new int[capacity];
            this.sweepLineAdd = new int[capacity];
            this.sweepLineMultiply = new int[capacity];

            Arrays.fill(this.sweepLineAdd, 0, capacity, 0);
            Arrays.fill(this.sweepLineMultiply, 0, capacity, 1);
        }

        public int getIndex(int i) {
            return this.array[i];
        }

        public Collection push(int val) {
            this.array[++index] = val;
            return this;
        }

        public void addToRange(int x, int y, int val) {
            sweepLineAdd[x] += val;
            sweepLineAdd[y+1] -= val;
        }

        public void multiplyToRange(int x, int y, int val) {
            sweepLineMultiply[x] *= val;
            sweepLineMultiply[y+1] /= val;
        }

        public void print() {
            for(int i = 0, ps = 0; i <= index; i++) {
                ps += sweepLineAdd[i];
                System.out.print(array[i] + ps);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Collection collection = new Collection(100);
        collection.push(4).push(7).push(1).push(5).push(2); //4   7   1   5   2

        collection.addToRange(1,3, 2); //4  9   3   7   2
        collection.addToRange(0,2, 1); //5  10  4   7   2

//        collection.print();
        System.out.println(collection.getIndex(1));
    }
}
