package ejercicios;

public class romboasteriscos {
    public static void main(String[] args) {

        boolean numeroCorrecto = false;
        int numFilasRombos = 10;

        int numFilas = numFilasRombos / 2 + 1;
        System.out.println(numFilas);

        for (int altura = 1; altura <= numFilas; altura++) {
            //Blancos
            for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
                System.out.print(" ");
            }
            //Asteriscos
            for (int asteriscos = 1; asteriscos <= (2 * altura) - 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        numFilas--;

        for (int altura = 1; altura <= numFilas; altura++) {
            //Blancos
            for (int blancos = 1; blancos <= altura; blancos++) {
                System.out.print(" ");
            }
            //Asteriscos
            for (int asteriscos = 1; asteriscos <= (numFilas - altura) * 2 + 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
