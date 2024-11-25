package p5;

import java.util.Arrays;

public class MyStack {
    private int idx = 0; //Apunta a la seguent posicio lliure
    private Character[] data = new Character[MAX_SIZE];
    public static final int MAX_SIZE = 12;

    public int getIdx() {
        return idx;
    }

    public void push(Character c){
        if (idx < data.length){
            data[idx] = c;
            idx++;
        }
    }

    public Character pop(){
        Character value = null;
        if(idx > 0){
            idx --;
            value = data[idx];
            data[idx] = null;
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
