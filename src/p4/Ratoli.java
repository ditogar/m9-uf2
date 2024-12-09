package p4;

public class Ratoli implements Runnable{
    String nom;

    public Ratoli(String nom) {
        this.nom = nom;
    }

    //Contructors, getters i setters...


    public String getNom() {
        return nom;
    }

    public void menja(){
        System.out.println("El ratolí " + nom + " ha començat a menjar");
        System.out.println("El ratolí " + nom + " està menjant");
        System.out.println("El ratolí " + nom + " ha acabat de menjar");
    }

    @Override
    public void run() {
        this.menja();
    }
}
