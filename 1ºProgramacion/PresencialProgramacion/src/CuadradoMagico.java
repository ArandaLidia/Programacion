import java.util.*;

public class CuadradoMagico {
    public static int lado, primeraFila, primeraColum, diagonal;
    public static int[][] cuadradoMagico;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique el tamaño del cuadrado");
        lado = scanner.nextInt();
        cuadradoMagico = new int[lado][lado];

        do {
            reset(cuadradoMagico);
            rellenar(cuadradoMagico);
        } while (!comprobacion(cuadradoMagico));

        imprimir(cuadradoMagico);
    }

    // Métodos de relleno

    public static void rellenar(int[][] cuadradoMagico) {
        List<Integer> disponibles = new ArrayList<>();
        for (int i = 1; i <= lado * lado; i++) {
            disponibles.add(i);
        }

        Collections.shuffle(disponibles);

        int index = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                cuadradoMagico[i][j] = disponibles.get(index++);
            }
        }
    }

    // Métodos de comprobación

    public static boolean comprobacion(int[][] cuadradoMagico) {
        primeraFila = 0;
        primeraColum = 0;
        diagonal = 0;

        sumaFila(cuadradoMagico);
        sumaColumna(cuadradoMagico);
        sumaDiagonal(cuadradoMagico);

        return (primeraFila == primeraColum && primeraColum == diagonal);
    }

    public static void sumaFila(int[][] cuadradoMagico) {
        for (int i = 0; i < cuadradoMagico.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                sumaFila += cuadradoMagico[i][j];
            }
            if (i == 0) {
                primeraFila = sumaFila;
            } else if (primeraFila != sumaFila) {
                primeraFila = 0;
                return;
            }
        }
    }

    public static void sumaColumna(int[][] cuadradoMagico) {
        for (int i = 0; i < cuadradoMagico.length; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                sumaColumna += cuadradoMagico[j][i];
            }
            if (i == 0) {
                primeraColum = sumaColumna;
            } else if (primeraColum != sumaColumna) {
                primeraColum = 0;
                return;
            }
        }
    }

    public static void sumaDiagonal(int[][] cuadradoMagico) {
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        for (int i = 0; i < cuadradoMagico.length; i++) {
            sumaDiagonalPrincipal += cuadradoMagico[i][i];
            sumaDiagonalSecundaria += cuadradoMagico[i][cuadradoMagico.length - i - 1];
        }

        diagonal = Math.max(sumaDiagonalPrincipal, sumaDiagonalSecundaria);
    }

    // Imprimir
    public static void imprimir(int[][] cMagico) {
        System.out.println("Cuadrado Mágico:");
        for (int[] fila : cMagico) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }

    // Reset
    public static void reset(int[][] cuadradoMagico) {
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                cuadradoMagico[i][j] = 0;
            }
        }
    }
}
