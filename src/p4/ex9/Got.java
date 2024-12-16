package p4.ex9;

public class Got {
    private Ampolla ampolla;
    private final int CAPACITAT = 200;
    private int centilitres;

    public int getCentilitres() {
        return centilitres;
    }

    public void setCentilitres(int centilitres) {
        this.centilitres = centilitres;
    }

    public Got(Ampolla ampolla) {
        this.ampolla = ampolla;
        this.centilitres = CAPACITAT;
    }
    public void omplir() {
        int resta = CAPACITAT - centilitres;

        int omplir = ampolla.servir(resta);
        centilitres += omplir;
    }
}
