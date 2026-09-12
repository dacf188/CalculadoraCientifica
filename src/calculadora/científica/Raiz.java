package calculadora.científica;

public class Raiz extends Operacion{
    @Override
    public boolean ingresar (){
        return super.ingresar();
    }
    @Override
    public void operar() {
        try {
            resultado = Math.sqrt(num1);
            resultado2 = Math.sqrt(num2);
            if (Double.isNaN(resultado) && Double.isNaN(resultado2)) {
                int error = 1 / 0;
            }
        } catch (ArithmeticException e) {
            System.out.println("ERROR DE CALCULO, LOS DOS NUMEROS SON NEGATIVOS");
        }
    }
    @Override
    public void imprimir() {
        if (Double.isNaN(resultado) && Double.isNaN(resultado2)) {
            return;
        }
        System.out.println("INGRESO A LA OPCION RAIZ");
        if (!Double.isNaN(resultado)) {
            super.imprimir();
        } else{
            System.out.println("El primer dato no tiene raiz real");
        }
        if (!Double.isNaN(resultado2)) {
            System.out.println("El resultado de la segunda operacion es: " + resultado2);
        } else {
            System.out.println("El segundo dato no tiene raiz real");
        }
    }
}
