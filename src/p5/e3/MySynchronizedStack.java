package p5.e3;

public class MySynchronizedStack {
    private int idx = 0; //Apunta a la seguent posicio lliure
    private Character[] data = new Character[MAX_SIZE];
    public static final int MAX_SIZE = 12;

    public void push(Character c){
        synchronized (this) {
            if (idx < data.length) {
                data[idx] = c;
                idx++;
            }
        }
    }

    public Character pop(){
        synchronized (this) {
            Character value = null;
            if (idx > 0) {
                idx--;
                value = data[idx];
                data[idx] = null;
            }
            return value;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Character c : data) {
            sb.append(c + " | ");
        }
        return sb.toString();
    }
}
