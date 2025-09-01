package TorreHaroi;

import java.util.Arrays;

public class Torre {
    private int[] discos;

    public Torre(int tamaño) {
        discos = new int[tamaño];
        Arrays.fill(discos, 0);
    }

    public void inicializar() {
        for (int i = 0; i < discos.length; i++) {
            discos[i] = i + 1;
        }
    }

    public int pop() {
        for (int i = 0; i < discos.length; i++) {
            if (discos[i] != 0) {
                int disco = discos[i];
                discos[i] = 0;
                return disco;
            }
        }
        return 0;
    }

    public void push(int disco) {
        for (int i = discos.length - 1; i >= 0; i--) {
            if (discos[i] == 0) {
                discos[i] = disco;
                return;
            }
        }
    }

    public void mostrar(char nombre) {
        System.out.println(nombre + ": " + Arrays.toString(discos));
    }

    public int[] getDiscos() {
        return discos;
    }
}
