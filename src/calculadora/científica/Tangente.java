package calculadora.científica;

public class Tangente extends Operacion{
    @Override
    public boolean ingresar (){
        return super.ingresar();
    }
    //LA TANGENTE DE 90 Y 270 ES INDEFINIDA
    private void validar (double angulo){
        //USAMOS ABS PARA AGARRAR EL VALOR ABSOLUTO ASÍ INCLUIMOS NEGATVIOS Y POSITIVOS
        //% ES LA DIVISIÓN ENTERA, ES DECIR QUE NO PUEDEN QUEDAR DECIMALES
        //SE USA 180° YA QUE CADA 180 GRADOS Y EL RESIDUO ES IGUAL A 90 SE REPITE LA EXCEPCIÓN
        //HACE LO SIGUIENTE EL ANGULO ES DIVIDIDO POR 180 DE MANERA ENTERA SI ESO ES IGUAL A 90, SE EJECUTA EL ERROR DE ABAJO
        if (Math.abs(Math.round(angulo % 180)) == 90) {
            //NO DIVIDIMOS DOUBLE PORQUE DARÍA INFINITO, SE DIVIDEN ENTEROS
            //PARA QUE PROVOQUEN EL ERROR USAMOS ENTEROS, YA QUE ASÍ SALTA LA EXCEPCIÓN
            int error = 1 / 0;
        }
    }
    @Override
    public void operar() {
        try {
            //LOS ANGULOS QUE VA A VALIDAR EL MÉTODO VALIDAR
            validar(num1);
            validar(num2);
            //GRADO SEXAGESIMAL
            resultado = Math.tan(Math.toRadians(num1));
            resultado2 = Math.tan(Math.toRadians(num2));
        } catch (ArithmeticException e) {
            System.out.println("ERROR DE CALCULO");
            //NOT A NUMBER
            resultado = Double.NaN;
            resultado2 = Double.NaN;
        }
    }
    @Override
    public void imprimir() {
        System.out.println("INGRESO A LA OPCION TANGENTE");
        super.imprimir();
        System.out.println("El resultado de la segunda operacion es: " + resultado2);
    }
}
