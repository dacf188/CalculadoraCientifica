package calculadora.científica;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Operacion {
    static Scanner scanner = new Scanner(System.in);
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
    
    public boolean ingresar (){
        try {
            System.out.println("Ingrese el primer dato");
            num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo dato");
            num2 = scanner.nextDouble();
            return true;
        } catch (InputMismatchException e) {
            System.out.println("TIPO DE DATO INCORRECTO");
            scanner.nextLine();
            return false;
        }
    }
    //MÉTODO ABSTRACTO
    public abstract void operar ();
    //MÉTODO CONCRETO QUE AL MISMO TIEMPO SE SOBREESCRIBE PERO SE HEREDA
    public void imprimir (){
        System.out.println("El resultado de la operacion es: " + resultado);
    }
}