package p4.ex2;

public class Main {
    private static String obj = "Objecte";
    public static void main(String[] args) {
        parametre(obj);

        global();
    }

    private static void parametre(Object obj) {
        System.out.println("Obtingut per paràmetre " + obj);
    }
    private static void global() {
        System.out.println("Obtingut per variable de classe " + obj);
    }
}
