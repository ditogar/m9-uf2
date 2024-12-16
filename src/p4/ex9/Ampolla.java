package p4.ex9;

public class Ampolla {
    public final static int CAPACITAT = 1000;
    private int centilitres;

    public int getCentilitres() {
        return centilitres;
    }

    public void setCentilitres(int centilitres) {
        this.centilitres = centilitres;
    }

    public Ampolla() {
        this.centilitres = CAPACITAT;
    }

    public int servir(int treure) {
        int omplir = 0;

        if (treure > centilitres) {
            omplir = centilitres;
        } else omplir = treure;

        centilitres -= omplir;
        System.out.println("Capacitat de l'ampolla = " + centilitres);
        return omplir;
    }
}
