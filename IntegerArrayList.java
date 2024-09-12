public class IntegerArrayList extends IntegerList{
    private Integer[] data;
    private int size;

    public IntegerArrayList() {

    }

    public void add(Integer val) {
        if(size >= data.length) {
            Integer[] biggerArray = new Integer[data.length];
            for(int i = 0; i<data.length;i++) {
                biggerArray[i] = data[i];
            }
            data = biggerArray;
        }
        data[size] = val;
        size++;
    }

    public void add(int index, Integer val) {
        
    }

    public void clear() {
    }

    public Integer remove(int index) {
        throw new UnsupportedOperationException();
    }

    public Integer get(int index) {
        if (index<0 || index >=size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }

    public int size() {
        throw new UnsupportedOperationException();
    }

    public int indexOf(Integer val) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(List<Integer> other) {
        throw new UnsupportedOperationException();
    }

    publc String toString() {
        String result = "[";
        for(int i =0; i<size-1;i++) {
            result += data[i] + ",";
        }
    }
}