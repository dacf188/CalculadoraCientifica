package calculadora.científica;

public class TrinomioCuadradoPerfecto extends Operacion{
    String resultadoPalabra;
    @Override
    public boolean ingresar (){
        return super.ingresar();
    }
    @Override
    public void operar() {
        try {
            if (Double.isNaN(Math.sqrt(num1)) || Double.isNaN(Math.sqrt(num2))) {
                int error = 1 /0;
            }
            if (Math.sqrt(num1) % 1 != 0 || Math.sqrt(num2) % 1 != 0) {
                int error = 1 /0;
            }
            double raiz1 = Math.sqrt(num1);
            double raiz2 = Math.sqrt(num2);
            //RESULTADO DE LA EXPANSIÓN
            resultado = 2 * raiz1 * raiz2;
            resultadoPalabra = "(" + raiz1 + " + " + raiz2 + ")(" + raiz1 + " - " + raiz2 + ")";
        } catch (ArithmeticException e) {
            resultado = Double.NaN;
            System.out.println("ERROR LAS RAICES NO EXISTEN O NO SON EXACTAS");
        }
    }
    @Override
    public void imprimir (){
        if (!Double.isNaN(resultado)) {
            System.out.println("INGRESO A LA OPCION TRINOMIO CUADRADO PERFECTO");
            super.imprimir();
            System.out.println("Trinomio Cuadrado completo: " + resultadoPalabra);
        }
    }
}
