import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String option;
        do {
            System.out.println("Введите первое число: ");
            calculator.setA(console.nextInt());
            System.out.println("Введите знак вычисления: ");
            calculator.setSign(console.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setB(console.nextInt());
            calculator.calculate();
            double showResult = calculator.getResult();
            System.out.println("Результат вычислений =" + (showResult % 1 == 0 ?
                    "\n" + (int) showResult : "\n" + showResult ));
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            option = console.next();
            while (!option.equals("yes")) {
                if (option.equals("no")) {
                    break;
                } {
                    System.out.print("Некорректный ответ. Хотите продолжить вычисления? [yes/no]\n");
                    option = console.next();
                }
            }
        } while (option.equals("yes"));
        System.out.println("Расчёты завершены.");
    }
}