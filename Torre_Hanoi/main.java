package Torre_Hanoi;

import java.util.Scanner;

public class main {

    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        TorreHanoi  hanoi = new TorreHanoi();

        System.out.println( " INGRESE NUMERO DE DISCOS: ");

        int numeroDiscos= teclado.nextInt();

        hanoi.iniciar(numeroDiscos, 1, 2, 3);

        System.out.println( " Cantidad De Movimientos: " + hanoi.contadorMovimiento);
    }
}