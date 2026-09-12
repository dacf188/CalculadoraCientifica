package calculadora.científica;

public class Seno extends Operacion{
    @Override
    public boolean ingresar (){
        return super.ingresar();
    }
    @Override
    public void operar() {
        //GRADO SEXAGESIMAL
        resultado = Math.sin(Math.toRadians(num1));
        resultado2 = Math.sin(Math.toRadians(num2));
    }
    @Override
    public void imprimir() {
        System.out.println("INGRESO A LA OPCION SENO");
        super.imprimir();
        System.out.println("El resultado de la segunda operacion es: " + resultado2);
    }
}
