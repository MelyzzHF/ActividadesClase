package TorreHaroi;

public class TorreDeHanoi {

    public static void hanoi(int n, Torre origen, Torre auxiliar, Torre destino,
            char nombreOrigen, char nombreAuxiliar, char nombreDestino) {
        if (n == 1) {
            moverDisco(origen, destino, 1, nombreOrigen, nombreDestino);
            return;
        }
        hanoi(n - 1, origen, destino, auxiliar, nombreOrigen, nombreDestino, nombreAuxiliar);
        moverDisco(origen, destino, n, nombreOrigen, nombreDestino);
        hanoi(n - 1, auxiliar, origen, destino, nombreAuxiliar, nombreOrigen, nombreDestino);
    }

    private static void moverDisco(Torre origen, Torre destino, int disco,
            char nombreOrigen, char nombreDestino) {
        origen.pop();
        destino.push(disco);
        System.out.println("Mover disco " + disco + " de " + nombreOrigen + " a " + nombreDestino);
        origen.mostrar(nombreOrigen);
        destino.mostrar(nombreDestino);
        System.out.println();
    }
}