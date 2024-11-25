package p5.e3;

import java.util.Arrays;

public class MySynchronizedStack {
    private int idx = 0;
    private Character[] data = new Character[MAX_SIZE];
    public static final int MAX_SIZE = 12;

    public int getIdx() {
        return idx;
    }

    public void push(Character c){
        synchronized (this) {
            if (idx < data.length) {
                data[idx] = c;
                idx++;
            }
        }
    }

    public Character pop(){
        Character value = null;
        synchronized (this) {
            if (idx > 0) {
                idx--;
                value = data[idx];
                data[idx] = null;
            }
        }
        return value;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
