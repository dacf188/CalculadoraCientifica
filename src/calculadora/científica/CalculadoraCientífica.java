package calculadora.científica;

import java.util.Scanner;

public class CalculadoraCientífica {

    public static void main(String[] args) {
        int opcion = 0;
        //MENÚ DE ELECCIÓN DE USUARIO
        Scanner scanner = new Scanner(System.in);
        Operacion operar = null;
        do {            
            System.out.println("\n___MENU DE OPERACIONES___");
            System.out.println("1. Sumar");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz");
            System.out.println("7. Seno");
            System.out.println("8. Coseno");
            System.out.println("9. Tangente");
            System.out.println("10. Trinomio Cuadrado Perfecto");
            System.out.println("11. Salir");

            opcion = scanner.nextInt();
            operar = null;

            switch (opcion) {
                case 1 -> operar = new Suma();
                case 2 -> operar = new Resta();
                case 3 -> operar = new Multipliacion();
                case 4 -> operar = new Division();
                case 5 -> operar = new Potencia();
                case 6 -> operar = new Raiz();
                case 7 -> operar = new Seno();
                case 8 -> operar = new Coseno();
                case 9 -> operar = new Tangente();
                case 10 -> operar = new TrinomioCuadradoPerfecto();
                case 11-> {
                    System.out.println("Saliendo del programa");
                    break;
                }
                default ->
                    System.out.println("ERROR (SELECCIONE UNA OPCION CORRECTA)");
            }
            if (operar != null) {
                operar.ingresar();
                operar.operar();
                operar.imprimir();
            }
        } while (opcion != 11);
    }
    
}
