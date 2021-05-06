package Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        //Возникала ошибка "ArithmeticException" - деление на ноль недопустимо,
        // теперь вместо ошибки показывает делимое.
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
    }
}
