package calculadora.científica;

public class Division extends Operacion{
    @Override
    public boolean ingresar (){
        return super.ingresar();
    }
    @Override
    public void operar() {
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            // NOT A NUMBER, SIGNIFICA QUE NOS AYUDA A REPRESENTAR UN VALOR NO NUMERICO
            resultado = Double.NaN;
        }
    }
    @Override
    public void imprimir() {
        if (Double.isNaN(resultado)) {
            System.out.println("ERROR (NO SE PUEDE DIVIDIR DENTRO DE 0)");
        } else {
            System.out.println("INGRESO A LA OPCION DIVIDIR");
            super.imprimir();
        }
    }
}
