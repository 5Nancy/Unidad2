package uPCASTING;

public class Principal {
    public static void main(String[]args){
        Padre p=new Hijo();
        p.name="Juan";
        System.out.println(p.name);
       // Hijo h=new Padre();
        Hijo H=(Hijo) p;
        H.id=1;
        System.out.println(H.name);
        System.out.println(H.id);
        H.metodopadre();
    }
}
