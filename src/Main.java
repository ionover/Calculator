public class Main {

    public static void main(String[] args) {



        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        //если b == 0 мы не можем на неё делить
        //нормальных варианта вроде два if(b==0){"не могу делить на: " + b; return }
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Произошла ошибка: " + e);
        }
        //Вообще потенциально ошибка в каждой их переменных.
        //Вряд ли мы получим хороший int если сложим 2_147_483_647 или вычтем его
    }
}