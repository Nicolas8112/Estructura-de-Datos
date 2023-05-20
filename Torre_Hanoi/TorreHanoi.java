package Torre_Hanoi;

public class TorreHanoi {
    public int contadorMovimiento=1;

    public void iniciar(int cantidadDiscos, int torreInicio, int torreTempo, int torreFinal){
        if (cantidadDiscos==1){
            System.out.println( " mueve el disco de la torre" + torreInicio + "a la torre " + torreFinal);
        } else {
            iniciar(cantidadDiscos -1, torreInicio, torreFinal, torreTempo);
            System.out.println( " mueve el disco de la torre" + torreInicio + "a la torre " + torreFinal);
            iniciar(cantidadDiscos -1, torreTempo, torreInicio, torreFinal);
            contadorMovimiento++;

        }
    }
}