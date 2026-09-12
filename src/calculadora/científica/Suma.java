package calculadora.científica;

public class Suma extends Operacion{
    @Override
    public boolean ingresar (){
        return super.ingresar();
    }
    @Override
    public void operar() {
        resultado = num1 + num2;
    }
    @Override
    public void imprimir() {
        System.out.println("INGRESO A LA OPCION SUMA");
        super.imprimir();
    }
}

