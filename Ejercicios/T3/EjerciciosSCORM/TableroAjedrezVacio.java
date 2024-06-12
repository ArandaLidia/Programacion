package Scorm;
public class TableroAjedrezVacio {


    public static void main(String args[])
    {
        // Colores de las casillas B&N
        final String CASILLA_NEGRA		= "\u2588";
        final String CASILLA_BLANCA  	= "\u2591";
        final String ESPACIO_EN_BLANCO   = "\u0020";
        // Líneas de la parte de ARRIBA
        final String ARRIBA_IZQUIERDA 	= "\u250C";
        final String ARRIBA 				= "\u252C";
        final String ARRIBA_DERECHA 		= "\u2510";
        // Líneas intermedias
        final String HORIZONTAL 			= "\u2500";
        final String VERTICAL 			= "\u2502";
        final String IZQUIERDA			= "\u251C";
        final String CENTRO 				= "\u253C";
        final String DERECHA 			= "\u2524";
        // Líneas de la parte de ABAJO
        final String ABAJO_IZQUIERDA 	= "\u2514";
        final String ABAJO 				= "\u2534";
        final String ABAJO_DERECHA 		= "\u2518";

        boolean esCasillaBlanca = true;
        String colorSiguienteCasilla;

        // Primera fila superior Fila 8
        System.out.print(ARRIBA_IZQUIERDA + HORIZONTAL );
        System.out.print( HORIZONTAL + ARRIBA + HORIZONTAL);
        System.out.print( HORIZONTAL + ARRIBA + HORIZONTAL);
        System.out.print( HORIZONTAL + ARRIBA + HORIZONTAL);
        System.out.print( HORIZONTAL + ARRIBA + HORIZONTAL);
        System.out.print( HORIZONTAL + ARRIBA + HORIZONTAL);
        System.out.print( HORIZONTAL + ARRIBA + HORIZONTAL);
        System.out.print( HORIZONTAL + ARRIBA + HORIZONTAL);
        System.out.println(HORIZONTAL + ARRIBA_DERECHA);
        // Relleno  Fila 8 Poner ESPACIO_EN_BLANCO
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print(VERTICAL +  colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.println(ESPACIO_EN_BLANCO + VERTICAL);
        // Segunda fila superior Fila 7
        System.out.print(IZQUIERDA + HORIZONTAL );
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.println(HORIZONTAL + DERECHA);

        // Relleno  Fila 7
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print(VERTICAL +  colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.println(ESPACIO_EN_BLANCO + VERTICAL);
        // Segunda fila superior Fila 6
        System.out.print(IZQUIERDA + HORIZONTAL );
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.println(HORIZONTAL + DERECHA);
        // Relleno  Fila 6
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print(VERTICAL +  colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.println(ESPACIO_EN_BLANCO + VERTICAL);
        // Segunda fila superior Fila 5
        System.out.print(IZQUIERDA + HORIZONTAL );
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.println(HORIZONTAL + DERECHA);

        // Relleno  Fila 5
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print(VERTICAL +  colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.println(ESPACIO_EN_BLANCO + VERTICAL);
        // Segunda fila superior Fila 4
        System.out.print(IZQUIERDA + HORIZONTAL );
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.println(HORIZONTAL + DERECHA);

        // Relleno  Fila 4
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print(VERTICAL +  colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.println(ESPACIO_EN_BLANCO + VERTICAL);
        // Segunda fila superior Fila 3
        System.out.print(IZQUIERDA + HORIZONTAL );
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.println(HORIZONTAL + DERECHA);
        // Relleno  Fila 2
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print(VERTICAL +  colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.println(ESPACIO_EN_BLANCO + VERTICAL);
        // Segunda fila superior Fila 7
        System.out.print(IZQUIERDA + HORIZONTAL );
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.println(HORIZONTAL + DERECHA);
        // Relleno  Fila 2
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print(VERTICAL +  colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.println(ESPACIO_EN_BLANCO + VERTICAL);
        // Segunda fila superior Fila 1
        System.out.print(IZQUIERDA + HORIZONTAL );
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.print( HORIZONTAL + CENTRO + HORIZONTAL);
        System.out.println(HORIZONTAL + DERECHA);
        // Relleno  Fila 1
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print(VERTICAL +  colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.print( ESPACIO_EN_BLANCO + VERTICAL + colorSiguienteCasilla);
        colorSiguienteCasilla = (esCasillaBlanca == true) ? CASILLA_BLANCA : CASILLA_NEGRA;
        esCasillaBlanca = !esCasillaBlanca;
        System.out.println(ESPACIO_EN_BLANCO + VERTICAL);
        // Ultima fila inferior Fila 1
        System.out.print(ABAJO_IZQUIERDA + HORIZONTAL );
        System.out.print( HORIZONTAL + ABAJO + HORIZONTAL);
        System.out.print( HORIZONTAL + ABAJO + HORIZONTAL);
        System.out.print( HORIZONTAL + ABAJO + HORIZONTAL);
        System.out.print( HORIZONTAL + ABAJO + HORIZONTAL);
        System.out.print( HORIZONTAL + ABAJO + HORIZONTAL);
        System.out.print( HORIZONTAL + ABAJO + HORIZONTAL);
        System.out.print( HORIZONTAL + ABAJO + HORIZONTAL);
        System.out.print(HORIZONTAL + ABAJO_DERECHA);
    }

}