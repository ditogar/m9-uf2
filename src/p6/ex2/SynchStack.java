package p6.ex2;

import java.util.Vector;

public class SynchStack {
    private Vector buffer = new Vector(400, 200);

    public synchronized void push (char c){
        this.notify();
        this.buffer.add(c);
    }


    public synchronized char pop(){
        char c;
        while (buffer.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        c = (char) buffer.remove(buffer.size()-1);
        return c;
    }

}

