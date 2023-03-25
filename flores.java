import java.util.Scanner;

public class flores{

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int precio_A = 70;
        int precio_B = 120;
        int presupuesto;

        System.out.println("Escriba la cantidad de dinero disponible :");
        presupuesto = entrada.nextInt();



        System.out.println("Con esa cantidad de dinero se pueden comprar "+ presupuesto / precio_A +" ramos A y "+ presupuesto/ precio_B +" ramos B");
         


    }
}