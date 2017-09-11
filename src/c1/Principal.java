package c1;

public class Principal {

    public static void main(String[] args) {
Operaciones k =new Kb_Mb();
        System.out.println("son " +k.multiplicacion(2)+" Kb");
        System.out.println("son " +k.division(1024)+" Mb");
Operaciones m =new Mb_Gb();
        System.out.println("son " +m.multiplicacion(1)+" Mb");
        System.out.println("son " +m.division(2048)+" Gb");
Operaciones g=new Gb_Tb();
        System.out.println("son " +g.multiplicacion(8)+" Gb");
        System.out.println("son " +g.division(545)+" Tb");

    }
}
