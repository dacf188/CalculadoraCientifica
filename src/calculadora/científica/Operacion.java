package calculadora.científica;

import java.util.Scanner;

abstract class Operacion {
    protected double num1;
    protected double num2;
    protected double resultado;
    protected double resultado2;
    
    //CONSTRUCTOR VACÍO
    public Operacion (){
        this.num1 = 0;
        this.num2 = 0;
    }
    //CONSTRUCTOR CON PARAMETROS
    public Operacion (double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    //GETTERS Y SETTERS
    public double getNum1 (double num1){
        return num1;
    }
    public double getNum2 (double num2){
        return num2;
    }
    public void setNum1 (double num1){
        this.num1 = num1;
    }
    public void setNum2 (double num2){
        this.num2 = num2;
    }
    
    public void ingresar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer dato");
        num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo dato");
        num2 = scanner.nextDouble();
    }
    //MÉTODO ABSTRACTO
    public abstract void operar ();
    //MÉTODO CONCRETO QUE AL MISMO TIEMPO SE SOBREESCRIBE PERO SE HEREDA
    public void imprimir (){
        System.out.println("El resultado de la operacion es: " + resultado);
    }
}
class Suma extends Operacion {
    @Override
    public void ingresar (){
        super.ingresar();
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
class Resta extends Operacion {
    @Override
    public void ingresar() {
        super.ingresar();
    }
    @Override
    public void operar() {
        resultado = num1 - num2;
    }
    @Override
    public void imprimir() {
        System.out.println("INGRESO A LA OPCION RESTA");
        super.imprimir();
    }
}

class Multipliacion extends Operacion {
    @Override
    public void ingresar() {
        super.ingresar();
    }
    @Override
    public void operar() {
        resultado = num1 * num2;
    }
    @Override
    public void imprimir() {
        System.out.println("INGRESO A LA OPCION MULTIPLIACION");
        super.imprimir();
    }
}
class Division extends Operacion {
    @Override
    public void ingresar (){
        super.ingresar();
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
        System.out.println("INGRESO A LA OPCION DIVIDIR");
        if (Double.isNaN(resultado)) {
            System.out.println("ERROR (NO SE PUEDE DIVIDIR DENTRO DE 0)");
        } else {
            super.imprimir();
        }
    }
}
class Potencia extends Operacion {
    @Override
    public void ingresar (){
        super.ingresar();
    }
    @Override
    public void operar() {
        resultado = Math.pow(num1, num1);
        resultado2 = Math.pow(num2, num2);
    }
    @Override
    public void imprimir() {
        System.out.println("INGRESO A LA OPCION POTENCIAS");
        super.imprimir();
        System.out.println("El resultado de la segunda operacion es: " + resultado2);
    }
}
class Raiz extends Operacion {
    @Override
    public void ingresar (){
        super.ingresar();
    }
    @Override
    public void operar() {
        resultado = Math.sqrt(num1);
        resultado2 = Math.sqrt(num2);
    }
    @Override
    public void imprimir() {
        System.out.println("INGRESO A LA OPCION RAIZ");
        super.imprimir();
        System.out.println("El resultado de la segunda operacion es: " + resultado2);
    }
}
class Seno extends Operacion {
    @Override
    public void ingresar (){
        super.ingresar();
    }
    @Override
    public void operar() {
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
class Coseno extends Operacion {
    @Override
    public void ingresar (){
        super.ingresar();
    }
    @Override
    public void operar() {
        resultado = Math.cos(Math.toRadians(num1));
        resultado2 = Math.cos(Math.toRadians(num2));
    }
    @Override
    public void imprimir() {
        System.out.println("INGRESO A LA OPCION COSENO");
        super.imprimir();
        System.out.println("El resultado de la segunda operacion es: " + resultado2);
    }
}
class Tangente extends Operacion {
    @Override
    public void ingresar (){
        super.ingresar();
    }
    @Override
    public void operar() {
        resultado = Math.tan(Math.toRadians(num1));
        resultado2 = Math.tan(Math.toRadians(num2));
    }
    @Override
    public void imprimir() {
        System.out.println("INGRESO A LA OPCION TANGENTE");
        super.imprimir();
        System.out.println("El resultado de la segunda operacion es: " + resultado2);
    }
}
class TrinomioCuadradoPerfecto extends Operacion{
    @Override
    public void ingresar (){
        super.ingresar();
    }
    @Override
    public void operar (){
        //RESULTADO DE LA EXPANSIÓN
        resultado = Math.pow(num1, 2) + (2 * num1 * num2) + Math.pow(num2, 2);
        //OTRA MANERA DE HACERLO
        //resultado2 = Math.pow(num1 + num2, 2);
    }
    @Override
    public void imprimir (){
        //SE EVALUA NUMÉRICAMENTE
        //SE BASÓ USANDO (A + B)2 = A2 + 2AB + B2
        //NUM 1 ES A Y NUM2 ES B
        System.out.println("INGRESO A LA OPCION TRINOMIO CUADRADO PERFECTO");
        super.imprimir();
    }
}