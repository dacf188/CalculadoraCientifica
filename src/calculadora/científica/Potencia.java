package calculadora.científica;

public class Potencia extends Operacion{
    @Override
    public boolean ingresar (){
        return super.ingresar();
    }
    @Override
    public void operar() {
        resultado = Math.pow(num1, num2);
    }
    @Override
    public void imprimir() {
        System.out.println("INGRESO A LA OPCION POTENCIAS");
        super.imprimir();
    }
}
