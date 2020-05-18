package Ejercicio1.Operaciones;

public class OperacionFactory {

    public static Operacion getOperacion(int operacion){
        switch (operacion){
            case Operacion.SUMAR:
                return new Suma();
            case Operacion.RESTAR:
                 return new Resta();
            case Operacion.MULTIPLICAR:
                return new Multiplicacion();
            case Operacion.DIVIDIR:
                return new Division();
            default:
                throw new IllegalArgumentException("Operacion no existe.");
        }
    }
}
