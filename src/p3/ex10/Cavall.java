package p3.ex10;

public class Cavall implements Runnable {
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumPassosCarrera() {
        return numPassosCarrera;
    }

    public void setNumPassosCarrera(int numPassosCarrera) {
        this.numPassosCarrera = numPassosCarrera;
    }

    public Cavall(String nom, int numPassosCarrera) {
        this.nom = nom;
        this.numPassosCarrera = numPassosCarrera;
    }

    private int numPassosCarrera;
    @Override
    public void run() {
        int numPassos = 0;
        while (numPassos < numPassosCarrera) {
            numPassos += (int) (Math.random() * 3) + 1;
            StringBuilder passos = new StringBuilder();
            for (int i = 0; i < numPassos; i++) {
                passos.append('-');
            }
            System.out.println(nom + ": " + passos);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(nom + ": Ha arribat a la meta!!");
        System.exit(0);
    }
}
