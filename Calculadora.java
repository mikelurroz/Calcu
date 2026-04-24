public class Calculadora {

    public int sum(int a, int b){
        return a+b;
    }

    public int mult(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("La suma de los numeros (6,5):" + calc.sum(6, 5));
        System.out.println("La multiplicacion de los numeros (7,9) es: " + calc.mult(7,9));
    }
    
}